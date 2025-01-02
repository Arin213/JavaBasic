package OOP_2.polymorphism.VehicleManagementSystem;

/**Bike Class (extends Vehicle):

 Additional Attributes: hasSidecar (boolean)

 Override methods: start(), stop()

 * */
public class Bike extends Vehicles {
    private boolean hasSidecar = false; //default values
    public Bike(String make, String model, int year, String color, boolean hasSidecar) {
        super(make, model, year, color);
        this.hasSidecar = hasSidecar;
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
        System.out.println("Has Sidecar: " + hasSidecar);
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
