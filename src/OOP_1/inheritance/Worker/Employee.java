package OOP_1.inheritance.Worker;

public class Emplyoee extends Worker{
    private long employedID;
    private  String hireDate;

    public Emplyoee() {

    }

    public Emplyoee(String name, String birthDate, String endDate, long employedID, String hireDate) {
        super(name, birthDate);
        this.employedID = employedID;
        this. hireDate = hireDate;
    }

    
}

class SalariedEmployee extends Emplyoee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employedID,
                            String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employedID, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
}
