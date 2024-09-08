package codingExercise;

/*
    Write a method called checkNumber with an int parameter named number.
    The method should not return any value, and it prints out:
    - "positive" if the parameter number is > 0
    - "negative" if the parameter number is < 0
    - "Zero" if the parameter number is equal to 0

    NOTE: The checkNumber method needs to be defined as public static like we have been doing
    so far in the course.

    NOTE: Do not add a main method to your solution to your code!
 */
import java.util.Scanner;
public class sample {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        PositiveNegativeZero(number);

    }
    public static void PositiveNegativeZero(int number){
        System.out.println(number > 0 ? "positive": number < 0 ? "negative":"zero" );
    }
}
