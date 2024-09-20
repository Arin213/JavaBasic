package controlFlow.whileloop;

/*  Step 1 is to create a method isEvenNumber that takes a parameter of type int.
    Its purpose is to determine if the argument passed to the method is an even number or not.

    Return true from the method if it's an even number; otherwise, return false.
    Next, use a while loop to test a range of numbers from 5 up to and including 20, but
    printing out only the even numbers determined by the call to the IsEvenNumber method.
* */
public class EvenNumber {
    public static void main (String[] args){
        int number = 5;
        while (number <= 20){
            if (isEvenNumber(number)){
                System.out.println(number);
            }
            number++;
            
        }

    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
