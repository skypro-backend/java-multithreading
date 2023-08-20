package patterns.behaviour.strategy.strategy;

// Конкретная стратегия сложения
public class AddStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
