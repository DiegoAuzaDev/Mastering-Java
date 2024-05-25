package Challenges.codewars;

import java.util.regex.Pattern;

public class BreakcamelCase {
    public static void main(String[] args) {


    }
    public  static  String test (String word){
        return word.replaceAll("([A-Z])", " $1");
    }

}
