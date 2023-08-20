package patterns.structural.decorator;


import patterns.structural.decorator.components.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты компонента и декораторов
        Component component = new ConcreteComponent();
        Component decoratorA = new ConcreteDecoratorA(component);
        Component decoratorB = new ConcreteDecoratorB(decoratorA);

        // Вызываем операцию, которая будет выполнена и базовым компонентом, и всеми декораторами
        decoratorB.operation();
    }
}
