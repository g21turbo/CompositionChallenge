import java.security.interfaces.DSAKey;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private Refrigerator refrigerator;
    private DishWasher dishWasher;


    public SmartKitchen() {
        coffeeMaker = new CoffeeMaker();
        refrigerator = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}
