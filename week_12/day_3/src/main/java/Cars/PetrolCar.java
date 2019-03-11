package Cars;

import Engines.PetrolEngine;

public class PetrolCar extends AbstractCar {
    public PetrolCar(PetrolEngine engine, int unitCost) {
        super(engine, unitCost);
    }

    @Override
    public String vroom() {
        return "Vroom.";
    }
}
