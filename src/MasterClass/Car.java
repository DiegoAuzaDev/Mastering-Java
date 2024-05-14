package MasterClass;

public class Car {

    // region VARIABLES

    private String make = "Ford";
    private String model = "Explorer";
    private String color = "Black";
    private int doors = 4;
    private boolean convertible = false;


    // endregion

    // region METHODS

    public void describeCar(){
        System.out.printf("""
                %s - make
                %s - model
                %s - color
                %d - doors
                %b - convertible
                %n""", make, model, color, doors, convertible);
    }

    // region GETTERS

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }


    // endregion

    // region SETTERS

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }


    // endregion

    // endregion

}
