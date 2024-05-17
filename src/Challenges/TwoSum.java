package Challenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    /*

    Given an array of integers nums and an integer target, return indices of the two number such that they add up to target

    you may assume that each input would have exactly one solution, and you may not use the same elements twice

     */

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println( Arrays.toString(twoSum.twoSum( new int[]{2, 11, 15, 7}, 9)));
    }

    public int[] twoSum(int[] nums, int target){

        final List<Integer> response = new ArrayList<Integer>();
        HashMap<Integer, Integer> possibleIndexes = new HashMap<Integer, Integer>() {};

        for ( int index = 0 ; index < nums.length ; index ++){

            int neededValue = target - nums[index];

            if (possibleIndexes.containsKey(neededValue)) {
                return new int[]{possibleIndexes.get(neededValue), index};
            }

            possibleIndexes.put(nums[index], index );

        }

        return new int[]{};

    }

}
