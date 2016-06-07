#include "pingpong_Macros.h"


class MachineClient extends PMachine {
    /* P local vars */
    PMachine server;

    public MachineClient() {
        state = MachineClient_STATE_Init;
        InitEntry();
    }
    public void InitEntry() {
        this.server = new MachineServer();
        Scheduler.machines.add(server);
        Init_RaiseEvent(SUCCESS); return;
    }
    public void SendPingEntry() {
        SendMsg(this.server, PING, this);
        SendPing_RaiseEvent(SUCCESS); return;
    }
    public void Init_RaiseEvent(int e) {        
        if (e == SUCCESS) {
            this.state = MachineClient_STATE_SendPing;
            this.SendPingEntry();
        } else {
            throw new RuntimeException("Unhandled Event");
        }
    }
    public void SendPing_RaiseEvent(int e) {
        if (e == SUCCESS) {
            this.state = MachineClient_STATE_WaitPong;
        } else {
            throw new RuntimeException("Unhandled Event");
        }
    }
}