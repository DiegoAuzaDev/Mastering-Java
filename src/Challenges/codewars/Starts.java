package Challenges.codewars;

public class Starts {

    public static void main(String[] args) {
        regularStarts(8);
        System.out.println();
        reverseStarts(8);
    }

    public static void regularStarts ( int numberOfRows){
        for (int i = 0; i  <  numberOfRows; i++) {
            // Print spaces
            for (int j = numberOfRows; i <  j ; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; i  >= k ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseStarts ( int numberOfRows){
        for (int i = 0; i  <  numberOfRows; i++) {
            // Print spaces
            for (int j = 0; j  <  i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = i; j  <  numberOfRows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
