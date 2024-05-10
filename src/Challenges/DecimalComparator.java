package Challenges;

import java.text.DecimalFormat;

public class DecimalComparator {

    public static void main(String[] args) {
      System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        // region ERROR FORMATING NUMBER - DOUBLE
    /*  DecimalFormat newDecimalNumber = new DecimalFormat("#.###");
        String decimalPartX = newDecimalNumber.format(x);
        String decimalPartY = newDecimalNumber.format(y);

        return decimalPartY.equals(decimalPartX);

     */
        // endregion

        int intX = (int)(x * 1000);
        int intY = (int)(y * 1000);
        return intY == intX;
    }


}
