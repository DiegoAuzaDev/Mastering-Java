package Challenges.codewars;

public class LeapYearCalculator {

    public static void main(String[] args) {
//    System.out.println(isLeapYear(-1600));
//    System.out.println(isLeapYear(1600));
//    System.out.println(isLeapYear(2017));
//    System.out.println(isLeapYear(2000));
    System.out.println(isLeapYear(1800));
    }

    /*

    Write a method isLeapYear with a parameter of type int named year.

    The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.

    Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

    To determine whether a year is a leap year, follow these steps:
    1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
    2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
    3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
    4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
    5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

    Another way to put is:

    A leap year is a year that is divisible by 4 but not 100.

    If it's divisible by 100, it has to be divisible by 400.

    The following years are not leap years:
    1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
    This is because they are evenly divisible by 100 but not by 400.

     */


    public static boolean isLeapYear(int year) {

        // if year is less than 1 or greater than 9_999, it's invalid,
        // so return false
        if (year < 1 || year > 9_999) {
            return false;
        }

        if (year % 4 == 0) { // if year is divisible by 4, go to next step.
            if (year % 100 != 0) { // if year is not divisible by 100, it's a leap year, so return true.
                return true;
            } else { // if year was divisible by 100, let's check if it's divisible by 400.
                if (year % 400 == 0) { // if it's divisible by 400, it's leap year.
                    return true;
                } else { // otherwise, it's not a leap year, so return false.
                    return false;
                }
            }
        } else { // year is not divisible by 4, so it's not a leap year.
            return false;
        }
    }
}

