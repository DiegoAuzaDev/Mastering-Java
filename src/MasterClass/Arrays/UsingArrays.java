package MasterClass.Arrays;

import java.util.Arrays;
import java.util.Random;

public class UsingArrays {

    public static void main(String[] args) {

    int[] arrayResponse = getRandomArrays(10);
    System.out.println(Arrays.toString(arrayResponse));
    Arrays.sort(arrayResponse);

    System.out.println(Arrays.toString(arrayResponse));

    int[] secondArray = new int[10];
    System.out.println(Arrays.toString(secondArray));
    Arrays.fill(secondArray, 5);
    System.out.println(Arrays.toString(secondArray));

    int[] thirdArray = getRandomArrays(10);
    System.out.println(Arrays.toString(thirdArray));
    int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);



    System.out.println(Arrays.toString(fourthArray));


    Arrays.sort(fourthArray);
    System.out.println(Arrays.toString(fourthArray));

    int[] smallArray = Arrays.copyOf(thirdArray, 5);
    System.out.println(Arrays.toString(smallArray));

    int[] largeArray = Arrays.copyOf(thirdArray, 15);
    System.out.println(Arrays.toString(largeArray));



    }

    private static int[] getRandomArrays(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

}
