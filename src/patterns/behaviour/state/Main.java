package patterns.behaviour.state;

import patterns.behaviour.state.state.ConcreteStateA;
import patterns.behaviour.state.state.ConcreteStateB;
import patterns.behaviour.state.state.State;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();

        context.setState(stateA);
        context.request(); // Handling State A

        context.setState(stateB);
        context.request(); // Handling State B
    }
}

