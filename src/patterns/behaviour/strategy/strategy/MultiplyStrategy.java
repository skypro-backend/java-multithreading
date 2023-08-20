package patterns.behaviour.strategy.strategy;

// Конкретная стратегия умножения
public class MultiplyStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
