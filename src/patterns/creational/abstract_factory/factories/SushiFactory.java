package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.dto.Sushi;

public abstract class SushiFactory {
    abstract Sushi createSushi();
}