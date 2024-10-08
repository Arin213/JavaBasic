package controlFlow.codingExercise;

/*  Shared Digit

Write a method named hasSharedDigit with two parameters of type int.

Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.


EXAMPLE INPUT/OUTPUT:

    hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

    hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

    hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers


NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.
* */

public class SharedDigit {
    public static void main (String[] args){
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(12, 43));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit(int start, int end){
        // check if both start and end is >= 10 and <= 99
        boolean firstValid = start >= 10 && start <= 99;
        boolean secondValid = end >= 10 && end <= 99;
        if (firstValid && secondValid) { // if valid, then run block
            int lastStart = start % 10; // get the last digit of start(x)
            int lastEnd = end % 10; // get the last digit of the end (y)
            start /=10;
            end /= 10;
            return lastStart == lastEnd || start == end || lastStart == end || lastEnd == start;
        }
        return false;

    }
}
