public class Refrigerator {

    private boolean hasWorkToDo;

    public void isHasToDoWork() {
        hasWorkToDo = true;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Order for food has been placed");
        }
    }
}
