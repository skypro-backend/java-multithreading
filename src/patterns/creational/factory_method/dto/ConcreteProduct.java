package patterns.creational.factory_method.dto;

public class ConcreteProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("Денис, где ваше резюме?!");
    }
}
