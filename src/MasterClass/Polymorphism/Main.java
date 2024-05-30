package MasterClass.Polymorphism;


import MasterClass.PolymorphismChallenege.Car;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue ferrari 296 GTS");
        runRace(car);
    }

    public static void runRace (Car car){
        car.startEngine();
        car.drive();
    }
}
