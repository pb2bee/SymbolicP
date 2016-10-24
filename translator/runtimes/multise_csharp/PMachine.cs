using System;
using System.Collections.Generic;

abstract class PMachine : IPType<PMachine>
{
    protected delegate void TransitionFunction(ValueSummary<IPType> payload);
    protected delegate void ExitFunction();
    protected ValueSummary<int> retcode = new ValueSummary<int>(default (int));
    protected ValueSummary<List<int>> states = new ValueSummary<List<int>>(new List<int>());
    protected Scheduler scheduler;
    protected bool[, ] DeferedSet;
    protected bool[, ] IsGotoTransition;
    protected TransitionFunction[, ] Transitions;
    protected ExitFunction[] ExitFunctions;
    public List<SendQueueItem> sendQueue = new List<SendQueueItem>();
    public virtual void StartMachine(ValueSummary<Scheduler> s, ValueSummary<IPType> payload)
    {
        this.scheduler = s;
    }

    /* Returns the index that can serve this event */
    public ValueSummary<int> CanServeEvent(ValueSummary<PInteger> e)
    {
        PathConstraint.PushFrame();
        var vs_ret_1 = new ValueSummary<int>();
        var vs_cond_19 = PathConstraint.BeginLoop();
        for (ValueSummary<int> i = 0; vs_cond_19.Loop(i.InvokeBinary<int, bool>((l, r) => l < r, this.states.GetField<int>(_ => _.Count))); i.Increment())
        {
            ValueSummary<bool> vs_lgc_tmp_0;
            ValueSummary<int> state = this.states.InvokeMethod<int, int>((_, a0) => _[a0], i);
            var vs_cond_18 = ((new Func<ValueSummary<bool>>(() =>
            {
                var vs_cond_37 = ((vs_lgc_tmp_0 = ValueSummary<bool>.InitializeFrom(this.DeferedSet.GetIndex(state, e).InvokeUnary<bool>(_ => !_)))).Cond();
                var vs_cond_ret_37 = new ValueSummary<bool>();
                if (vs_cond_37.CondTrue())
                    vs_cond_ret_37.Merge(vs_lgc_tmp_0.InvokeBinary<bool, bool>((l, r) => l & r, this.Transitions.GetIndex(state, e).InvokeBinary<PMachine.TransitionFunction, bool>((l, r) => l != r, new ValueSummary<PMachine.TransitionFunction>(null))));
                if (vs_cond_37.CondFalse())
                    vs_cond_ret_37.Merge(vs_lgc_tmp_0);
                vs_cond_37.MergeBranch();
                return vs_cond_ret_37;
            }

            )())).Cond();
            {
                if (vs_cond_18.CondTrue())
                {
                    PathConstraint.RecordReturnPath(vs_ret_1, i, vs_cond_18);
                }
            }

            vs_cond_18.MergeBranch(vs_cond_19);
        }

        if (vs_cond_19.MergeBranch())
        {
            PathConstraint.RecordReturnPath(vs_ret_1, -1);
        }

        PathConstraint.PopFrame();
        return vs_ret_1;
    }

    protected void RaiseEvent(ValueSummary<PInteger> e, ValueSummary<IPType> payload)
    {
        PathConstraint.PushFrame();
        var vs_cond_21 = PathConstraint.BeginLoop();
        for (ValueSummary<int> i = 0; vs_cond_21.Loop(i.InvokeBinary<int, bool>((l, r) => l < r, this.states.GetField<int>(_ => _.Count))); i.Increment())
        {
            ValueSummary<int> state = this.states.InvokeMethod<int, int>((_, a0) => _[a0], i);
            var vs_cond_20 = (this.Transitions.GetIndex(state, e).InvokeBinary<PMachine.TransitionFunction, bool>((l, r) => l != r, new ValueSummary<PMachine.TransitionFunction>(null))).Cond();
            {
                if (vs_cond_20.CondTrue())
                {
                    this.RunStateMachine(i, e, payload);
                    PathConstraint.RecordReturnPath(vs_cond_20);
                }
            }

            vs_cond_20.MergeBranch(vs_cond_21);
        }

        if (vs_cond_21.MergeBranch())
        {
            throw new SystemException("Unhandled event");
        }

        PathConstraint.PopFrame();
    }

    protected void SendMsg(ValueSummary<PMachine> other, ValueSummary<PInteger> e, ValueSummary<IPType> payload)
    {
        this.scheduler.SendMsg(this, other, e, payload);
    }

    protected ValueSummary<PMachine> NewMachine(ValueSummary<PMachine> newMachine, ValueSummary<IPType> payload)
    {
        this.scheduler.NewMachine(this, newMachine, payload);
        return newMachine;
    }

    protected void PopState()
    {
        this.retcode.Assign<int>(Constants.EXECUTE_FINISHED);
        ValueSummary<int> current_state = this.states.InvokeMethod<int, int>((_, a0) => _[a0], 0);
        this.states.InvokeMethod<SymbolicInteger>((_, a0) => _.RemoveAt(a0), (SymbolicInteger)0);
        var vs_cond_22 = (this.ExitFunctions.GetIndex(current_state).InvokeBinary<PMachine.ExitFunction, bool>((l, r) => l != r, new ValueSummary<PMachine.ExitFunction>(null))).Cond();
        {
            if (vs_cond_22.CondTrue())
            {
                this.ExitFunctions.GetIndex(current_state).Invoke();
            }
        }

        vs_cond_22.MergeBranch();
    }

    protected ValueSummary<PBool> RandomBool()
    {
        return this.scheduler.RandomBool().Cast<PBool>(_ => (PBool)_);
    }

    protected void Assert(ValueSummary<PBool> cond, ValueSummary<string> msg)
    {
        var vs_cond_23 = (cond.InvokeUnary<PBool>(_ => !_)).Cond();
        {
            if (vs_cond_23.CondTrue())
            {
                throw new SystemException(msg);
            }
        }

        vs_cond_23.MergeBranch();
    }

    protected void Assert(ValueSummary<PBool> cond)
    {
        var vs_cond_24 = (cond.InvokeUnary<PBool>(_ => !_)).Cond();
        {
            if (vs_cond_24.CondTrue())
            {
                throw new SystemException("Assertion failure");
            }
        }

        vs_cond_24.MergeBranch();
    }

    public void RunStateMachine(ValueSummary<int> state_idx, ValueSummary<PInteger> e, ValueSummary<IPType> payload)
    {
        ValueSummary<int> state = this.states.InvokeMethod<int, int>((_, a0) => _[a0], state_idx);
        var vs_cond_25 = (this.IsGotoTransition.GetIndex(state, e)).Cond();
        {
            if (vs_cond_25.CondTrue())
            {
                this.states.InvokeMethod<int, int>((_, a0, a1) => _.RemoveRange(a0, a1), 0, state_idx);
            }
        }

        vs_cond_25.MergeBranch();
        this.retcode.Assign<int>(Constants.EXECUTE_FINISHED);
        ValueSummary<TransitionFunction> transition_fn = this.Transitions.GetIndex(state, e);
#if LOG_TRANSITIONS
		Console.WriteLine("{0}@{1} takes {2}", this, this.GetHashCode(), transition_fn);
#endif
        transition_fn.Invoke(payload);
    }

    protected void Transition_Ignore(ValueSummary<IPType> payload)
    {
        return;
    }

    public ValueSummary<PMachine> DeepCopy()
    {
        return this;
    }

    public ValueSummary<SymbolicBool> PTypeEquals(ValueSummary<PMachine> other)
    {
        return other.InvokeBinary<object, SymbolicBool>((l, r) => l == r, this);
    }
}