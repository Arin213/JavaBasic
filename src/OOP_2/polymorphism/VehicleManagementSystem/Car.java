package OOP_2.polymorphism.VehicleManagementSystem;

/**Car Class (extends Vehicle):

 Additional Attributes: numDoors

 Override methods: start(), stop()

 * */
public class Car extends Vehicles {
    private int numDoors = 4; //default values
    public Car(String make, String model, int year, String color, int numDoors) {
        super(make, model, year, color);
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        System.out.println(getClass().getSimpleName() + " is Starting.");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " is Stopping.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);

    }
}
