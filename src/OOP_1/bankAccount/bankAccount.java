package OOP_1.bankAccount;

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
