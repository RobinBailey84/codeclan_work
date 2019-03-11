package Cars;

import Engines.ElectricEngine;

public class ElectricCar extends AbstractCar {
    public ElectricCar(ElectricEngine engine, int unitCost) {
        super(engine, unitCost);
    }

    @Override
    public String vroom() {
        return "bzzzzz";
    }
}
