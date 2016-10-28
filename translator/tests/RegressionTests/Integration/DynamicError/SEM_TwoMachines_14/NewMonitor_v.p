// P semantics test: two machines, monitor monitor instantiation parameter
// This is validation test for announceInvocation.p
event E2 assert 1: bool;

main machine Main {
    var test: bool; 
	var ev2: event;
    start state Real1_Init {
        entry { 
			monitor ev2, test;  //"null event" error in Zing
		}
	}
}
spec M monitors E2 {
	start state x {
	}
}
