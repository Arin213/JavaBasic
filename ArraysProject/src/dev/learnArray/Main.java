package dev.learnArray;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main (String[] args){
        //initialize array
        /* The size of array, once created is fixded.
        In this case the size of the array is 10.
        The array is of type int, so it can only store integer values.
        The array is named myIntArray.
        The array is initialized with the new keyword.
        The new keyword is followed by the type of the array, which is int.
        The new keyword is followed by the size of the array, which is 10.
        you can't add or delete elements. You can only assign values to one of the ten elements in this
        array. The index of the first element is 0, and the index of the last element is 9.

        * */
        int[] myIntArray = new int[10];
        //myIntArray = 45.0; //error because the array is of type int
        //myIntArray[1] = "1";//error because the array is of type int
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);

        //initialize arrary type double
        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        /** The array initializer
         * An array initializer makes the job of instantiating and initializing an array easier.
         * The array initializer is a list of comma-separated expressions surrounded by curly braces.
         * */
        int[] firstFivePositives = new int[]{1, 2, 3, 4, 5};

        /**The array initializer as an anonymous array
         * Java allow us to drop the new int[] with brackets from the expression,
         * and this is called an anonymous array.
         * NOTE: You can only use the anonymous array when you declare the array variable or
         * in a declaration statement.
         * */


        int[] firstFivePositives2 = {1, 2, 3, 4, 5}; // now need of new int[] keyword.
        String[] names = {"John", "Doe", "Jane", "Doe"};

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("First element: " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Array length: " + arrayLength);
        System.out.println("Last element: " + firstTen[arrayLength - 1]); // firstTen[arrayLength] will throw
        // an ArrayIndexOutOfBoundsException

          /*int[] newArray;
        newArray = {5,4,3,2,1}; //error because the array initializer is not an anonymous array
        however, we can do this
        */
        //int[] newArray = {5,4,3,2,1}; // this is correct or
//        int[] newArray;
//        newArray = new int[]{5,4,3,2,1}; // this is correct as longer forms
//        //lets loop the array
//        for(int i = 0; i< newArray.length; i++){
//            System.out.print(newArray[i] + " ");
//        }

        /** When you don't use an array initializer statement, all array elements get
         * initialized to the defaut value for that type.
         *
         * For primitve types, this is 0 for numeric types, false for boolean types, and null for reference types
         *
         * */

        // sorting of array in descending order
        int[] newArray;
        newArray = new int[5];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i; // 5 - 1 = 4 and so on to fill up the array of length 5
        }
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        /**The enhanced for loop, the for each loop
         * This loop was designed to walk thorugh elements in an array or other
         * collection types.
         * It processes one element at a time, from the first element to the last.
         * The syntax for the two types of for loops statements, side by side.
         *
         * Enhanced for loop
         * The enhanced for loop only has two components
         * the separator  character between components is a colon(:) unlike the
         * basic for loop which uses a semicolon(;).
         * for (type variable : collection) {
         *     //block of statements
         * }
         *
         * Basic for loop
         * basic for loop has inti; expression and increment.
         * for(init; condition; update) {
         *    //block of statements
         * }
         * */
        System.out.println();
        System.out.println("Enhanced for loop");
        for(int element: newArray){
            System.out.print(element + " ");
        }

        /** java.util.Arrays
         *
         * java's array type is very basic.it comes with very little built-in functionality.
         * it has a single property or field, named length,
         * and it inherits java.util.Objects functionality.
         * java provides a helpers class named java.util.Arrays. providing the common functionality
         * you'd want for many array operations.
         * These are static methods on arrays, they are class methods, not instance methods.
         *
         * PRINTING ELEMENTS IN AN ARRAY USING Arrays.toString()
         * The toString method in this helper class prints out all the array elements, comma delimited,
         * and contained in a square bracket.
         *
         * String arrrayElementsInAString = Arrays.toString(newArray);
         *
         * The output from this method is shown here conceptually.
         * It prints the element at index 0 first, followed by a comma. then the element at index 1
         * next, a comma, and so on, until all elements are printed.
         * [e[0], e[1], e[2], e[3], ..., e[n-1]]
         * sytnax -> Arrays.toString(array) // gives the output as array similar to list in python.
         * HERE,
         * */
        System.out.println();
        System.out.println("Similar like getting the list element in list in python we can get in janva as well ");
        System.out.println(Arrays.toString(newArray)); // get output as array similar as list in pytyon.

        //we can also assign the array to the object variable.
        // array is a special class recognized by java through the use of square brackets[].
        // it still inherits from the java dot lang dot object class.
        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("The object variable is really an int array");
        }

        // while we can directly create the object array to supports any type in java.
        // Main to understand is that the array can be treated like any other object instance in java.
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;

    }
}

