package Engines;

public class DieselEngine extends AbstractEngine {
    public DieselEngine(int horsepower) {
        super(horsepower);
        setUnitCost(3500);
        setBaseRepairCost(175);
    }
}
