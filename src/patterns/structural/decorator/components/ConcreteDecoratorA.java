package patterns.structural.decorator.components;

// Конкретный декоратор
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        additionalOperationA();
    }

    private void additionalOperationA() {
        System.out.println("Дополнительная операция А");
    }
}
