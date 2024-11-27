package OOP_1.inheritance.Worker;

public class Main {
    public static void main (String[] args){
        Employee tim = new Employee("tim", "11/11/1985",
                "01/03/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee jow = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020",300000,false);

        System.out.println(jow);
        System.out.println("Joe's paycheck = $" + jow.collectPay());
        jow.retire();
        System.out.println("joe's Pension check = $" + jow.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Marry", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Marry's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday pay = $" + mary.getDoublePay());
    }
}
