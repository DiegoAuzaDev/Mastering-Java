package MasterClass.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumChallenge {

    public static void main(String[] args) {
//        readIntegers(1, 2, 3, 4, 5, 6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("-".repeat(20));
        System.out.println("Enter a sequence of number and I will return to you the minimum number of the list");
        System.out.println("example: enter 80 2 3 50 1 -> it will return 1 ");
        String[] input = scanner.nextLine().split(" ");
        int[] inputNumber = readIntegers(input);
        System.out.println("You entered the following numbers " + Arrays.toString(inputNumber));
        int minimumValue = minimumValue(inputNumber);
        System.out.println("We found to minimum number : " + minimumValue);

    }

    static int[] readIntegers (String... listOfString){

        int[] listOfNumbers = new int[listOfString.length];
        for (int i = 0; i < listOfNumbers.length; i++) {
               listOfNumbers[i] = Integer.parseInt(listOfString[i]);
        }
        return listOfNumbers;
    }


    static int minimumValue (int... listOfNumber){

        int[] sortedList = Arrays.copyOf(listOfNumber, listOfNumber.length);
        Arrays.sort(sortedList);
        return sortedList[0] ;
    }

}
