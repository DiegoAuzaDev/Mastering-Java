package MasterClass.Printer;

public class Main {

    public static void main(String[] args) {
        var duplexPrinter = new Printer(50, false);
        System.out.println("Initial pages count = " + duplexPrinter.getPagesPrinted());
        int pagesPrinted = duplexPrinter.printPages(5);
        System.out.printf("Current Job pages %d, Printer Total %d %n", pagesPrinted, duplexPrinter.getPagesPrinted());

        pagesPrinted = duplexPrinter.printPages(10);
        System.out.printf("Current Job pages %d, Printer Total %d %n", pagesPrinted, duplexPrinter.getPagesPrinted());
    }
}
