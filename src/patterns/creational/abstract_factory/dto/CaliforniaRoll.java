package patterns.creational.abstract_factory.dto;

import patterns.creational.abstract_factory.Main;

public class CaliforniaRoll implements Sushi {
    @Override
    public void eat() {
        System.out.println("Eating California Roll");
    }
}