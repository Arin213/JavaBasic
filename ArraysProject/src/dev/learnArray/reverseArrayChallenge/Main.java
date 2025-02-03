package dev.learnArray.reverseArrayChallenge;

/* The challenge is to write a method called reverse() that takes an int array as a parameter.
In the main method, call the reverse method and print the array before an after the reverse method called.

To reverse the array, you have to swap the elements so that the first element is swapped with the last element and so on.

For example, if the array contains the numbers 1,2,3,4,5 then the reversed array should be,
5,4,3,2,1.
* */

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arr = {23,433,10,2,3434,34};
        System.out.println("before reverse: " + Arrays.toString(arr));
        reverse(arr);
//        int[] rev = reverse(arr);
//        System.out.println("after reverse: " + Arrays.toString(rev));
        System.out.println("after reverse: " + Arrays.toString(arr));
    }

    //reversing array with the existing array with swapping elements
    private static void reverse(int[]arr){
      int len = arr.length;

      /*we are dividing the length of the array by 2 because we are swapping the elements and swapping
      to half the length of the array is enough to reverse the array. even the length is odd number.
      * */
      for(int i = 0; i < len/2; i++){ //len/2 = 6/2 = 3
          int temp = arr[i]; //23
          arr[i] = arr[len-1 -i]; //arr[0] = arr[6-0] = 34
          arr[len-1-i] = temp; //arr[6] = 23
      }
    }

//    //reverse array with the creating new array
//    private static int[] reverse(int[] arr){
//        int[] reverseArray = new int[arr.length];
//        int len = arr.length-1;
//
//        for(int i = 0; i < arr.length; i++){
//            int temp = arr[i]; //23
//            reverseArray[i] = arr[len]; //reverseArray[0] = 34(arr[len] = 34)
////            arr[len] = temp; // arr[5 or(6-1)] = 23 (temp = 23)
//            len --; //len(5-1)
//
//
//        }
//        return reverseArray;
//    }
}
