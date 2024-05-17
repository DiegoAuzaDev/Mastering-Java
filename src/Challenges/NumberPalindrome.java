package Challenges;

public class NumberPalindrome {


    public static void main(String[] args) {
    System.out.println(isPalindrome(-1221));
    System.out.println(isPalindrome(707));
    System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){

        int reverse = 0 ;
        int absoluteValue = Math.abs(number);

        while( absoluteValue > 0){
            reverse = reverse * 10 + absoluteValue % 10;
            absoluteValue = absoluteValue / 10;
        }
        return reverse == Math.abs(number);
    }

}
