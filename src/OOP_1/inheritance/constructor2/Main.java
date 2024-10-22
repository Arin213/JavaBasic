package OOP_1.inheritance.constructor2;

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

 * THE DEFAULT CONSTRUCTOR -> if a class contains no constructor declarations, then a default constructor is implicitly
 * declared.
 * This constructor has no parameters and is often called the no-args (no- arguments) constructor.
 * If a class contains any other constructor declarations, then a default constructor is NOT implicitly declared.
 * */

import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        /** actually calling the special construct. that creates class.
         * its purpose is to create the object from the class.
         * */
//        ba.setAccountBalance(10000);
//        ba.setAccountNumber(54321);
//        ba.setCustomerName("arin");
//        ba.setEmail("newmail11@gmai.com");
//        ba.setPhoneNumber("980343i4395");
        /** No need of  ↑ ↑ ↑ doing we can simply pass the value as param in down
         * here
        * */
        bankAccount ba = new bankAccount(54321, 2000.0, "javrin",
                "newmail11@gmai.com", "1234566789");

        /** ↑↑↑ above away of updating value to the field is kind of hindering and not clean
         * in order maintain the field and make it clean we can go with the constructor or initialization

         * Construction overloading: Constructor overloading is declaring multiple constructor with different
         * parameters.
         * The number of parameters can be different between constructors.
         * Or if the number of parameters is the same between two constructors, their types, or order of the types must
         * be differed.  here is the illustration example.
         *
         * class Car {
         *     String model;
         *     int year;
         *
         *     // Constructor 1: No parameters
         *     Car() {
         *         model = "Unknown";
         *         year = 0;
         *     }
         *
         *     // Constructor 2: One parameter
         *     Car(String m) {
         *         model = m;
         *         year = 0;
         *     }
         *
         *     // Constructor 3: Two parameters
         *     Car(String m, int y) {
         *         model = m;
         *         year = y;
         *     }
         *
         *     void display() {
         *         System.out.println("Model: " + model + ", Year: " + year);
         *     }
         * }
         *
         * public class Main {
         *     public static void main(String[] args) {
         *         Car car1 = new Car();  // Calls the first constructor
         *         Car car2 = new Car("Toyota");  // Calls the second constructor
         *         Car car3 = new Car("Honda", 2022);  // Calls the third constructor
         *
         *         car1.display();
         *         car2.display();
         *         car3.display();
         *     }
         * }
         * */

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
