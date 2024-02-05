public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getRefrigerator().orderFood();

    }
}