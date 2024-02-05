public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

//        smartKitchen.getRefrigerator().setHasWorkToDo(true);
//        smartKitchen.getCoffeeMaker().setHasWorkToDo(true);
//        smartKitchen.getDishWasher().setHasWorkToDo(true);
//
//        smartKitchen.getDishWasher().doDishes();
//        smartKitchen.getCoffeeMaker().brewCoffee();
//        smartKitchen.getRefrigerator().orderFood();

        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitchenWork();



    }
}