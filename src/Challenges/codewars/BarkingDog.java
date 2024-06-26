package Challenges.codewars;

public class BarkingDog {
    /*

        We have a dog that likes to bark. We need to wake up if the dog is barking at night!
        Write a method shouldWakeUp that has 2 parameters

        1st parameter should be of type boolean and be named barking. It represents if our dog is currently barking.

        2nd parameter represents the hour of the day and is of type in with the name hourOfDay and has a valid range of 0-23

        We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true

         In all other case return false

         if the hour of the day is less than 0 and greater than 23 return false


     */
    public static void main(String[] args) {
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){



     if( hourOfDay < 0 || hourOfDay > 23){
         return  false;
     }
    return barking && (hourOfDay < 8 || hourOfDay > 22);

    }

}
