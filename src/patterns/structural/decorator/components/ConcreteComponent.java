package patterns.structural.decorator.components;

// Конкретный класс, реализующий базовый функционал
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Основная операция");
    }
}
