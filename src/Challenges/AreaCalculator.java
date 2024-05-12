package Challenges;

public class AreaCalculator {

    /*

    Write a method named area with one double parameter named radius.
    The method need to return a double value that represents the area of a circle

    If the parameter radius is negative then return -1.0 to represent an invalid value.

    Write another overload method with 2 parameter with 2 parameter x and y both doubles, where x and y
    represents the sides of a rectangle.

    The method needs to return an area of a rectangle.

    If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

    Area circle = PI x r ^ 2 ;

    Area square = side * side

     */

    public static void main(String[] args) {
    System.out.println(area(10)); // valid
    System.out.println(area(-1)); // invalid
    System.out.println(area(0)); // valid
    System.out.println(area(0, 2)); // valid
    System.out.println(area(2, 2)); // valid
    System.out.println(area(-1, 2)); // invalid
    }

    public static double area(double radius){

        double totalArea;

        if(radius < 0 ){
            totalArea = -1.0;
        } else {
        totalArea = Math.PI * (Math.pow(radius, 2));
        }

        return totalArea;
    }

    public static double area(double x, double y){

        double totalArea;

        if(x < 0 ||  y < 0 ){
            totalArea = -1.0;
        } else {
            totalArea = x * y;
        }

        return totalArea;
    }

}
