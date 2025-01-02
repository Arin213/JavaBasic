package OOP_2.polymorphism.VehicleManagementSystem;

/** Vehicle Class:

 Attributes: make, model, year, color

 Methods: start(), stop(), displayInfo(), getters and setters
 * */
public class Vehicles {
    private String make;
    private String model;
    private int year;
    private String color;

    public Vehicles(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

//    public static getVehicles(String name,)

    public void start(){
        System.out.println("Vehicle is starting");
    }

    public void stop(){
        System.out.println("Vehicle is stopping");
    }

    public void displayInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
