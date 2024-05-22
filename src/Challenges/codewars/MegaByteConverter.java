package Challenges.codewars;
public class MegaByteConverter {
    /*
     *    Write a method called printMega
     *    BytesAndKiloBytes that has 1 parameter of type int with
     *    the name kiloBytes.
     *
     *     The method should not return anything (void) and it needs to calculate
     *     the megabytes and remaining kilobytes from the kilobytes parameters.
     *
     *      Then it need to print a message in the format
     *      "XX KB = YY MB and ZZ KB" XX - Represent kilobytes and YY represent megabytes
     *      ZZ represent the remaining kilobytes
     *
     *      if the parameter kiloBytes is less than 0 then print the Text "Invalid Value".
     *
     *      EXAMPLE INPUT/OUTPUT
     *
     *      printMegaBytesAndKilobytes(2500) should print the following text: "2500 KB = 2 MB and 452 KB"
     *
     */

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int megaBytes = 0;
        int remainingKilobytes = 0;

        // 1 MB = 1024 KB

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        megaBytes =  kiloBytes / 1024;
        remainingKilobytes = kiloBytes % 1024;
        System.out.println(kiloBytes +" KB = "+ megaBytes +" MB and " + remainingKilobytes +" KB");
    }

}
