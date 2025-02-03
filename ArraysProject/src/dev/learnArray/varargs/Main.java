package dev.learnArray.varargs;

/*Notice here that the parameter to the main method is an array of String.
        This means we can pass an array of Strings to this method when it's called.
        Or,if we use this method as the entry point to our application, we can pass data on the
        command line to this method.

        Up until now,we've seen this particular method signature.
        But this signature can be written in a slightly different way.
        We can replace the brackets after the String type, which we know tells us this method will
        take an array of String.
        And we can replace it with three dots.

        This is a special designation for java that mean java will take zero, one, or many Strings
        as arguments to this method and create an array with which to process them in the method.
        THe array will be called args and be of type String.
        so, what's the difference then ?
        The difference is minor within the method body but significant to the code that calls the method.
        public static void main(String... args){
            //code here
        }
        * */

public class Main {
//    public static void main (String[] args){
//
//
//    }
    public static void main(String... args) { //args as array of String type
        System.out.println("hello, World! again!");

        //split the string into array of strings by "space"
        String[] splitStrings = "Hello World! again!".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(10));
        printText("hello");

        System.out.println("_".repeat(10));
        printText("hello", "World", "Again");

        System.out.println("_".repeat(10));
        printText();

        // using array as method arguments so that is variable arguments.
        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));



    }

    /*There can be only one variable argument in a method.
    The variable argument must be the last argument.
    * */

    private static  void printText(String... textList){
        for(String t: textList){
            System.out.println(t);
        }
    }
}
