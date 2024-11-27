package OOP_1.inheritance.Worker;

public class Employee extends Worker{
//    private long employedID;
    private  String hireDate;

    public Employee() {

    }
    public static int employedID = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employedID = Employee.employedID++;
        this. hireDate = hireDate;
    }


}

class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate,
                            String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    @Override
    public double collectPay() {
        double paycheck = annualSalary/26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck: paycheck;
        
        return (int) adjustedPay;
    }

    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }


}

class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate,
                          double hourlyPayRate){
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;

    }
    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }

}
