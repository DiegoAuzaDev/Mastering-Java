package Challenges.ArrayChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> userOperations = List.of("1", "2", "3", "0");
        Scanner scanner = new Scanner(System.in);
        Grocery grocery = new Grocery();

        boolean loop = true;
        while (loop){
            System.out.println();
            System.out.println("Welcome to Juanito's Store");
            System.out.println("It is time to add items to your grocery List");
            System.out.println("To add item(s) enter 1, to remove item(s) enter 2 , to clear your list 3,  to exit enter 0");

            String userInput =  scanner.nextLine();
            if(Objects.equals(userInput, userOperations.get(3))){
                System.out.println("Bye bye");
                loop = false;
                continue;
            }
           if(Objects.equals(userInput, userOperations.get(2))){
               grocery.clearList();
               System.out.println("You clean your list");
               loop = false;
               continue;
           }

           boolean isValidInput = true;
           while (isValidInput){
               if(!userOperations.contains(userInput)){
                   System.out.println("You enter an invalid operation");
                   userInput = scanner.nextLine();
               } else {
                   isValidInput = false;
               }
           }

           String items = scanner.nextLine();
           System.out.println("You enter the following list: " + items);
           String[] listOfItems = items.split(", ");

           // add items
           if(Objects.equals(userInput, userOperations.get(0))){
               grocery.addItemsToLIst(listOfItems);
           }
           // remove items
           else {
               grocery.removeItemsFromList(listOfItems);
           }

           System.out.println("Great, we completed the operation and your list looks like the following");
           System.out.println(grocery.getGroceryItems());

        }

    }

}
