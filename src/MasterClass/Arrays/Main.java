package MasterClass.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // the size of an array, once created is fixed.

        int[] myArray = new int[10];
        myArray[0] = 45;
        myArray[1] = 1;
        myArray[5] = 50;

        double[] myDoubleArray =  new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        // Array initializer

        int[] firstFivePositives = new int[] {1,2,3,4,5};
        int[] anonymousArray = {1 ,2 ,3 ,4, 5, 6, 7};
        int arrayLength = anonymousArray.length;
        System.out.println(arrayLength);

        // get the last element of an Array

        int lastInteger = anonymousArray[anonymousArray.length - 1];
        System.out.println(lastInteger);


        for (int i = 0; i < anonymousArray.length; i++) {
            System.out.print(anonymousArray[i] + " ");
        }

        System.out.print("");

        int[] newArray ;
        newArray = new int[5];

        for (int itemOnArray: newArray) {
            System.out.print(itemOnArray  + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));

        Object object = newArray;

        if(object instanceof int[]){
            System.out.println("ObjectVariable is really an int array");
        }

        Object[] objectsArray = new Object[3];
        objectsArray[0] = "Hello";
        objectsArray[1] = new StringBuilder("World");

    }

}
