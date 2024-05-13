
package MasterClass;
import java.util.*;

public class ReadingUserInput {

    public static void main(String[] args) {
        int currentYear = 2024;

        // this code throws an error on IntelliJ
        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch (Exception e){
            System.out.println("You can not run console readLine on IntelliJ");
        }
            System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole (int currentYear){
        String name = System.console().readLine("Hi, what is your name?");
        System.out.printf(" Hi, %s welcome to mastering Java with Diego and thank you for taking the time to run this program%n", name);
        String dateOfBirthDay = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirthDay);
        return "%s, you are %d years old".formatted(name, age);
    };

    public static String getInputFromScanner (int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there, please enter your name ");

        String userName = scanner.nextLine();

        boolean validDOB = false;

        int age = 0;

        do{
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <=" + (currentYear));
    try {
        age = checkData(currentYear, scanner.nextLine());
        validDOB = age >= 0;
    } catch (NumberFormatException badUserAgeInput){
        System.out.println("Character not allowed!! try again ");
    }

        } while (!validDOB);
        return userName +" you are " + age + " years old";
    }

    public static  int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

    if(dob < minimumYear || dob > currentYear){
        return -1;
    }

    return (currentYear -dob);
    }


}
