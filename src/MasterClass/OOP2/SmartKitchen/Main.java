package MasterClass.OOP2.SmartKitchen;

public class Main {

    public static void main(String[] args) {
        var newMartKitchen = new SmartKitchen();

        newMartKitchen.getDishWasher().setHasWorkToDo(true);
        newMartKitchen.getIceBox().setHasWorkToDo(true);
        newMartKitchen.getBrewMaster().setHasWorkToDo(true);

//        newMartKitchen.getDishWasher().doDishes();
//        newMartKitchen.getIceBox().orderFood();
//        newMartKitchen.getBrewMaster().brewCoffee();

        newMartKitchen.setKitchenState(true, false, true);
        newMartKitchen.doKitchenWork();
    }
}
