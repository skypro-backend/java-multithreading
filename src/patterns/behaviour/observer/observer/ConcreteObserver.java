package patterns.behaviour.observer.observer;

// Конкретная реализация наблюдателя
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ": " + message);
    }
}
