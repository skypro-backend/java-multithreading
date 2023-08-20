package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.dto.PhiladelphiaRoll;
import patterns.creational.abstract_factory.dto.Sushi;

public class PhiladelphiaRollFactory extends SushiFactory {
    @Override
    Sushi createSushi() {
        return new PhiladelphiaRoll();
    }
}
