package MasterClass.PolymorphismChallenege;

public class Car {

    private String description;

    public Car (String description){
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Engine Started :" + description);
    }

    public void drive(){
        System.out.println("You are driving the car");
    }

    protected void runEngine  (){
        System.out.println("You are running a car: " + description);
    }

}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public void drive (){
        System.out.println("You are driving a gas powered car");
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("You car is using gas to run");
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public void drive (){
        System.out.println("You are driving a hybrid car");
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("You car is using gas a electricity to run");
    }
}


class ElectricCar extends  Car {

    private double avgKMPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKMPerCharge, int batterySize) {
        super(description);
        this.avgKMPerCharge = avgKMPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKMPerCharge() {
        return avgKMPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Your car is using battery to run");
    }
}
