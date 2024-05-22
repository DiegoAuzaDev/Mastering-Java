package Challenges.codewars;

// Positive, Negative or Zero
// Write a method called checkNumber with an int parameter named number.
//
//The method should not return any value, and it needs to print out:
//
//        - "positive" if the parameter number is > 0
//
//        - "negative" if the parameter number is < 0
//
//        - "zero" if the parameter number is equal to 0

public class PositiveNegativeOrZero {

    public static void main(String[] args) {

        // region TEST NUMBER
        int numberTest = 0;
        int numberTestPositive = 1;
        int numberTestNegative = -1;
        int numberTestLarge = 10;
        // endregion

        // region TEST
        checkNumber(numberTest);
        checkNumber(numberTestPositive);
        checkNumber(numberTestNegative);
        checkNumber(numberTestLarge);
        // endregion
    }
        // region CHECK NUMBER
        public static void checkNumber ( int number){
        if ( number > 0 ){
            System.out.println("positive");
        } else if(number < 0 ){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    // endregion
}
