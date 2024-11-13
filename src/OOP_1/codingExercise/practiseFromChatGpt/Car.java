package OOP_1.codingExercise.practiseFromChatGpt;

public class Car extends Vehicle{
    private int numbersOfDoors ;
    private boolean hasAirConditioning;

    // default constructor
    public Car(){
        super();
        this.numbersOfDoors = 4;
        this.hasAirConditioning = true;
    }

    //chaining constructor
    public Car(String type, double weight){
        this(type, weight, 4, true);
    }

    public Car(String type,  double weight, int numbersOfDoors, boolean hasAirConditioning) {
        super(type, (weight < 200 ? "Small": weight < 900 ? "Medium": "Large"), weight);
        this.numbersOfDoors = numbersOfDoors;
        this.hasAirConditioning = hasAirConditioning;
    }


    // override the method
    @Override
    public void move(String speed) {
        super.move(speed);
    }

    // again override toString()
    @Override
    public String toString() {
        return "Car{" +
                "numbersOfDoors=" + numbersOfDoors +
                ", hasAirConditioning=" + hasAirConditioning +
                "} " + super.toString();
    }

}
