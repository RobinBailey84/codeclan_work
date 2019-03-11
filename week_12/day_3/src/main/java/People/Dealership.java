package People;

import Behaviours.IDamaged;
import Cars.AbstractCar;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<AbstractCar> cars;
    private int money;
    private int margin;

    public Dealership(int money) {
        this.money = money;
        this.cars = new ArrayList<AbstractCar>();
        this.margin = 20;
    }

    public int getMargin() {
        return margin;
    }

    public int salePrice(IDamaged item){
        return item.getValue() * ((100 + getMargin())/100);
    }

    public int purchasePrice(IDamaged item){
        return item.getValue() * ((100 - getMargin())/100);
    }

    public int repairPrice(IDamaged item){
        return item.getRepairCost() * ((100 + getMargin())/100);
    }

    public void addCar(AbstractCar car){
        this.cars.add(car);
    }

    public void removeCar(AbstractCar car){
        this.cars.remove(car);
    }


    public ArrayList<AbstractCar> getCars() {
        return cars;
    }

    public int getMoney() {
        return money;
    }

    public void repairCar(AbstractCar car){
        if (car.getRepairCost() <= money){
            money -= car.getRepairCost();
            car.repair();
        }
    }

    public void buyCar(AbstractCar car){
        if (car.getValue() <= money){
            money -= car.getValue();
            addCar(car);
        }
    }

    public void chargeRepair(IDamaged item){
        money += repairPrice(item);
        money -= item.getRepairCost();
        item.repair();
    }

    public boolean chargeSale(AbstractCar car) {
        if (this.cars.remove(car)){
            money += salePrice(car);
            return true;
        }
        return false;
    }

    public boolean chargePurchase(AbstractCar car){
        if (purchasePrice(car) <= getMoney()){
            money -= purchasePrice(car);
            addCar(car);
            return true;
        }
        return false;
    }
}
