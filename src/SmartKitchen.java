import java.security.interfaces.DSAKey;

public class SmartKitchen {

    CoffeeMaker brewMaster = new CoffeeMaker();
    Refrigerator refrigerator = new Refrigerator();
    DishWasher dishWasher = new DishWasher();

    public void addWater() {
        brewMaster.isHasToDoWork();
    }

    public void pourMilk() {
        refrigerator.isHasToDoWork();
    }

    public void loadDishwasher () {
        dishWasher.isHasToDoWork();
    }
}
