package Challenges;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    /*

    In this challenge, you'll read 5 valid number from the console, entered by the user, and print the sum of those five numbers.
    If not, print out the message "invalid number" to the console, but continue looping, until you have 5 valid numbers.

    Before the user enters each number, prompt them with the message, "Enter number #x".
    Where x represents the count 1,2,3.

    And as an example there, the first message would look something like,
    "Enter number #1:" , the next "Enter number #2", and so on.

     */

    // region MAIN METHOD

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int positionCounter = 0;
        int totalSum = 0;

        System.out.println(" ");
        System.out.println("""
                Hello there! Welcome to easy calculator, here you can calculate the sum of 5 numbers.
                Get ready those 5 numbers and remember that each number must be larger or equal than 0
                """);

        // region LOOP

       do {

           try {
               int userInput = validUserInput(scanner.nextLine());
               if(userInput == -1){
                   positionCounter ++;
                   errorMessage(positionCounter,userInput);
                   positionCounter --;
               }
               else {
                   positionCounter ++;
                   System.out.println("Valid number. You entered : " + userInput + " for the position : #" + positionCounter);
                   totalSum += userInput;
               }
           } catch (NumberFormatException badUserAgeInput){
               positionCounter ++;
               errorMessage(positionCounter);
               positionCounter --;
           }
       } while (positionCounter < 5);

        System.out.println("Great, you did it.");
        System.out.println("Final total is : " + totalSum );


        // endregion


    }

    // endregion

    // region NUMBER VALIDATION METHOD

    public static  int  validUserInput(String number){

        int validUserInput = Integer.parseInt(number);
        if(validUserInput < 0){
            return -1;
        }

        return validUserInput;

    }

    public  static void errorMessage(int numberPosition){
        System.out.println("Invalid input for position #" + numberPosition + ". Characters are not allow");

    }public  static void errorMessage(int numberPosition, int userInput){
        System.out.println("Invalid input for position #" + numberPosition + ". The number must be larger or equal to 0, your input : " + userInput);
    }


    // endregion

}
