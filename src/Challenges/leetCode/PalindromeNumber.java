package Challenges.leetCode;

public class PalindromeNumber {

 // given an integer x, return true if x is palindrome, and false otherwise.
 /*

 Example :

 Input x = 121,
 Output = true

 Input x = -121
 OutPut = false

  */
 public static void main(String[] args) {
     var test = new PalindromeNumber();
     System.out.println(test.isPalindrome(121));
     System.out.println(test.isPalindrome(-121));
 }

    public boolean isPalindrome(int x) {

     if(x < 0){
         return false;
     }

        int reverse = 0;
        int absoluteValue = x;

       while( absoluteValue > 0){
           reverse = reverse * 10 + absoluteValue % 10;
           absoluteValue = absoluteValue / 10;

       }

       return reverse == x;


    }

}
