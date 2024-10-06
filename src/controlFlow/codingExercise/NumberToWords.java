package controlFlow.codingExercise;

/*  Number To Words

Write a method called numberToWords with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative, print "Invalid Value".

To print the number as words, follow these steps:

    Extract the last digit of the given number using the remainder operator.

    Convert the value of the digit found in Step 1 into a word.
    There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
    Print the corresponding word for each digit, e.g., print "Zero" if the digit is 0, "One" if the digit is 1, and so on.

    Remove the last digit from the number.

    Repeat Steps 2 through 4 until the number is 0.

The logic above is correct, but in its current state, the words will be printed in reverse order.
For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four".
To overcome this problem, write a second method called reverse.

The method reverse should have one int parameter and return the reversed number (int).
For example, if the number passed is 234, then the reversed number would be 432.
The method reverse should also reverse negative numbers.

Use the method reverse within the method numberToWords to print the words in the correct order.

Another thing to keep in mind is any reversed number with leading zeroes (e.g., the reversed number for 100 is 001).
The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero".
To solve this problem, write a third method called getDigitCount.

The method getDigitCount should have one int parameter called number and return the count of the digits in that number.
If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100,
the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

Example Input/Output - getDigitCount method

    getDigitCount(0); should return 1 since there is only 1 digit

    getDigitCount(123); should return 3

    getDigitCount(-12); should return -1 since the parameter is negative

    getDigitCount(5200); should return 4 since there are 4 digits in the number

Example Input/Output - reverse method

    reverse(-121); should  return -121

    reverse(1212); should return  2121

    reverse(1234); should return 4321

    reverse(100); should return 1

Example Input/Output - numberToWords method

    numberToWords(123); should print "One Two Three".

    numberToWords(1010); should print "One Zero One Zero".

    numberToWords(1000); should print "One Zero Zero Zero".

    numberToWords(-12); should print "Invalid Value" since the parameter is negative.


HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example,
      100 reversed becomes 1, but the method numberToWords should print "One Zero Zero".
      To get the number of zeroes, check the difference between the digit count from
      the original number and the reversed number.

NOTE: When printing words, each word can be in its own line. For example, numberToWords(123); can be:

    One
    Two
    Three

They don't have to be separated by a space.

NOTE: The methods numberToWords, getDigitCount, reverse should be defined as
      public static like we have been doing so far in the course.

NOTE: In total, you have to write 3 methods.
* */
public class NumberToWords {
    public static void main (String[] args){
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(100);
        numberToWords(-12);
        numberToWords(10);
        numberToWords(101);

    }
    /** This is the method as we will go through to convert the numbers into words
     * for this we will loop using for loop and for that we will get the range from digitCount. Also,
     * we got reverse number which we will use to get the number reversed again to fill back to the ascending order
     * why ? because when converting the given number into words, we have to take every digit form the given number
     * and that can be possible by using % (module) to get the remainder which will be the last of that given number
     *  until the number gets to 0 so, if we directly pass the number and extract the digit we will get reverse number
     *  which is not what we want if the number is given as 123 then convert into One, Two, Three not 321 so we need
     *  to reverse the number and again reverse that reverse number so first we will reverse the given number by using
     *  method reverse, and finally we will revere the reversed number here in this finalised method.
     *  [first 123 → method reverse(n) = 321 and again 321 → numberToWords(n) = 123]
    * */
    public static void numberToWords(int number){
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int length = getDigitCount(number);
        int getReverse = reverse(number);
        for (int i = 0; i < length; i++){
            int reverseAgain = getReverse % 10;
            String numberWord = switch (reverseAgain){
//              case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "zero";
            };
            System.out.println(numberWord);
            getReverse /= 10;
        }
        System.out.println(" ");
    }

    /** This method will simply revers the number (e.g., 123 → 321) and return the reverse number that we will use
     * in up given method numbersToWords(number).
    * */
    public static int reverse(int number){
        int reversedNumber = 0;
        while (number != 0){
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit ;
            number/= 10;
        }
        return reversedNumber;

    }
    /** First, we take the number and loop over until the number get to 0
       the main part of this method getDigitCount(int number) is to count the total
       number of digits and return that number that we use as length of number;
       first removed the last digit (using /) and count that for each removal of last digit until
       number is equal to zero.
    * */

    public static int getDigitCount(int number){
        if (number < 0){
            return  -1;
        }

        int totalDigit = 0;

        do {
            totalDigit++;
            number/=10;
        }while (number > 0);

        return totalDigit;
    }


}
