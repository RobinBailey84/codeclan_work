package Components;

import Behaviours.IDamaged;

public class Wheel implements IDamaged {
    private int unitCost;
    private int damageRating;
    private int baseRepairCost;

    public Wheel() {
        this.unitCost = 300;
        this.damageRating = 0;
        this.baseRepairCost = 50;
    }

    public int getRepairCost(){
        return baseRepairCost * damageRating * damageRating;
    }

    public boolean worthRepair(){
        return getRepairCost() < unitCost;
    }

    public int getUnitCost() {
        return unitCost;
    }

    public int getDamageRating() {
        return damageRating;
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
