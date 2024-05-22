package Challenges.codewars;

public class FirstAndLastDigit {

    /*

    write a method named sumFirstAndLast with one parameter of type int called number.

    The method need to find the first and last digit of the parameter number passed to method, suing a loop and return
    the sum of the first and last digit of that number.

    if the number is negative then the method need tor return -1 to indicate an invalid value


     */

    public static void main(String[] args) {
//    sumFirstAndLast(12);
   System.out.println( sumFirstAndLastDigit(252));
   System.out.println( sumFirstAndLastDigit(257));
   System.out.println( sumFirstAndLastDigit(0));
   System.out.println( sumFirstAndLastDigit(5));
   System.out.println( sumFirstAndLastDigit(-10));
    }

//    public static int sumFirstAndLastDigit (int number){
//
//        if (number < 0 ){
//            return -1;
//        }
//
//        int totalSum = 0;
//       String numberToString = Integer.toString(number);
//       String firstDigit = String.valueOf(numberToString.charAt(0)), secondDigit =  String.valueOf( numberToString.charAt(numberToString.length() - 1));
//
//        totalSum = Integer.parseInt(firstDigit) + Integer.parseInt(secondDigit);
//
//        return totalSum;
//
//    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }

        int firstDigit = number;
        return firstDigit + lastDigit;
    }
}
