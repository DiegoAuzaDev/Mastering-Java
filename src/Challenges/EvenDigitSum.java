package Challenges;

public class EvenDigitSum {

    /*

     Write a method named getEvenDigitSum with one parameter of type int called number

     The method should return the sum of the even digits within the number

     if the number is negative, the method should return -1 to indicate an invalid value.

     */

    public static void main(String[] args) {
//    System.out.println(getEvenDigitSum(123456789));
    System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum (int number){


        if(number < 0){
            return -1;
        }
        int totalSum = 0;
        int tempNumber;

        while(number > 0 ){
            tempNumber = number % 10;
            if(tempNumber % 2 ==0) {
                totalSum += tempNumber;
            }
            number /= 10;
        }

        return totalSum;

    }

}
