package Challenges.leetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    /*
    * Write a function to find the longest common prefix string amongst an array of strings.
    * If there is no common prefix, return string ""
    *
    *  */

    public static void main(String[] args) {
        var longestPrefix = new LongestCommonPrefix();
        String[] testValue = new String[] {"flower","flow","flight"};
        String[] testValue2 = new String[] {"dog","racecar","car"};
        System.out.println( longestPrefix.longestCommonPrefix(testValue));
        System.out.println( longestPrefix.longestCommonPrefix(testValue2));

    }

    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

}
