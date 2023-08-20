package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.dto.CaliforniaRoll;
import patterns.creational.abstract_factory.dto.Sushi;

public class CaliforniaRollFactory extends SushiFactory {
    @Override
    Sushi createSushi() {
        return new CaliforniaRoll();
    }
}
