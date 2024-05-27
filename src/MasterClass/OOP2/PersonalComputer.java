package MasterClass.OOP2;

public class PersonalComputer extends  Product {

    private Monitor monitor;
    private ComputerCase computerCase;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, ComputerCase computerCase, Motherboard motherboard) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.computerCase = computerCase;
        this.motherboard = motherboard;
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }

    private void drawLog(){
        monitor.drawPixel(1200, 50 , "Yellow");
    }

    public void powerUp (){
        computerCase.pressButton();
        drawLog();
    }




}
