package controlFlow.TheForLoop;
import java.util.Scanner;
public class ThePrimeNumberChallenge {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int inputNumber = scn.nextInt();
        System.out.println( inputNumber +" is "+ (isPrime(inputNumber) ? "": "NOT") + " a prime number");
//        System.out.println("1 is "+ (isPrime(1) ? "": "NOT") + " a prime number");
//        System.out.println("2 is "+ (isPrime(2) ? "": "NOT") + " a prime number");
//        System.out.println("3 is "+ (isPrime(3) ? "": "NOT") + " a prime number");
    }
    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int number = 2; number < wholeNumber; number++ ){
            if(wholeNumber % number == 0){
                return false;
            }
        }
        return true;
    }
}
