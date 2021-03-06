using System;
using System.Collections.Generic;

public class PList<T> : List<T>, IPType<PList<T>> where T : IPType<T>
{
    public new ValueSummary<PInteger> Count
    {
        get
        {
            return this._count.Cast<PInteger>(_ => (PInteger)_);
        }
    }

    public void Insert(ValueSummary<PTuple<PInteger, T>> t)
    {
        this.Insert(t.GetField<PInteger>(_ => _.Item1).Cast<SymbolicInteger>(_ => (SymbolicInteger)_), t.GetField<T>(_ => _.Item2));
    }

    public void RemoveAt(ValueSummary<PInteger> idx)
    {
        this.RemoveAt(idx.Cast<SymbolicInteger>(_ => (SymbolicInteger)_));
    }

    public ValueSummary<T> this[ValueSummary<PInteger> index]
    {
        get
        {
            var vs_cond_14 = (index.InvokeBinary<PInteger, PBool>((l, r) => l >= r, this.Count)).Cond();
            {
                if (vs_cond_14.CondTrue())
                {
                    throw new IndexOutOfRangeException();
                }
            }

            vs_cond_14.MergeBranch();
            return this.data.GetIndex<T>(index);
        }

        set
        {
            var vs_cond_15 = (index.InvokeBinary<PInteger, PBool>((l, r) => l >= r, this.Count)).Cond();
            {
                if (vs_cond_15.CondTrue())
                {
                    throw new IndexOutOfRangeException();
                }
            }

            vs_cond_15.MergeBranch();
            this.data.SetIndex<T>(index, value);
        }
    }

    public ValueSummary<PList<T>> DeepCopy()
    {
        ValueSummary<PList<T>> ret = new ValueSummary<PList<T>>(new PList<T>());
        var vs_cond_16 = PathConstraint.BeginLoop();
        for (ValueSummary<SymbolicInteger> i = (SymbolicInteger)0; vs_cond_16.Loop(i.InvokeBinary<int, SymbolicBool>((l, r) => l < r, this._count)); i.Increment())
        {
            ret.InvokeMethod<T>((_, a0) => _.Add(a0), this[i].InvokeMethod((_) => _.DeepCopy()));
        }

        vs_cond_16.MergeBranch();
        return ret;
    }

    public ValueSummary<SymbolicBool> PTypeEquals(ValueSummary<PList<T>> other)
    {
        var _frame_pc = PathConstraint.GetPC();
        var vs_ret_3 = new ValueSummary<SymbolicBool>();
        var vs_cond_18 = (this._count.InvokeBinary<int, bool>((l, r) => l != r, other.GetField<int>(_ => _._count))).Cond();
        {
            if (vs_cond_18.CondTrue())
            {
                PathConstraint.RecordReturnPath(vs_ret_3, (SymbolicBool)false, vs_cond_18);
            }
        }

        if (vs_cond_18.MergeBranch())
        {
            var vs_cond_19 = PathConstraint.BeginLoop();
            for (ValueSummary<int> i = 0; vs_cond_19.Loop(i.InvokeBinary<int, bool>((l, r) => l < r, this._count)); i.Increment())
            {
                var vs_cond_17 = (this[i].InvokeMethod<T, SymbolicBool>((_, a0) => _.PTypeEquals(a0), other.InvokeMethod<int, T>((_, a0) => _[a0], i)).InvokeUnary<SymbolicBool>(_ => !_)).Cond();
                {
                    if (vs_cond_17.CondTrue())
                    {
                        PathConstraint.RecordReturnPath(vs_ret_3, (SymbolicBool)false, vs_cond_17);
                    }
                }

                vs_cond_17.MergeBranch(vs_cond_19);
            }

            if (vs_cond_19.MergeBranch())
            {
                PathConstraint.RecordReturnPath(vs_ret_3, (SymbolicBool)true);
            }
        }

        PathConstraint.RestorePC(_frame_pc);
        return vs_ret_3;
    }
}