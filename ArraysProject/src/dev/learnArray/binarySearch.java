package dev.learnArray;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args){
        /**
         * ARRAYS.BINARYSEARCH
         * Arrays.binarySearch
         * The static method, binarySearch, is in the Arrays class.
         * We can use this method to test if a value is already in our array, but there are some
         * important things to remember.
         * . First, the array has to be sorted.
         * . Second, if there are duplicate values in the array, there's no guarantee which on it'll match on.
         * Finally, elements must be comparable.Trying to compare instances of different
         * types will lead to errors and invalid results.
         *
         * This methods returns:
         * . The position of a mathc, if found.
         * . it returns a -1 when no match was found.
         * . it's important to remember that the positive number may not be the position of the first match.
         * .if array has duplicate values, and we need to find the first element,
         * other methods should be used.
         */

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        getBinary(sArray);

        int[] s1 = {1,2,3,4,5};
//        int[] s2 = {5,2,3,4,1};
        int[] s2 = {1,2,3,4,5};
        System.out.println(" both arrays are " + isTwoArraysEqual(s1, s2) );

    }
    public static void getBinary(String[] names){
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        if(Arrays.binarySearch(names, "Jane") >=2){
            System.out.println("found Jane in the list");
        }else{
            System.out.println("Jane Not found ");

        }
    }
    public static boolean isTwoArraysEqual(int[] s1, int[] s2){
        // Arrays.equal(int[], int[]) takes the order of the array elements as well.
        return Arrays.equals(s1, s2); // comparing two arrays using arrays method arrays.equals(int[], int[]);
    }
}
