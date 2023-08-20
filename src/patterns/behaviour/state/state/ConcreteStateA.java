package patterns.behaviour.state.state;

public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("Handling State A");
    }
}
