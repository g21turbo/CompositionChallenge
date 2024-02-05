public class DishWasher {

    private boolean hasWorkToDo;

    public void isHasToDoWork() {
        hasWorkToDo = true;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Dish washing cycle started");
        }
    }


}
