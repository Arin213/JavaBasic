package controlFlow.codingExercise;

/*  First And Last Digit Sum

Write a method named sumFirstAndLastDigit with one parameter of type int called number.

The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.

If the number is negative then the method needs to return -1 to indicate an invalid value.

Example input/output

    sumFirstAndLastDigit(252); → should return 4, the first digit is 2, and
    the last is 2 that gives us 2+2, and the sum is 4.

    sumFirstAndLastDigit(257); → should return 9, the first digit is 2, and
    the last is 7 that gives us 2+7, and the sum is 9.

    sumFirstAndLastDigit(0); → should return 0, the first digit, and
    the last digit is 0 since we only have 1 digit, which gives us 0+0, and the sum is 0.

    sumFirstAndLastDigit(5); → should return 10, the first digit, and
    the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.

    sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.


NOTE: The method sumFirstAndLastDigit​
needs to be defined as public static like we have been doing so far in the course.
* */
public class FirstLastDigitSum {
    public static void main (String[] args){
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
//        int sumFirstAndLast = 0;
        int sumFirstAndLast = number % 10;
        while(0 != number){ // wow, new flipping idea !!
            if (number < 10){ // condition to check if the number is single digit number that will be the first digit;
                sumFirstAndLast += number; // add that single digit to sumFirstAndLast
            }
            number /= 10; // else keep on dividing to get the left digit


        }
        return sumFirstAndLast;

    }
}
