package OOP_1.inheritance;

/** Object-Oriented Challenge:
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

 * A customer should not be allowed to withdraw funds if that withdraw funds withdrawal takes their balance negative
 *  you'll create an instance of an account class and test your withdrawal and deposit methods.
 * You'll print information to the console that confirms what the balance is after the methods are called.

 * */
public class bankAccount {
//    Scanner scanner = new Scanner(System.in);
    private int accountNumber;
    private double accountBalance;
    private String customerName = "Arin";
    private String email = "testName1@gmail.com";
    private String phoneNumber = "9801492631";

    /** rules for constructor:
     * 1. it has to be names as same as class name
     * 2. it has to be of no return type nor void.
     * Implicit constructor: default constructor & automatically created by java if no construct is made.
     * Explicit constructor: construct that is written and defined. can be define one or more with or without any params.

     * Key Differences:
     *
     * Implicit Constructor: Created by Java if no constructor is defined in the class.
     * Explicit Constructor: Defined by the programmer to control the initialization process of objects, either with or without parameters.
     * */
    public bankAccount(){
        // calling another constructor within the constructor
        // this() must be the first line in the execution of constructor if we put this() line after sout().
        // it will throw error
        this(56789, 2.50, "default name",
                "default address", "default phone");
        System.out.println("Empty constructor called");
        // this will throw error because this(...) should comes first before sout(...)
//        this(56789, 2.50, "default name",
//                "default address", "default phone");
    }

    public bankAccount(int numberAccount, double accountBalance, String customerName,
                        String customerEmail, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        // if we want this keyword only if we have the same parameter name else, we can have other name
        email = customerEmail;
        accountNumber = numberAccount;


    }


    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(double depositAmount){
        accountBalance += depositAmount;
        System.out.println(accountBalance + " deposited");

    }
    public void withdraw(double withdrawAmount){
        accountBalance -= withdrawAmount;
        if (accountBalance <= 0){
            System.out.println("insufficient balance");
            return;
        }
        System.out.println(accountBalance + " withdraw");

    }
}
