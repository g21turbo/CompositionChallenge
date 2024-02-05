public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.refrigerator.isHasToDoWork();
        smartKitchen.refrigerator.orderFood();

        smartKitchen.dishWasher.isHasToDoWork();
        smartKitchen.dishWasher.doDishes();

        smartKitchen.brewMaster.isHasToDoWork();
        smartKitchen.brewMaster.brewCoffee();

    }
}