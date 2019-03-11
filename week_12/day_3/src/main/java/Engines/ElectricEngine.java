package Engines;

public class ElectricEngine extends AbstractEngine {
    public ElectricEngine(int horsepower) {
        super(horsepower);
        setUnitCost(5000);
        setBaseRepairCost(250);
    }
}
