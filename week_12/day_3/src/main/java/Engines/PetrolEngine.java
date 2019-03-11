package Engines;

import Engines.AbstractEngine;

public class PetrolEngine extends AbstractEngine {
    public PetrolEngine(int horsepower) {
        super(horsepower);
        setUnitCost(3000);
        setBaseRepairCost(150);
    }
}
