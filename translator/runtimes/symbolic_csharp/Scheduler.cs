using System;
using System.Collections.Generic;
using System.Diagnostics;
using Microsoft.Z3;

class Scheduler {

    private class SchedulerChoice {
        public PMachine sourceMachine;
        public int sourceMachineSendQueueIndex;
        public int targetMachineStateIndex;

        public SchedulerChoice(PMachine sourceMachine, int sourceMachineSendQueueIndex, int targetMachineStateIndex) {
            this.sourceMachine = sourceMachine;
            this.sourceMachineSendQueueIndex = sourceMachineSendQueueIndex;
            this.targetMachineStateIndex = targetMachineStateIndex;
        }
    }

    Random rng;

    List<PMachine> machines = new List<PMachine>();

    public Scheduler() : this(new Random()) {
        
    }

    public Scheduler(Random rng) {
        this.rng = rng;
    }

    private bool ChooseAndRunMachine() {
        // Collect all servable events
        List<SchedulerChoice> choices = new List<SchedulerChoice>();
		for(SymbolicInteger i=0; i < this.machines.Count; i++) {
            PMachine machine = machines[i];
            // Collect from send queue
            List<SendQueueItem> sendQueue = machine.sendQueue;
			for(SymbolicInteger j=0; j < sendQueue.Count; j++) {
                SendQueueItem item = sendQueue[j];
                if(item.e == Constants.EVENT_NEW_MACHINE) {
                    choices.Add(new SchedulerChoice(machine, j, -1));
                    break;
                } else {
					SymbolicInteger state_idx = item.target.CanServeEvent(item.e);
                    if (state_idx >= 0) {
                        choices.Add(new SchedulerChoice(machine, j, state_idx));
                        break;
                    }
                }
            }
            // Machine is state that can serve null event?
			SymbolicInteger null_state_idx = machine.CanServeEvent(Constants.EVENT_NULL);
            if(null_state_idx >= 0) {
                Debugger.Break();
                choices.Add(new SchedulerChoice(machine, -1, null_state_idx));
            }
        }
        if(choices.Count == 0) {
            return false;
        }

        // Choose one and remove from send queue
		var idx = SymbolicEngine.SE.NewSymbolicIntVar("SI", 0, choices.Count);
        SchedulerChoice chosen = choices[idx];
		SymbolicInteger sourceMachineSendQueueIndex = chosen.sourceMachineSendQueueIndex;
        if (sourceMachineSendQueueIndex < 0) {
            PMachine chosenTargetMachine = chosen.sourceMachine;
            Console.WriteLine(chosenTargetMachine.ToString() + chosenTargetMachine.GetHashCode() + " executes EVENT_NULL");
            chosenTargetMachine.RunStateMachine(chosen.targetMachineStateIndex, Constants.EVENT_NULL, null);
        } else {
            PMachine chosenSourceMachine = chosen.sourceMachine;
            SendQueueItem dequeuedItem = chosenSourceMachine.sendQueue[sourceMachineSendQueueIndex];
            chosenSourceMachine.sendQueue.RemoveAt(sourceMachineSendQueueIndex);
            // Invoke Machine
            if(dequeuedItem.e == Constants.EVENT_NEW_MACHINE) {
                PMachine newMachine = dequeuedItem.target;
                Console.WriteLine(chosenSourceMachine.ToString() + chosenSourceMachine.GetHashCode() + " creates " + newMachine.ToString() + chosenSourceMachine.GetHashCode());
                this.StartMachine(newMachine, dequeuedItem.payload);
            } else{
                PMachine targetMachine = dequeuedItem.target;
                Console.WriteLine(chosenSourceMachine.ToString() + chosenSourceMachine.GetHashCode() + " sends event " + dequeuedItem.e.ToString() + " to " + targetMachine.ToString() + targetMachine.GetHashCode());
                targetMachine.RunStateMachine(chosen.targetMachineStateIndex, dequeuedItem.e, dequeuedItem.payload);
            }
        }
        return true;
    }

    public void SendMsg(PMachine source, PMachine target, PInteger e, IPType payload) {
        source.sendQueue.Add(new SendQueueItem(target, e, payload));
    }

    public void NewMachine(PMachine source, PMachine newMachine, IPType payload) {
        source.sendQueue.Add(new SendQueueItem(newMachine, Constants.EVENT_NEW_MACHINE, payload));
    }

	public SymbolicBool RandomBool() {
		return SymbolicEngine.SE.NewSymbolicBoolVar ("RB");
    }

    private void StartMachine(PMachine machine, IPType payload) {
        this.machines.Add(machine);
        machine.StartMachine(this, payload);
    }

    static int Main(string[] args) {
        int maxExplorationSteps = 100;
        Random rng = new Random();

        int iteration = 0;
		while(true) {
            Console.WriteLine(String.Format("========BEGIN NEW TRACE {0}=========", iteration));
            Scheduler scheduler = new Scheduler(rng);

            PMachine mainMachine = MachineController.CreateMainMachine();
            scheduler.StartMachine(mainMachine, null);

            for(int i=0; i < maxExplorationSteps; i++) { 
                if(!scheduler.ChooseAndRunMachine()) {
                    break;
                }
            }
            Console.WriteLine("===========END TRACE===========");
            iteration ++;
			if (!SymbolicEngine.SE.Reset ()) {
				break;
			}
        }
        return 0;
    }
}