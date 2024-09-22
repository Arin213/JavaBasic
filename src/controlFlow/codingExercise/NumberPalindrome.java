package controlFlow.codingExercise;

/*  Number Palindrome:

Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number, otherwise it should return false.

Check the tips below for more info about palindromes.

Example Input/Output

    isPalindrome(-1221); → should return true

    isPalindrome(707); → should return true

    isPalindrome(11212); → should return false because the reverse is 21,211 and that is not equal to 11212.

Tip: What is a Palindrome number?  A palindrome number is a number that when reversed is equal to the original number.
For example, 121, 12321, 1001 etc.

Tip: Logic to check a palindrome number

Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.

If both are the same, then the number is a palindrome otherwise it is not.

Tip: Logic to reverse a number

Declare and initialize another variable to store the reverse of a number, for example, reverse = 0.

Extract the last digit of the given number by performing the modulo division (remainder).
Store the last digit to some variable say lastDigit = num % 10.
Increase the place value of reverse by one.
To increase place value, multiply the reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse.
Since the last digit of the number is processed, remove the last digit of num.
To remove the last digit divide number by 10.
Repeat steps until the number is not equal to (or greater than) zero.

A while loop would be good for this coding exercise.


Tip: Be careful with negative numbers. They can also be palindrome numbers.

Tip: Be careful with reversing a number,
you will need a parameter for comparing a reversed number with the starting number (parameter).

* */

public class NumberPalindrome {
    public static void main (String[] args){
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome(int number){
        int storeNumber = number; //store number to compare with the reverse with later;
        int reverse = 0; // initialize the reverse to 0;
        while (number != 0){
            int lastDigit = number % 10; // get the last digit of int number;
            reverse = reverse * 10 ; // multiply the reverse by 10 to store the last digit at first to be reversed
            reverse += lastDigit; // add the last digit from the first index as start point.
            number = number / 10; // remove the last digit and store the left number or update the number.

        }
        return reverse == storeNumber; // compare the reverse number with storeNumber and return its bool;

    }
}
