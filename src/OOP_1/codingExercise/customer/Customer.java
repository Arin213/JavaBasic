package OOP_1.codingExercise.customer;

/** Create  a new class, called Customer, with three fields:
 *  a. name
 *  b. credit limit
 *  c. email address.

 * Create the getter methods only for each field. you don't need to create the setters.

 * Create three constructors for this class.
 * a. First, create a constructor for all three fields which should assign the arguments directly to the instance fields.
 * b. Second, Create a no-args constructor that calls another constructor, passing some literal values for each argument.
 * c. And lastly, create a constructor with just the name and email parameters, which also calls another constructor.
 *
 * */
public class Customer {
    // creation of field or attributes
    private String name;
    private int creditLimit;
    private String emailAddress;

    //constructors;
    public Customer(){
        // calling constructors with 2 arguments
        this("unknown", "unknown.com");
    }
    public Customer(String name, String emailAddress){
        // calling constructors with 3 arguments , 2000 as default.
        this(name, 2000, emailAddress);
    }

    public Customer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    /** Illustration of chaining constructors where no arguments are passed will
     * call the constructor with 2 arguments
     * and constructors with 2 arguments will call with  constructors with 3 arguments default passed
     * as 2000 with 2 arguments constructors.
     * */

    // getter methods
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}
