package dev.learnArray.reverseArrayChallenge.reverse;

import java.util.Arrays;
import java.util.Scanner;

/*Reverse Array

Write a method called reverse() with an int array as a parameter.

The method should not return any value. In other words, the method is allowed to modify the array parameter.


To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].


The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]

and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]


TIP: When swapping the elements, use a variable to temporarily hold the current element.


NOTE: The method should be defined as private static.
* */
public class reverseArray {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] array = getArray(size);
        reverse(array);

    }
    private static int[] getArray( int size){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();

        }
        return arr;
    }

    private static void reverse(int[] arr){
        int len = arr.length;
        System.out.println("Array = " + Arrays.toString(arr));
        for(int i = 0; i < len/2; i++){
            int temp = arr[i];
            arr[i] = arr[len-1 -i];
            arr[len-1-i] = temp;
            System.out.println("--> " + Arrays.toString(arr));
        }
    }
}
