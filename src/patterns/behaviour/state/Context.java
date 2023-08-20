package patterns.behaviour.state;

import patterns.behaviour.state.state.State;

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}
