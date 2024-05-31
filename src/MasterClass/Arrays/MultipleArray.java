package MasterClass.Arrays;

import java.util.Arrays;

public class MultipleArray {

    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("Array.length " + array2.length );

        for (int[] outer : array2){
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = ( i * 10 ) + (j + 1);
            }
        }

        System.out.println(Arrays.deepToString(array2));
        array2[2] = new int[] { 10, 20 ,30};
        System.out.println(Arrays.deepToString(array2));

        Object[] anArray = new Object[3];
        System.out.println(Arrays.toString(anArray));

        anArray[0] = new String[] {"Diego", "Juan", "Liliana"};

        anArray[1] = new String[][] { {"1", "2"}, {"1, 2"} };
        anArray[2] = new String[][][] { {{"1", "2"}}, {{"1, 2"}} };


    }
}
