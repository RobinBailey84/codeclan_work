package People;

import Behaviours.IDamaged;
import Cars.AbstractCar;

import java.util.ArrayList;

public class Customer {
    private ArrayList<AbstractCar> cars;
    private int money;

    public Customer(int money) {
        this.money = money;
        this.cars = new ArrayList<AbstractCar>();
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

    public void repairItem(IDamaged item, Dealership dealership){
        if (dealership.repairPrice(item) <= money){
            money -= dealership.repairPrice(item);
            dealership.chargeRepair(item);
        }
    }

    public void buyCar(AbstractCar car, Dealership dealership){
        if (dealership.salePrice(car) <= money){
            if (dealership.chargeSale(car)){
                addCar(car);
                money -= dealership.salePrice(car);
            }
        }
    }

    public void sellCar(AbstractCar car, Dealership dealership){
        if (dealership.chargePurchase(car)){
            money += dealership.purchasePrice(car);
            removeCar(car);
        }
    }
}
