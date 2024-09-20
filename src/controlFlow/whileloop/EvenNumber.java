package controlFlow.whileloop;

/*  Step 1: is to create a method isEvenNumber that takes a parameter of type int.
    Its purpose is to determine if the argument passed to the method is an even number or not.

    Return true from the method if it's an even number; otherwise, return false.
    Next, use a while loop to test a range of numbers from 5 up to and including 20, but
    printing out only the even numbers determined by the call to the IsEvenNumber method.

    Step 2: step 2 is to modify the while code.
    Make it also record that total number of even numbers it has found.
    Break out of the loop once 5 even numbers are found.
    Finally, display the total number of odd and even numbers found.
* */
public class EvenNumber {
    public static void main (String[] args){
        int number = 5;
        int totalEvenNumber = 0; // get the total even number
        int totalOddNumber = 0; // get total odd number
        while (number <= 20){
            if (totalEvenNumber == 5){ // if even number is total of 5 then break the loop
                break;
            }
            if (isEvenNumber(number)){
                System.out.println(number);
                totalEvenNumber ++;
            }else{
                totalOddNumber ++;
            }
            number++;

        }
        System.out.println("Total even number = " + totalEvenNumber);
        System.out.println("Total odd number = " + totalOddNumber);

    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
