package controlFlow.ReadingUserInput;
import java.util.Scanner;
/** You'll be using an endless loop which:
 * Prompts the user to enter a number or any character to quit
 * Validates if the user-entered data really is a number. You can choose either an integer
 * or double validation method.
 * if the user-entered data is not a number, quit the loop.
 * keep track of the minimum number entered.
 * keep track of the maximum number entered.

 * If the user has previously entered a set of numbers (or even just one), display the minimum
 * and maximum number that the user entered.
 * */
public class MinMax {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int count = 0;
        boolean flag = false;
        do {
            System.out.println("Enter a number or any character to quit: ");
            String number = scanner.nextLine();
            try {
                int parseNumber = Integer.parseInt(number);
                if (count == 0 || parseNumber < min ){ //count == 0 will handle the numbers that are not sequence.
                    min = parseNumber;
                }
                if(count == 0 || parseNumber > max) {
                    max = parseNumber;
                }
                count++;
            } catch (NumberFormatException nonNumeric) {
                break;
            }
        } while (!flag);
        if (count > 0) {
            System.out.println("MIN: " + min + "\n" + "MAX: " + max );
        }else{
            System.out.println("No valid data entered");
        }

    }
}
