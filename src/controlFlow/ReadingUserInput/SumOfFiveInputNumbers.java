package controlFlow.ReadingUserInput;
import java.util.Scanner;
/** In this challenge, you'll read 5 valid numbers from the console entered by the user
 * and print the sum of those five numbers.

 * By valid numbers, I mean you need to check that numbers entered are valid integers.
 * If they are not, print out the message "Invalid number" to the console, but continue
 * looping until you do have 5 valid numbers.

 * Before the user enters each number, prompt them with the message, "Enter number #x:",
 * where x represents the count 1,2, 3, etc.

 * As an example, the first message would look something like, "Enter number#1:", the next, "Enter number#2:", and so on.
 * */

public class SumOfFiveInputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i = 1;
            do{
               try{
                   System.out.println("Enter number#"+ i +":");
                   sum += isValidInput(scanner.nextLine()); i++;
               }catch (NumberFormatException nonNumeric){
                   System.out.println("Invalid number");
               }

            } while(i <= 5);
            System.out.println("Total sum: " + sum);

    }
    public static int isValidInput(String number){
        return Integer.parseInt(number);
    }

}
