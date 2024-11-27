package OOP_1.inheritance.Worker;

/**Challenge is to create the worker class,
 * the employee class,and either the SalariedEmployee
 * or the hourlyEmployee class.
 *
 * for each class, create the attributes and methods shown
 * on this diagram.
 *
 * Create a main method that will create either a SalariedEmployee
 * or HourlyEmployee, and call the methods, getAge, collectPay, and the
 * methods shown for the specific type of class you decide to implement.
 *
 * So, if you implement SalariedEmployee, then execute retire().
 * if you implement HourlyEmployee, then execute getDoublePay().
 *
 * */

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
//        this.endDate = endDate;
    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
