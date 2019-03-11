package Cars;

import Engines.HybridEngine;

public class HybridCar extends AbstractCar {
    public HybridCar(HybridEngine engine, int unitCost) {
        super(engine, unitCost);
    }

    @Override
    public String vroom() {
        return "whirrrr";
    }
}