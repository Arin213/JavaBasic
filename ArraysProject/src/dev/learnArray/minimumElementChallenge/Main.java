package dev.learnArray.minimumElementChallenge;

/** Write a method called readIntegers() that read a common delimited list of
 * Numbers entered by the user from the console, and then returns an array
 * containing the numbers that were entered.
 *
 *Next, write a method findMin() with takes the array as an argument and returns the minimum value found in that array.
 *
 *  In the main method :
 *   call the method readIntegers() to get the array of integers from the user, and
 *   print these out using a method found in java.util.Arrays.
 *   Next, call the findMin method, passing the array, returned from the call to the readIntegers method.
 *   print the minimum element in the array, which should be returned from the findMin method.
 *
 * A tip here.Assume that user will only enter numbers, so we don't need to do any validation for the console input.
 *
 *
 * */
//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        int[] numbers = readIntegers(input);
        System.out.println(Arrays.toString(numbers));
        int minNumber = findMin(numbers);
        System.out.println("The minimum number is: " + minNumber);
    }

    //get the string of numbers and return an array of integers using split to get the string of numbers and
    // Integer.parseInt to convert the string to integer.
    private static int[] readIntegers(String input){
        String [] splitNumbers = input.split(",");
        int[] numbers = new int[splitNumbers.length];
        for(int i = 0; i < splitNumbers.length; i++){
            numbers[i] = Integer.parseInt(splitNumbers[i].trim()); // trim() removes leading and trailing white spaces.
        }
        return numbers;
    }

    //find the minimum number in the array of numbers that has been passed to it.
    private static int findMin(int[] numbers){
//        int min = numbers[0];
        int min = Integer.MAX_VALUE;
        for(int num: numbers){
            if(num < min){
                min = num;
            }
        }
        return min;

    }



}
