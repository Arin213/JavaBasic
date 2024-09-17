package controlFlow.TheForLoop;

/*  =====================
Sum 3 and 5 Challenge
=====================

*Create a for loop using a range of numbers from 1 to 1000 inclusive.

*Sum all the numbers that can be divided by both 3 and 5

*Print out the numbers that have met the above conditions

*Break out of the loop once you have found 5 numbers that met the conditions.

*After breaking out of the loop, print the sum of the numbers that met the conditions.

*Note: type all code in the main method

* */
public class SumOfThreeAndFive {
    public static void main (String[] args){
        int count = 0;
        int totalSum = 0;
        for (int i = 1; i <= 1000; i++){
            if(count == 5){
                break;
            }
            if (i % 3 == 0 && i % 5 == 0){
                count ++;
                System.out.println("The number divided by 3 & 5 = "+ i);
                totalSum  += i;
            }
        }
        System.out.println("The total sum of numbers divided by 3 & 5 = "+ totalSum);
    }

}
