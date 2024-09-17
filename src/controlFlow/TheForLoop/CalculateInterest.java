package controlFlow.TheForLoop;

/*  Using a new for statement, call the calculateInterest method with the dollar amount of 100.
    And this time, use the interest rates between 7.5 and 10, but increment by a quarter of a
    percent each time, meaning 0.25 percent.

    And print the results to the console window.
* */
public class CalculateInterest {
    public static void main (String[] args){
        for(double rate = 7.5; rate <= 10; rate += 0.25){
            if (rate > 8.5){
                break;
            }
            System.out.println("$100.00 at "+ rate + "% interest = $" + calculateInterest(100.0, rate));
        }
    }
    // define new method to calculate the interest and return:
    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);

    }

}
