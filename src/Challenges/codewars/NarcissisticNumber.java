package Challenges.codewars;

public class NarcissisticNumber {

    public static void main(String[] args) {
    System.out.println(isNarcissistic(153));
    }

    // region METHOD

    public static boolean isNarcissistic(int number) {

        String numberToString = String.valueOf(number);
        int totalSumNumber = 0;
        for (int i = 0; i < numberToString.length() ; i ++)
        {
            int individualNumber = Character.getNumericValue( numberToString.charAt(i));
            totalSumNumber += (int) Math.pow( individualNumber, numberToString.length());
        }
        return totalSumNumber == number;
    }

    // endregion

}
