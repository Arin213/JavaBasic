package dev.learnArray;

import java.util.Arrays;
import java.util.Random;

public class randomArray {
    public static void main(String[] args){
        int[] myArray = getRandomArray(10);
        System.out.println(Arrays.toString(myArray)); // give the list of item

        //Arrays provide the Arrays.sort() which will sort the array
        // sorting will be done within the existing array without creating a new array obj.
        Arrays.sort(myArray); //will sort the array but return void just done in existing array
        System.out.println(Arrays.toString(myArray)); // gives the sorted array


        //usage of Arrays.fill(array,valueToFill)
        int[] secondArray = new int[10]; // value filled with 10 0s:
        System.out.println(Arrays.toString(secondArray)); // give the list of 10 0s
        Arrays.fill(secondArray, 5); //fill the array with int instead of 0 as default value .
        System.out.println(Arrays.toString(secondArray)); // give the list of 10s int value of 5 instead of 0



        //usage of Arrays.copyOf(array, length)
        // creating new array with the element of 10 int randomised
        int[] thirdArray = Arrays.copyOf(myArray, 5); // copy the first 5 elements of myArray
        System.out.println("ThirdArray:");
        System.out.println(Arrays.toString(thirdArray));

        //creating new array.
        int[] newArray = getRandomArray(10);

        //creating the fourth array but copying the thirdArray
        /**Arrays.copyOf(newArray, newArray.length)
         * this wil copy the element of array with passing length of array as additional argument
         * as how many element should be added.
         * */

        /**here Arrays.copyOf(array, array. Length) will copy the new array object refereneces
         * and not the actual object. So, if you change the value of newArray, the fourthArray will
         * Arrays.sort() and Arrays.fill() will not affect the original object array however
         * the Arrays.copyOf() will do affect the original arrays obj.
         * */
        int[] fourthArray = Arrays.copyOf(newArray, newArray.length);
        System.out.println("Copy of newArray in fourthArray: ");
        System.out.println(Arrays.toString(fourthArray));

        System.out.println("After sorting fourthArrays");
        Arrays.sort(fourthArray);
        System.out.println("newArray:\n" + Arrays.toString(newArray));
        System.out.println("fourthArray:\n" + Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(newArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(newArray, 15);
        System.out.println(Arrays.toString(largerArray));
    }



    //user defined functions or method a type of int[] array
    private static int[] getRandomArray(int len){
        Random random = new Random();

        int[] newInt = new int[len]; // create a new array of length len
        for(int i = 0; i < len; i++){
            // get random integer value range of 100 as 100 is excluded.
            newInt[i] = random.nextInt(100);
        }
        return newInt;

    }
}
