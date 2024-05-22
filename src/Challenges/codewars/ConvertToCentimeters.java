package Challenges.codewars;

public class ConvertToCentimeters {

    /*

    Create two methods with the same name: convertToCentimeters

    - The first method has one parameter of type int, which represents the entire height in inches
    You'll convert inches to centimeters, in this method, and pass back the nu,ber of centimeters, as a double

    - The second method has two parameters of type int, one to represent height in feet, and one to represent the
     remaining height in inches.
    So if a person is 5 foot, 8 inches, the values 5 for feet and 8 for inches would be passed to this method.
    This method will convert feet and inches
    to just inches, then call the first method, to get the number of centimeters, also returning the value as a double

     */

    public static void main(String[] args) {
        // region TEST VALUES
            final int feet = 6;
            final int inches = 6;
            final int inchesOnly = 12;
            final int inchesOnlyDifferentValue = 99;

        // endregion

        // region TEST ONE PARAMETER METHOD

        System.out.println(convertToCentimeters(inchesOnly) + " cm");
        System.out.println(convertToCentimeters(inchesOnlyDifferentValue ) + " cm");

        // endregion

        System.out.println("------------------------------");

        // region TEST TWO PARAMETERS METHOD

        System.out.println(convertToCentimeters(feet, inches) + " cm");
        System.out.println(convertToCentimeters(50, 20 ) + " cm");

        // endregion


    }

        // region METHODS - CONVERT TO CENTIMETERS

    public static double convertToCentimeters( int inches ){

        final double CENTIMETERS_IN_ONE_INCHES = 2.54d;
        return inches * CENTIMETERS_IN_ONE_INCHES;
    }

    public static double convertToCentimeters(int feet, int inches){
        final int INCHES_IN_ONE_FOOT = 12;
        int totalInches = inches + (feet * INCHES_IN_ONE_FOOT);
        return convertToCentimeters(totalInches);

    }

        // endregion

}
