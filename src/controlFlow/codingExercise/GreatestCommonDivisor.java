package controlFlow.codingExercise;

/*  Greatest Common Divisor

Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.

If one of the parameters is < 10, the method should return -1 to indicate an invalid value.

The method should return the greatest common divisor of the two numbers (int).

The greatest common divisor is the largest positive integer that can fully divide each of the integers
 (i.e., without leaving a remainder).


For example, 12 and 30:

12 can be divided by 1, 2, 3, 4, 6, 12

30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.


EXAMPLE INPUT/OUTPUT:

    getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder

    getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder

    getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10

    getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder


HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.

HINT: Find the minimum of the two numbers.


NOTE: The method getGreatestCommonDivisor​
should be defined as public static like we have been doing so far in the course.
* */
public class GreatestCommonDivisor {
    public static void main (String[] args){
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int first, int second){

        /* #EUCLID'S ALGORITHM:
            For finding the HCF or GCD, we can go with the Euclid's algorithms.
            First, we need dividend(first) and divider (second) and also the remainder.

            NOTE; always divider will be smaller than dividend, so we need to find the minimum value first
            now after getting min, we will go with loop until the remainder gets 0; i.e.,
            process of implementation of algorithms:
            1. First, we store the value of min at temporary var (int temp = minNumber); which will be necessary for swap.
            2. Now get the remainder by using module (%) of maxNumber % minNumber and update or store to minNumber.
            3. Now swap the value or give the (int temp) value to maxNumber (maxNumber = temp).
            4. "So the int temp value will go into maxNumber and store the value or remainder again to it which
                we get from the calculation minNumber = maxNumber % minNumber. Here is the test illustration:
                while (min ! = 0):
                    int temp = min
                    min = max % min
                    max = temp
                return max

                "
            4. Now this process keeps on going until the minNumber == 0;
        * */

        int maxNumber = Math.max(first, second);// get the max [a]
        int minNumber = Math.min(first, second);// get the min [b]

        if (first < 10 || second < 10){
            return -1;
        }
        while (minNumber !=0){  // condition, loop until min value is equal to 0 [ while ( b != 0);]
            int temp = minNumber; // store the value of min in temp [ int temp = b; ]
            minNumber = maxNumber % minNumber; //update the value of min by max % min which will go up in temp [b = a % b;]
            maxNumber = temp;  // now get the stored value in temp to max [int a = temp;]
        }
        return maxNumber;

    }
}
