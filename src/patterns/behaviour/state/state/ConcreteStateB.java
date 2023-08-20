package patterns.behaviour.state.state;

public class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("Handling State B");
    }
}
