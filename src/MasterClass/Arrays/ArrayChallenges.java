package MasterClass.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayChallenges {

    public static void main(String[] args) {

        /*

        create a program using arrays, that sorts a list of integer, in descending order.


         */

        // get random
        Random random = new Random();

        // crate a new array
        int[] newChallenge = new int[6];

        for (int i = 0; i < newChallenge.length; i++) {
            newChallenge[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(newChallenge));
        // sort the array
        Arrays.sort(newChallenge);

        System.out.println(Arrays.toString(newChallenge));

        int[] reverseArray =  new int[newChallenge.length];
        int position = 0;
        for (int i = newChallenge.length -1  ; i >= 0; i--) {
            reverseArray[position] = newChallenge[i];
            position ++;
        }
        System.out.println(Arrays.toString(reverseArray));
    }

}
