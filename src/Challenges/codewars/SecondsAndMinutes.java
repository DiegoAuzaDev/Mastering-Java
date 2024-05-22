package Challenges.codewars;

public class SecondsAndMinutes {

    /*

    We want to create two methods with the same name; getDurationString

    - The first method has one parameter of type int, named seconds.
    - The second method has two parameter, named minutes and seconds, both ints.
    - Both methods return a Sting in the format shown:

    "XXh YYm ZZs"

    - The first method should in turn call the second method to return its result
    - Remember that one minute is 60 seconds, and one hour equals 60 minutes or 3600

    - VALIDATION
    - For the first method, the seconds parameters should be >= 0
    - For the second method, the minutes parameters should be >= 0, and the second parameter should >= 0 and <= 59
    - If either methods is passed and invalid value, print out some type of meaningful message to the user

     */

    public static void main(String[] args) {

        // region VALUE TEST
            final int secondsA = -1;
            final int secondsB = 0;
            final int secondsC = 59;
            final int secondsD = 3945;

            final int minutesA = -1;
            final int minutesB = 0;
            final int minutesC = 59;
            final int minutesD = 5000;

        // endregion

        // region TEST INVALID PARAMETERS

        System.out.println(getDurationString()); // invalid
        System.out.println(getDurationString(secondsA)); // invalid
        System.out.println(getDurationString(secondsD)); // valid result
        System.out.println(getDurationString(minutesA, secondsC)); // invalid
        System.out.println(getDurationString(minutesB, secondsA)); // invalid
        System.out.println(getDurationString(minutesC, secondsB)); // valid result
        System.out.println(getDurationString(minutesD, secondsC)); // valid result
        System.out.println(getDurationString(65, 45)); // valid result

        // endregion
    }


    // region METHOD GET_DURATION_STRING - Overloading

    public static String getDurationString(int seconds){

        // region VALIDATION -  INVALID PARAMETER

        if(seconds < 0 ){
            return getDurationString();
        }

        // endregion

        int totalMinutes = seconds / 60;
        int totalSeconds = seconds % 60;

        return getDurationString(totalMinutes, totalSeconds);
    }
    public static String getDurationString(int minutes, int seconds){

        // region VALIDATION -  INVALID PARAMETER
        if(minutes < 0 ){ // invalid parameter
            return getDurationString();
        }
        if(seconds < 0 || seconds > 59){ // invalid parameter
            return getDurationString();
        }

        // endregion

        int totalMinutes = minutes % 60;
        int totalHours = minutes / 60 ;


        return totalHours +
                " h " +
                totalMinutes +
                " m " +
                seconds +
                " s";

    }
    public static String getDurationString(){
    return "Invalid values. Try again with different values.";
    }

    // endregion

}
