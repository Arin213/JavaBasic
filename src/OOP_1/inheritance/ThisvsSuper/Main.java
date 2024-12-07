package OOP_1.inheritance.ThisvsSuper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(front3("chocolate"));


    }
    public static String front3(String str) {
        return str.length() >= 3 ? str.substring(0,3)
                + str.substring(0,3) + str.substring(0,3): str + str + str;
    }

}


