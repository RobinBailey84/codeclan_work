package Cars;

import Engines.DieselEngine;

public class DieselCar extends AbstractCar {
    public DieselCar(DieselEngine engine, int unitCost) {
        super(engine, unitCost);
    }

    @Override
    public String vroom() {
        return "vrrrmmmmm";
    }
}
