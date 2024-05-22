package Challenges.leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class RomanInteger {

    public static void main(String[] args) {
        var test = new RomanInteger();
//        System.out.println(test.romanToInt("III"));
//        System.out.println(test.romanToInt("LVIII"));
//        System.out.println(test.romanToInt("MCMXCIV"));
        System.out.println(test.romanToInt("IX"));
    }

    public int romanToInt(String s) {

        int total = 0;
        String[] letters = s.split("");

        HashMap<String, Integer> constValues = new HashMap<String, Integer>(){ {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
            // instances where subtraction is used
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }};

        for (int i = 0; i < letters.length; i++) {

            String currentPosition = letters[i];
            // check if there is any next index in the array
            if( i + 1 < letters.length){
               String nextPosition = letters[ i + 1];

               // create a combine letter
               String combineLetter = currentPosition + nextPosition;

               // check if the combine letter is in the hasmap
               if (constValues.containsKey(combineLetter)){

                    total += constValues.get(combineLetter);
                    i++;
                    continue;
               }

            }
                total += constValues.get(currentPosition);


        }

        return total;
    }

}
