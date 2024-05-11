package Challenges;

public class TeenNumberChecker {

    public static void main(String[] args) {

        // region TEST HAS_TEEN
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        // endregion

        // region TEST IS_TEEN
        System.out.println(isTeen(9));
        System.out.println(isTeen(16));
        System.out.println(isTeen(13));
        System.out.println(isTeen(8));
        // endregion
    }

    public static boolean hasTeen(int x, int y, int z) {

        // check if at least one of those parameters are teen numbers

        boolean firstNumberCheck = (x >= 13 && x <= 19);
        boolean secondNumberCheck = (y >= 13 && y <= 19);
        boolean thirdNumberCheck = (z >= 13 && z <= 19);

        return firstNumberCheck || secondNumberCheck || thirdNumberCheck;
    }

    public  static  boolean isTeen(int numberToCheck){
        return  numberToCheck >= 13 && numberToCheck <= 19;
    }
}
