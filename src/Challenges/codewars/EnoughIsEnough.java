package Challenges.codewars;

import java.lang.constant.DynamicCallSiteDesc;
import java.util.*;

public class EnoughIsEnough {

    /*

    Alice and Bob were on Holiday. Both of them took many pictures of the places they've been,
    and now they want to show Charlie their entire collection. However, Charlie doesn't like these
    sessions, since the motif usually repeats. He isn't fond of seeing the Eiffel tower 40 times.

    He tells them that he will only sit for the session if they show the same motif at most N times. Luckily,
    Alice and Bob are able to encode the motif as a number. Can you help them to remove numbers such that
    their list contains each number only up to N times. without changing the order?

    Task

    Given a list and a number, create a new list that contains each number of list and most N times, without reordering.
    For example if the input number is 2, and the input list is
    [1,2,3,1,2,1,2, 3], you take [1,2,3,1,2,], drop the next [1,2 ] , since this would lead to 1 and 2 being in the result
    3 times, and then take 3, which leads to [1 ,2, 3, 1, 2, 3].
    With list [20, 37, 20, 21] and number 1, the result would be [20, 37, 21]
     */

    public static void main(String[] args) {

        int[] elements = {1 , 2, 3 , 1, 2, 1, 2, 3};
        int maxOccurrences = 2;

       deleteNth(elements, maxOccurrences);

    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        HashMap<Integer, Integer> occurrences = new HashMap<Integer, Integer>() {};
        List<Integer> myList = new ArrayList<Integer>();

        for (int item: elements) {

            if(occurrences.containsKey(item)){
                int numberOfTimes = (int) occurrences.get(item);
                occurrences.put(item, numberOfTimes + 1);
            }
            else {
                occurrences.put(item, 1);
            }
            if( (Integer) occurrences.get(item) <= maxOccurrences ){
                myList.add(item);
            }
        }
    int[] result = new int[myList.size()];
        for(int i = 0 ; i < myList.size() ; i ++){
            result[i] = myList.get(i);
        }

        return result;
    }

}


