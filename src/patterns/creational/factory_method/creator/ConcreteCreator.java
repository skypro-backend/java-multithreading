package patterns.creational.factory_method.creator;


import patterns.creational.factory_method.dto.ConcreteProduct;
import patterns.creational.factory_method.dto.Product;

public class ConcreteCreator extends Creator {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
