package controlFlow.TheForLoop;

public class Main {
    public static void main (String[] args){
        for (double rate = 2.0; rate<= 5.0; rate ++){
            System.out.println("10,000 at " + rate + " interest = " + calculateInterest(10000.0,rate));
        }
        /*  one way of calculating the interest using this one however it would be more tackling if we have
            to go through the calculation of 100 s of interest.For this we can simply go with the automation process
            which we can get through the looping, and this is how loop can be very handy.
        * */
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,3.0));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,4.0));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,5.0));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,6.0));
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/ 100));
    }
}

