package patterns.structural.decorator.components;

// Конкретный декоратор
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        additionalOperationB();
    }

    private void additionalOperationB() {
        System.out.println("Дополнительная операция Б");
    }
}
