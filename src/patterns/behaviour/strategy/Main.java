package patterns.behaviour.strategy;

import patterns.behaviour.strategy.strategy.AddStrategy;
import patterns.behaviour.strategy.strategy.MultiplyStrategy;
import patterns.behaviour.strategy.strategy.SubtractStrategy;

// Пример использования
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        int result = context.executeStrategy(10, 5);
        System.out.println(result); // Output: 15

        context = new Context(new SubtractStrategy());
        result = context.executeStrategy(10, 5);
        System.out.println(result); // Output: 5

        context = new Context(new MultiplyStrategy());
        result = context.executeStrategy(10, 5);
        System.out.println(result); // Output: 50
    }
}
