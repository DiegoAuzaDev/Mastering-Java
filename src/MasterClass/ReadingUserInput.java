package MasterClass;

public class ReadingUserInput {

    public static void main(String[] args) {

        int currentYear = 2024;
        String userDateOfBirth = "2004";
        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));
    }

}
