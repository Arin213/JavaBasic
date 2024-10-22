package OOP_1.codingExercise.customer;

public class Main {
    public static void main (String[] args){
        //invoking or creating instances of class
        Customer cus = new Customer("Arin", 1000, "example1@gmail.com");
        System.out.println(cus.getName());
        System.out.println(cus.getCreditLimit());
        System.out.println(cus.getEmailAddress());

        //new instance with no args
        Customer secondCus = new Customer();
        System.out.println(secondCus.getName());
        System.out.println(secondCus.getCreditLimit());
        System.out.println(secondCus.getEmailAddress());

        // new instance with 2 args:
        Customer thirdCus = new Customer("un sung", "unsung1@gmail.com");
        System.out.println(cus.getName());
        System.out.println(cus.getCreditLimit());
        System.out.println(cus.getEmailAddress());
    }

}
