public class CoffeeMaker {

    private boolean hasToDoWork;

    public void isHasToDoWork() {
        hasToDoWork = true;
    }

    public void brewCoffee() {
        if (hasToDoWork) {
            System.out.println("Coffee maker has begun brewing coffee");
        }
    }


}
