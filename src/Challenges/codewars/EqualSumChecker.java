package Challenges.codewars;

public class EqualSumChecker {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

    }

    public static  boolean hasEqualSum(int firstNumberToSum, int secondNumberToSum, int numberToCompare){
        return firstNumberToSum + secondNumberToSum == numberToCompare;
    }
}
