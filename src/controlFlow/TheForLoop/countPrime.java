package controlFlow.TheForLoop;

/* Create a prime number variable, that will keep count of how many
   prime numbers were found.
   Create a for statement, using any range of numbers, where the maximum number is
   <= 1000;

   For each number in the range:
   → Check to see it's a prime number using the isPrime method.
   → if the number is prime, print it out and increment the prime number counter-variables.
   → Once the prime number counter equals three, exit the loop (Hint, use the break statement to exit).
 *
 */
//import java.util.Scanner;
public class countPrime {
    public static void main (String[] args){
//        Scanner scn = new Scanner(System.in);
//        int wholeNumber = scn.nextInt();
        int count = 0;
        for(int i = 100; i <= 1000; i++){
            // check if the number is prime or not.
            if (isPrime(i)){
//                count += 1;
                count++;
                System.out.println("prime number = " + i); // get the prime number

                // if the counting reach to 3 then break the loop
                if (count == 3){
                    break;
                }
            }

        }
        System.out.println("Total count = "+ count);
    }
    public static boolean isPrime(int wholeNumber){
        // checking for 2 if the number is 2 then its prime if it is not then false;
        if (wholeNumber <= 2){
            return wholeNumber == 2;
        }
        // condition for number greater than 2 and checking if they are divisible by init number.
        // number is increment per loop that means 2 would become 3 and so on.
        for (int number = 2; number < wholeNumber; number ++){
            if(wholeNumber % number == 0){
                return false;
            }
        }
        return true;
    }

}
