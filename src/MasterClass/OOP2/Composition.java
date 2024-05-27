package MasterClass.OOP2;

public class Composition {

    public static void main(String[] args) {

        var computerCase = new ComputerCase("2208", "Dell", "240");
        var monitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        var motherBoard = new Motherboard("BJ-200", "Asus", 4 ,6 , "v2.44");

        var personalComputer = new PersonalComputer("2208", "Dell", monitor, computerCase, motherBoard);

//       personalComputer.getMonitor().drawPixel(10, 20, "Yellow" );
//       personalComputer.getMotherboard().loadProgram("Windows OS");
//       personalComputer.getComputerCase().pressButton();

        personalComputer.powerUp();

    }

}
