package Challenges.codewars;

public class Square {

    public static void main(String[] args) {
        int[] numberTest = new int[] {1,2,2};
        System.out.println(calculateSquareSum(numberTest));
    }

    // Complete the square sum function so that it squares each number passed into it and then sums the result together
    // for example [1,2,2] it should return 9 ;

    // method to calculate square sum

    public static  int calculateSquareSum (int[] numberToSum){

        int totalSum = 0;

        for(int i : numberToSum ){
            totalSum += (int)  Math.pow(i, 2);
        }

        return totalSum;
    }



}
