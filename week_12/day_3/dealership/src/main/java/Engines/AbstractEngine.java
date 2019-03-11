package Engines;

import Behaviours.IDamaged;

public abstract class AbstractEngine implements IDamaged {
    private int unitCost;
    private int damageRating;
    private int baseRepairCost;
    private int horsepower;

    public AbstractEngine(int horsepower) {
        this.horsepower = horsepower;
        this.unitCost = 0;
        this.damageRating = 0;
        this.baseRepairCost = 0;
    }

    public int getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(int unitCost) {
        this.unitCost = unitCost;
    }

    public int getDamageRating() {
        return damageRating;
    }

    public int getBaseRepairCost() {
        return baseRepairCost;
    }

    public void setBaseRepairCost(int baseRepairCost) {
        this.baseRepairCost = baseRepairCost;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getRepairCost(){
        return baseRepairCost * damageRating * damageRating;
    }

    public boolean worthRepair(){
        return getRepairCost() < unitCost;
    }

    public void crash(int severity){
        this.damageRating += severity;
    }

    public void repair(){
        this.damageRating = 0;
    }

    public int getValue() {
        return getUnitCost() - getRepairCost();
    }

}
