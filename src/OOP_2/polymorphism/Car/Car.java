package OOP_2.polymorphism.Car;

/** * Car as class;
 *  description String
 *  startEngine()
 *  drive()
 *  protected runEngine()
 *
 * */
public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
    }

    public void drive() {
        System.out.println("Car -> drive()");
        runEngine();
        System.out.println("Car type is -> default perhaps!" );
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine()");
    }

    //overloading the getCar method so that we can minimize the argument or single argument only as String type.
    public static Car getCar(String type) {
        return getCar(type, "Default car", 0, 0, 0, 0);
    }

    // approach with the factory method
    public static Car getCar(String type, String description, double avgKmPerLiter,
                             int cylinder, double avgKmPerCharge, int batterySize) {
        return switch (type.toUpperCase()) {
            case "GAS" -> new GasPoweredCar(description, avgKmPerLiter, cylinder);
            case "ELECTRICCAR" -> new ElectricCar(description, avgKmPerCharge, batterySize);
            case "HYBRIDCAR" -> new HybridCar(description, avgKmPerLiter, cylinder, batterySize);
            default -> new Car(description);
        };
    }

}
/**
 *  subclass GasPoweredCar
 *  *      avgKmPerLiter double
 *  *      Cylinder: int
 */
class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinder;

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.println("GasPoweredCar -> startEngine()");
    }

    @Override
    public void drive() {
        System.out.println("GasPoweredCar -> drive()");
        runEngine();
        gasTypeCar();
    }

    @Override
    protected void runEngine() {
        System.out.println("GasPoweredCar - > runEngine()");
    }

    protected void gasTypeCar(){
        System.out.println("Car type is -> " + getClass().getSimpleName());
    }

}

/**
 *  subclass ElectricCar
 *  *      avgKmPerCharge double
 *  *      batterySize int
 */
class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("ElectricCar -> startEngine()");
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar -> drive()");
        runEngine();
        electricTypeCar();

    }

    @Override
    protected void runEngine() {
        System.out.println("ElectricCar - > runEngine()");
    }


    protected void electricTypeCar(){
        System.out.println("Car type is -> " + getClass().getSimpleName());
    }
}

/**
 *  subclass HybridCar
 *  *      avgKmPerLiter double
 *  *      batterySize int
 *  *      cylinder int
 */
class HybridCar extends Car {
    private double avgKmPerLiter;
    private int cylinder;
    private int batterySize;


    public HybridCar(String description, double avgKmPerLiter, int cylinder, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar -> startEngine()");
    }

    @Override
    public void drive() {
        System.out.println("HybridCar -> drive()");
        runEngine();
        hybridTypeCar();
    }

    @Override
    protected void runEngine() {
        System.out.println("HybridCar -> runEngine()");
    }

    protected void hybridTypeCar(){
        System.out.println("Car type is -> " + getClass().getSimpleName());
    }
}