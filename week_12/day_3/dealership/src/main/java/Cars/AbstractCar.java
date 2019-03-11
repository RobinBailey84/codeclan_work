package Cars;

import Behaviours.IDamaged;
import Components.Wheel;
import Engines.AbstractEngine;

import java.util.ArrayList;

public abstract class AbstractCar implements IDamaged {
    private int unitCost;
    private AbstractEngine engine;
    private ArrayList<Wheel> wheels;
    private ArrayList<IDamaged> damage;

    public AbstractCar(AbstractEngine engine, int unitCost) {
        this.unitCost = unitCost;
        this.engine = engine;
        this.damage = new ArrayList<IDamaged>();
        this.damage.add(engine);
        this.wheels = new ArrayList<Wheel>();
        for (int i = 0; i < 4; i++) {
            Wheel wheel = new Wheel();
            this.wheels.add(wheel);
            this.damage.add(wheel);
        }
    }

    public int getUnitCost() {
        return unitCost;
    }

    public AbstractEngine getEngine() {
        return engine;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public int getRepairCost(){
        int repairCost = 0;
        for (int i = 0; i < damage.size(); i++) {
            if (damage.get(i).worthRepair()){
                repairCost += damage.get(i).getRepairCost();
            } else {
                repairCost += damage.get(i).getUnitCost();
            }
        }
        return repairCost;
    }

    public boolean worthRepair(){
        return getRepairCost() < unitCost;
    }

    public void repair(){
        for (int i = 0; i < damage.size(); i++) {
                damage.get(i).repair();
        }
    }

    public int getValue() {
        return getUnitCost() - getRepairCost();
    }

    public String vroom(){
        return "[vrooms abstractly]";
    }

}
