// P semantics test: two machines, "send", "raise", announce invocation for non-constant event expressions

event E1;
event E2 : int;
event E3;


fun sealwithRTC()
[invokescheduler = sealRTC]{}

fun unsealwithRTC()
[invokescheduler = unsealRTC]{}

fun sealwithRR()
[invokescheduler = sealRR]{}

fun unsealwithRR()
[invokescheduler = unsealRR]{}


main machine Main {
   var m2_id : machine;
   var m3_id : machine;

   start state S1 {
   	entry {
   		m3_id = new M3();
   		m2_id = new M2(m3_id);

   		sealwithRTC();
   		send m2_id, E1;
   		unsealwithRTC();
   		send m3_id, E3;
   		
   	}
   }
	
}


machine M2 {
	var m3_id : machine;
	start state S1 {
		entry (payload: machine){
			m3_id = payload;
		}
		on E1 do { send m3_id, E2, 3; }
	}
}

machine M3
{
	var x : int;
    start state S1
    {
    	entry {
    		x =  100;
    	}
        on E2 do (p : int){ x = p;}
        on E3 do { assert x == 3;} //this assertion should never fail
    }

}
