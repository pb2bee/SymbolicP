#if RANDOM_SCHEDULER
partial class Scheduler {
	private SchedulerChoice ChooseMachine() {
	    List<SchedulerChoice> choices = new List<SchedulerChoice>();
		for(int i=0; i < this.machines.Count; i++) {
	        PMachine machine = machines[i];
	        // Collect from send queue
	        List<SendQueueItem> sendQueue = machine.sendQueue;
	        bool do_loop = true;
			for(int j=0; do_loop && j < sendQueue.Count; j++) {
	            SendQueueItem item = sendQueue[j];
	            if(item.e == Constants.EVENT_NEW_MACHINE) {
	                choices.Add(new SchedulerChoice(machine, j, -1));
	                do_loop = false;
	            } else {
					int state_idx = item.target.CanServeEvent(item.e);
	                if (state_idx >= 0) {
	                    choices.Add(new SchedulerChoice(machine, j, state_idx));
	                    do_loop = false;
	                }
	            }
	        }
	        // Machine is state that can serve null event?
			int null_state_idx = machine.CanServeEvent(Constants.EVENT_NULL);
	        if(null_state_idx >= 0) {
	            choices.Add(new SchedulerChoice(machine, -1, null_state_idx));
	        }
	    }
	    if(choices.Count == 0) {
	    	return null;
	    }
        // Choose one and remove from send queue
        SymbolicInteger idx = SymbolicEngine.SE.NewSymbolicIntVar("SI", 0, choices.Count);
        return choices[idx];
	}
}
#endif