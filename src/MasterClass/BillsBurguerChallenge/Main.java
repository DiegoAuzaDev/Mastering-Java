package MasterClass.BillsBurguerChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Toppings toppings = new Toppings(true, "Onions", "Cheese", "Tomatoes", "Pickles", "Mayo");
        Burger burger = new Burger("3");

        Hamburger hamburger = new Hamburger(burger, toppings);

        System.out.println(hamburger.toppings.getFinalPrice());
        System.out.println(hamburger.toppings.getTopping());
        System.out.println(hamburger.getDetails());

        System.out.println();

        Drink drink = new Drink("S");
        Toppings toppings1 = new Toppings(true, "Onions", "Tomatoes");
        Burger burger1 = new Burger("3");

        Meal meal = new Meal();

        Meal meal1 = new Meal(hamburger, drink, toppings1);
        System.out.println(meal1.toString());
    }
}
