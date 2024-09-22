package controlFlow.whileloop;

/*  In this challenge, your task is to write a method with the name sumDigits that has a single parameter named
    number, of type int, and it should an int.

    The method should only take a number that is a positive number.

    If a negative number is passed. It should return -1, meaning. An invalid value was passed.

    The method should parse out each digit from the number and sum the digits up.

    So, if 125 is the value passed to the method, the code should sum each digit. In this case, i + 2 + 5,
    and return 8,as a value.

    And another example, if the value is 1000, the code should sum each digit 1 + 0 + 0 + 0,
    and return 1 as a value.

    If the number is a single digit number, simply return the number itself as the result.

    HINT: to parse the digit we can use module operator to get the last digit n % 10; n /10 to drop the last digit.



 */
public class SumOfDigits {
    public static void main (String[] args){
        System.out.println(sumOfDigits(125));
        System.out.println(sumOfDigits(1000));
        System.out.println(sumOfDigits(1));
        System.out.println(sumOfDigits(-125));
        System.out.println(sumOfDigits(4));
        System.out.println(sumOfDigits(32123));


    }
    public static int sumOfDigits(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0; //initial phase of sum as 0
        while (number != 0) {
            int lastDigit = number % 10; // get the last digit of numbers
            sum += lastDigit;            // add the last digit to with a sum
            number = number / 10;       //  get the left number of remaining digits of number
        }
        return sum;
    }
}
