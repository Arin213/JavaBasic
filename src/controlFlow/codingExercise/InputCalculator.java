package controlFlow.codingExercise;
import java.util.Scanner;
/**Input Calculator

 Write a method called inputThenPrintSumAndAverage that does not have any parameters.

 The method should not return anything (void), and it needs to keep reading int numbers from the keyboard.

 When the user enters something that is not an int, then it needs to print a message in the format "SUM = XX AVG = YY".

 XX represents the sum of all entered numbers of type int.
 YY represents the calculated average of all numbers of types long.


 EXAMPLES OF INPUT/OUTPUT:

 EXAMPLE 1:

 INPUT:

 1
 2
 3
 4
 5
 a

 OUTPUT

 SUM = 15 AVG = 3


 EXAMPLE 2:

 INPUT:

 Hello

 OUTPUT:

 SUM = 0 AVG = 0


 TIP: Use Scanner to read an input from the user.

 TIP: Use casting when calling the round method since it needs double as a parameter.

 NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.

 NOTE: Be mindful of spaces in the printed message.

 NOTE: Be mindful of users who may type an invalid input right away (see example above).

 NOTE: The method inputThenPrintSumAndAverage should be defined as public static like we have been doing so far in the course.
//InputMismatchException

 * */

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        int count = 0;
        int totalSum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String stringNum = scanner.nextLine();
                int number =Integer.parseInt(stringNum);
                totalSum += number;
                count++;

            } catch (NumberFormatException nonNumeric) {
                break;
            }
        }
        if (count > 0) {
            long average =Math.round((double) (totalSum) / count);
            System.out.println("SUM = " + totalSum + " AVG = " + average);
        } else {
            System.out.println("SUM = 0 AVG = 0");
        }


    }
}



