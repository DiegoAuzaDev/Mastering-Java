package Challenges.codewars;

public class SumOdd {
    /*

    Write a method called isOdd with an int parameter and cal it number. The method need to return a boolean.
    Check that number is > 0, if it is not return false // done

    if number is odd return true,
    otherwise return false. // done

    Write a second method called sumIOdd that has 2 int parameters start and end, witch represent a range of numbers

    The method should use a for loop to sum all odd number in that range including the end and return the sum.

    It should call the method is Odd to check if each number is Odd.

    The parameter end needs to be greater or equals to start and both start and end parameter have to be greater than 0.

    if those conditions are not satisfies return -1 from the method to include invalid input.

     example

     sumOdd(1,100) -> return 2500;
     sumOdd(-1, 100) -> should return -1
     sumOdd(100, 100) -> should return 0
     sumOdd(13,13) should return (This set container one number 13, and it is odd)
     */

    public static void main(String[] args) {
        System.out.println("TESTING  ODD VALIDATION\n");
        // region TESTING IS ODD VALIDATOR
        System.out.println(isOdd(0));
        System.out.println(isOdd(1));
        System.out.println(isOdd(13));
        // endregion
        System.out.println("TESTING FOR LOOP\n");
        // region TESTING SUM VALIDATOR
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1 , 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        // endregion
        System.out.println("\n");

    }

    public static  boolean isOdd(int number){
        return number > 0 && number % 2 != 0 ;
    };

    public static int  sumOdd ( int start , int end ){


        if(end < start ){
            return -1;
        }
        if(end < 0 || start < 0){
            return -1;
        }

        int totalSum = 0;
        for ( int i = start ; i <= end ; i ++){
            if( isOdd(i)){
              totalSum += i;
            }
        }

        return totalSum;

    };



}
