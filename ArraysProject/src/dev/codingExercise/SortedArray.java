package dev.codingExercise;
import java.util.Arrays;
import java.util.Scanner;

/**Sorted Array

 Create a program using arrays that sorts a list of integers in descending order.

 Descending order is the highest value to lowest.

 In other words if the array had the values in it [106, 26, 81, 5, 15]
 your program should ultimately have an array with [106, 81, 26, 15, 5] in it.

 Set up the program so that the numbers to sort are read in from the keyboard (Scanner).


 Implement the following methods:

 getIntegers has one parameter of type int which is the size of the array.
 It returns an array of entered integers from the keyboard.

 printArray accepts an array and prints out the contents of the array. It should be printed in the following format:

 Element 0 contents 106
 Element 1 contents 81
 Element 2 contents 26
 Element 3 contents 15
 Element 4 contents 5

 sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.


 The scenario is:

 1. getIntegers() is called.

 2. The returned array from getIntegers() is then used to call sortIntegers().

 3. The returned array from sortIntegers() is then printed to the console.

 [Do not try and implement this. It is to give you an idea of how the methods will be used]


 TIP: you will have to figure out how to copy the array elements from the passed array into a new array and
 sort them and return the new sorted array.

 TIP: Instantiate (create) the Scanner object inside the method.

 TIP: Be extremely careful about spaces in the printed message.



 * */
public class SortedArray {
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        int[] getArray = getIntegers(num,scan);
//        System.out.println(Arrays.toString(getArray));
//        getSortedArray(getArray);
        int [] num1 = getIntegers(5);
        int [] sort1 = sortIntegers(num1);
        printArray(sort1);

    }
    public static int[] getIntegers(int num){
        Scanner scan = new Scanner(System.in);
        int[] numArray = new int[num];
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = scan.nextInt();
        }
        return numArray;
    }
    public static int[] sortIntegers(int[] getIntegers){
        int[] newSortedArr = Arrays.copyOf(getIntegers, getIntegers.length);
        Arrays.sort(newSortedArr);//sort the array in accending order.
        // System.out.println(Arrays.toString(newArr));
        return newSortedArr;

    }
    public static void printArray(int[] sortIntegers){
        for(int i = 0; i < sortIntegers.length; i++){
            System.out.println("Element " + i + " contents " + sortIntegers[(sortIntegers.length - 1) - i]);
        }
    }
    //getIntegers has one parameter of type int which is the size of the array.
    //It returns an array of entered integers from the keyboard.
    // Scanner scan is passed as args to access otherwise it would be hard to access the scan obj from main methos
//    public static int[] getIntegers(int num, Scanner scan){
//        int[] numArray = new int[num];
//        for(int i = 0; i < numArray.length; i++){
//            numArray[i] = scan.nextInt();
//        }
//        return numArray;
//    }
//    public static void getSortedArray(int[] getArray){
//        int[] newArr = Arrays.copyOf(getArray, getArray.length);
//        Arrays.sort(newArr);
//        System.out.println(Arrays.toString(newArr));
////        System.out.println(Arrays.toString(getArray));
//        for(int i = 0; i < getArray.length; i++){
//            System.out.println("Elements " + i + " contents " + getArray[(getArray.length - 1) - i]);
//        }
//    }



}



















