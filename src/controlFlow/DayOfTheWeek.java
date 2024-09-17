package controlFlow;
import java.util.Scanner;
public class DayOfTheWeek {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println("Use of Enhanced Expression with void: ");
        printDayOfWeek(number);
        System.out.println(" ");
        System.out.println("Use of Enhanced Expression with return: ");
        System.out.println(dayOfTheWeek(number));
    }
    public static void printDayOfWeek(int number){
        switch (number){
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Day");
        }

    }
    public static String dayOfTheWeek(int number){
        return switch (number){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";

        };

    }
}
