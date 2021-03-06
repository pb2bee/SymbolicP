using System;
using BDDToZ3Wrap;
using Microsoft.Z3;

#if USE_SYLVAN
using bdd = SylvanSharp.bdd;
using BDDLIB = SylvanSharp.SylvanSharp;
#else
using bdd = BuDDySharp.bdd;
using BDDLIB = BuDDySharp.BuDDySharp;
#endif

/* This class uses concreteValue as a cache for abstract BDD val, since BDD value involves PInvoke for every evaluation */
public struct SymbolicBool {
	bool concreteValue;
	bdd abstractValue;

	public SymbolicBool(bool value) {
		this.concreteValue = value;
		this.abstractValue = null;
	}

	public SymbolicBool(bdd value) {
		this.concreteValue = false;
		this.abstractValue = value;
	}

	public SymbolicBool(BoolExpr value):this(value.ToBDD()) { }


	public bool IsAbstract() {
        return abstractValue != null;
    }

	public bool ConcreteValue {
		get { 
			return concreteValue;
		}
	}

	public bdd AbstractValue { 
		get { 
			return abstractValue;
		} 
	}

	public static implicit operator SymbolicBool(bool value) 
    { 
        return new SymbolicBool(value); 
    }

    private static bdd BDDFromBool(bool b)
    {
    	return b ? bdd.bddtrue : bdd.bddfalse;
    }

	public static SymbolicBool operator ==(SymbolicBool a, SymbolicBool b) 
    { 
    	if(a.IsAbstract()) {
    		if(b.IsAbstract()) {
    			return new SymbolicBool(a.abstractValue.Biimp(b.abstractValue));
    		} else {
    			return new SymbolicBool(a.abstractValue.Biimp(BDDFromBool(b.concreteValue)));
    		}
    	} else {
    		if(b.IsAbstract()) {
    			return new SymbolicBool(BDDFromBool(a.concreteValue).Biimp(b.abstractValue));
			} else {
				return new SymbolicBool(a.concreteValue == b.concreteValue);
			}
    	}
    }

    public static SymbolicBool operator !=(SymbolicBool a, SymbolicBool b) 
    { 
		if(a.IsAbstract()) {
    		if(b.IsAbstract()) {
    			return new SymbolicBool(a.abstractValue.Biimp(b.abstractValue.Not()));
    		} else {
    			return new SymbolicBool(a.abstractValue.Biimp(BDDFromBool(!b.concreteValue)));
    		}
    	} else {
    		if(b.IsAbstract()) {
    			return new SymbolicBool(BDDFromBool(!a.concreteValue).Biimp(b.abstractValue));
			} else {
				return new SymbolicBool(a.concreteValue != b.concreteValue);
			}
    	}    
    }

	public static SymbolicBool operator &(SymbolicBool a, SymbolicBool b) 
	{ 
		if(a.IsAbstract()) {
			if(b.IsAbstract()) {
				return new SymbolicBool(a.abstractValue.And(b.abstractValue));
			} else {
				return new SymbolicBool(a.abstractValue.And(BDDFromBool(b.concreteValue)));
			}
		} else {
			if(b.IsAbstract()) {
				return new SymbolicBool(BDDFromBool(a.concreteValue).And(b.abstractValue));
			} else {
				return new SymbolicBool(a.concreteValue & b.concreteValue);
			}
		}
	}

	public static SymbolicBool operator |(SymbolicBool a, SymbolicBool b) 
	{ 
		if(a.IsAbstract()) {
			if(b.IsAbstract()) {
				return new SymbolicBool(a.abstractValue.Or(b.abstractValue));
			} else {
				return new SymbolicBool(a.abstractValue.Or(BDDFromBool(b.concreteValue)));
			}
		} else {
			if(b.IsAbstract()) {
				return new SymbolicBool(BDDFromBool(a.concreteValue).Or(b.abstractValue));
			} else {
				return new SymbolicBool(a.concreteValue | b.concreteValue);
			}
		}
	}

	public static SymbolicBool operator !(SymbolicBool a) 
	{ 
		if(a.IsAbstract()) {
			return new SymbolicBool(a.abstractValue.Not());
		} else {
			return new SymbolicBool(!a.concreteValue);
		}    
	}

	public override string ToString ()
	{
		return string.Format ("[SymbolicBool: ConcreteValue={0}, AbstractValue={1}]", ConcreteValue, AbstractValue);
	}
}