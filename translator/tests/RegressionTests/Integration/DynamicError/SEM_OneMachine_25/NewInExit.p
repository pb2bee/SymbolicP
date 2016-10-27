// P semantics test: one machine, "new" in exit function
event E1 assert 1;
event E2 assert 1;
event E3 assert 1;
event E4 assert 1;
event unit assert 1;

main machine Main {
    var ghost_machine: machine;
    var test: bool;
    start state Real_Init {
        entry {			  
            raise E2;	   
        }
        on E2 goto Real_S1; //exit actions are performed before transition to Real_S1
        exit {
			test = true;
			ghost_machine = new Ghost(this);
        }
    }

    state Real_S1 {
    
		entry {
			assert(test == true);  //holds
			send ghost_machine, E1;
		}
    }
 
}

machine Ghost {
    var real_machine: machine;
    start state Ghost_Init {
        entry (payload: machine) {
	      real_machine = payload;
        }
        on E1 do {assert(false); }
    }
}
