package MasterClass.Arrays;

import java.util.Arrays;

public class FindingMatch {

    /*

    You can hopefully imagine iif you were going to start writing doe to do this, you might start looping
    from start to finish, and check each element, to see it it equals what you are looking
    for.

    If you find a match, you would stop looping, and return that match was found, either with the position you
    found the element at, ot just a boolean value, true if it was found, and false if not.

    This is called a linear search or sequential, because you are stepping through the elements, one after another
    if your element are sorted though, using this type of linear search, is unnecessarily inefficient

     */

    public static void main(String[] args) {

        String[] sArray = {"Diego", "Karla", "Juan", "Liliana", "David"};
        System.out.println("This is the original Array");
        System.out.println(Arrays.toString(sArray));
        System.out.println(" ");
        Arrays.sort(sArray);
        System.out.println("Array sorted");
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray, "Diego") >= 0){
            System.out.println("Found Diego in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5, 0};

        if(Arrays.equals(s1, s2)){
            System.out.println("Arrays are equals");
        } else {
            System.out.println("They are not equals");
        }
    }




}
