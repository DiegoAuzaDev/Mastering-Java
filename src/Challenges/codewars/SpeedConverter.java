package Challenges.codewars;

public class SpeedConverter {

    // 1. Write a methods called toMilesPerHour that has 1 parameter of type double with the name kilometerPerHour.
    // This method needs to return the rounded value of the calculation of type long.

    // if the parameter kilometerPerHour is less than 0, the method toMilesPerHour need to return -1 to indicate and
    // invalid value.

    // Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion,
    // and rounding check the notes in the text below.

    // 2. Write another method called printConversion with 1 parameter of type double with the name kilometerPerHour.

    // This method should not return anything, and it needs to calculate milesPerHour from the kilometerPerHour parameter
    // Then it need to print a message in the format "XX km/h = YY mi/h"

    // XX represents the original value kilometersPerHour.
    // YY represents the rounded milesPerHour from the KilometerPerHour
    // if the parameter kilometerPerHour is  < 0 then print text "Invalid Value"

    // Use method Math.round to round the number of calculated miles per hour(double). The method round returns long.


    public static void main(String[] args) {
        // region VALUES

        double TOMILESPERHOURTESTNEGATVIE = -1;
        double TOMILESPERHOURTESTNEGATVIELARGE = -5.6;
        double TOMILESPERHOUSETEST =  75.114;

        // endregion

        // region TEST TO MILES PER HOUR

        System.out.println(toMilesPerHour(TOMILESPERHOURTESTNEGATVIE));
        System.out.println(toMilesPerHour(TOMILESPERHOURTESTNEGATVIELARGE));
        System.out.println(toMilesPerHour(TOMILESPERHOUSETEST));

        printConversion(1.5);
        printConversion(0.0);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(75.114);
        printConversion(200);
        // endregion

    }

    public static  long toMilesPerHour (double kilometerPerHour){
        long milesPerHour = -1 ;

        if(kilometerPerHour >= 0){
         milesPerHour = Math.round(kilometerPerHour / 1.609);
        }

        return milesPerHour;
    }

    public static void   printConversion (double kilometerPerHour){
        String invalidValue = "Invalid Value";

        long milesPerHour = toMilesPerHour(kilometerPerHour);

        if(milesPerHour == -1){
            System.out.println(invalidValue);
        } else {
            String responseFormat = kilometerPerHour +  " km/h = "+ milesPerHour +" mi/h";
            System.out.println(responseFormat);
        }
        }


}
