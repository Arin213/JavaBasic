package dev.learnArray.ArrayChallenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**Create a program using arrays that sorts a list of integers in descending order.
 * Descending order means from highest value to lowest.
 *
 * In other words,if the array has the value 50,25,80,5, and 15, your program should return
 * an array with the values in the descending order: 80,50,25,15 and 5.
 *
 * First,create an array of randomly generated integers.
 * Print the array before you sort it.
 * and print the array after you sort it.
 * you can choose to create a new sorted array or just sort the current array.
 * */
public class Main {
    public static void main(String[] args){

        //random and Scanner
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        // get the getIntArray:
        int[] sortedArray = getIntArray(num);

        //get he descended array:
        int [] descendedAarray = new int[sortedArray.length];
        for(int i = 0; i < sortedArray.length; i++){
            descendedAarray[i] = sortedArray[sortedArray.length-1-i];
        }
        System.out.println("descended sorted array: \n" + Arrays.toString(descendedAarray));
    }
    public static int[] getIntArray(int num){
        Random rand = new Random();

        int[] intArray = new int[num];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = rand.nextInt(100);
        }
        System.out.println("before sort: \n" +Arrays.toString(intArray));
        Arrays.sort(intArray); //Arrays.sort() will sort the array.
        System.out.println("After sort: \n" + Arrays.toString(intArray));
        return intArray;
    }

}
