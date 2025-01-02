package OOP_2.polymorphism.VehicleManagementSystem;

/**
 * Truck Class (extends Vehicle):
 *  Additional Attributes: cargoCapacity
 *
 *  Override methods: start(), stop()
 */

public class Truck extends Vehicles {
    private int cargoCapacity = 0; //default values
    public Truck(String make, String model, int year, String color, int cargoCapacity) {
        super(make, model, year, color);
        this.cargoCapacity = cargoCapacity;
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
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
