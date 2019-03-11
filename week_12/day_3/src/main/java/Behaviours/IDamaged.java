package Behaviours;

public interface IDamaged {
    int getRepairCost();
    boolean worthRepair();
    int getUnitCost();
    void repair();
    int getValue();
}
