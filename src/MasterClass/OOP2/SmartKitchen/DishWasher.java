package MasterClass.OOP2.SmartKitchen;

public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if( hasWorkToDo){
            System.out.println("Washing dishes");
            hasWorkToDo = false;
        }
    }
}
