package OOP_1.codingExercise.CarepetCostCalculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) { // in oop we can pass the instance of class as parameter
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost(); // because of Floor floor(instance) and Carpet as class and carpet(instance)
    }
}
