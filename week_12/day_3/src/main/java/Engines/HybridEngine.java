package Engines;

public class HybridEngine extends AbstractEngine {
    public HybridEngine(int horsepower) {
        super(horsepower);
        setUnitCost(7000);
        setBaseRepairCost(300);
    }
}
