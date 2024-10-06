package controlFlow.codingExercise;

/**Largest Prime

 Write a method named getLargestPrime with one parameter of type int named number.

 If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.


 The method should calculate the largest prime factor of a given number and return it.


 EXAMPLE INPUT/OUTPUT:

 getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)

 getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)

 getLargestPrime (0); should return -1 since 0 does not have any prime numbers

 getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

 getLargestPrime (-1); should return -1 since the parameter is negative


 HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
 * */

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); // 7
        System.out.println(getLargestPrime(20)); // 5
        System.out.println(getLargestPrime(217)); // 31
        System.out.println(getLargestPrime(0)); // -1
        System.out.println(getLargestPrime(45)); // 5
        System.out.println(getLargestPrime(-1)); // -1
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(31));
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(199));
        System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime(12));
        System.out.println(getLargestPrime(16));

    }

    public static int getLargestPrime(int number) {
        int rangeNumber = (int)Math.sqrt(number); // get the range of prime number to check for given n0.[2,3,5,7.n]
        int largestPrime = -1;
        if (number < 2){
            return -1;
        }
//        if (number == 2) {
//            return 2;
//        }
        /** Checking if the prime is 2 or not and keep one checking until the number is not divisible by 2
         * now the largest prime is not 2 if the number can't' divided further so left number is divided by the remaining
         * prime number
         * */
        while(number % 2 == 0){
            largestPrime = 2;
            number/=2;

        }
        /** now left remaining number is dealt with the number from 3 and so on. we need the largest not the number,
         *  so if the number is not possible with 2 then need to check with 3, 5 and 7 and so on. for the range of prime
         *  number we can get the range by simple square root of given numbers let say 21, so its sqrt is 4.5825. but
         *  we can leave the fraction part and let the range be 4 for 21, so the prim number starts from 3 to 4
         *
         *  NOTE- if the number is not divisible up to the given range of for loop, then the number itself is checked
         *  if it is greater than 2 or not if it is then the largest prime number would be that number itself
         *  let say 7 and 199
         *
        * */
        for (int primeNumber = 3; primeNumber <= rangeNumber; primeNumber += 2){
            while(number % primeNumber == 0){
                largestPrime = primeNumber;
                number /= primeNumber;
            }
        }
        // this is for checking if the number is > 2 or not.if it is then number itself the largest prime.
        if (number > 2){
            largestPrime = number;
        }
        return  largestPrime;
    }
}