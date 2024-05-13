
package MasterClass;
import java.util.*;

public class ReadingUserInput {

    public static void main(String[] args) {
        int currentYear = 2024;
        System.out.println(getInputFromConsole(currentYear));
    }

    public static String getInputFromConsole (int currentYear){
        String name = System.console().readLine("Hi, what is your name?");
        System.out.printf(" Hi, %s welcome to mastering Java with Diego and thank you for taking the time to run this program%n", name);
        String dateOfBirthDay = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirthDay);

        return "%s, you are %d years old".formatted(name, age);
    };

    public static String getInputFromScanner (int currentYear){

        return "";
    }

}
