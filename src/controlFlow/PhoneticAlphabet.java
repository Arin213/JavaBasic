package controlFlow;

import java.util.Scanner;

public class PhoneticAlphabet {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        char inputChar =  scn.next().charAt(0);

        // Traditional switch
        // all char should be in uppercase:
        switch (inputChar){
            case 'A':
                System.out.println("Able");break;
            case 'B':
                System.out.println("Baker");break;
            case 'C':
                System.out.println("Charlie");break;
            case 'D':
                System.out.println("Dog");break;
            case 'E':
                System.out.println("Easy");break;
            default:
                System.out.println(inputChar + " was not found.");break;

        }
    }
}
