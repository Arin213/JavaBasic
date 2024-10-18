package OOP_1.bankAccount;

/** Object-Oriented Challenge
 * Create a nw class for a bank account.

 * Create fields for account characteristics like
     * 1. Account number.
     * 2. Account balance.
     * 3. Customer name
     * 4. Email
     * 5. Phone number.

 * Create getters and setters for each field.

 * Create two additional methods.
     * 1. One for depositing funds into the account.
     * 2. One for withdrawing funds form the account,

 * A customer should not be allowed to withdraw funds if that withdraw funds if that
 * withdrawal takes their balance negative
 *  you'll create an instance of an account class and test your withdrawal and deposit
 *  methods.
 * You'll print information to the console that confirms what the balance is after the methods are called.
* */
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        bankAccount ba = new bankAccount();
        ba.setAccountBalance(10000);
        while(true){
            try{
                System.out.println("Enter your pin or press any key to quit: ");
                String pinCard = sc.nextLine();
                int convert = Integer.parseInt(pinCard);
                if(convert == 1234){
                    System.out.println("please input :");
                    String depositOrWithdraw = sc.nextLine().toLowerCase();
                    switch(depositOrWithdraw){
                        case "deposit" -> {
                            System.out.println("Enter the amount for deposit: ");
                            double amountDeposit = sc.nextDouble();
                            ba.deposit(amountDeposit);
                        }
                        case "withdraw" -> {
                            System.out.println("Enter Amount for withdraw: ");
                            double amountWithdraw = sc.nextDouble();
                            ba.withdraw(amountWithdraw);

                        }
                        default -> {
                            System.out.println("Invalid input");
                        }
                    }
                }

            } catch (NumberFormatException nonNumeric) {
                break;
            }
            sc.nextLine();

        }
    }
}
