package MasterClass.OOP2.SmartKitchen;

public class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if( hasWorkToDo){
            System.out.println("Preparing food");
            hasWorkToDo = false;
        }
    }

}
