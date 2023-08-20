package patterns.creational.factory_method.creator;

import patterns.creational.factory_method.dto.Product;

public abstract class Creator {
    // Фабричный метод
    abstract Product factoryMethod();

    void someOperation() {
        Product product = factoryMethod();
    }
}
