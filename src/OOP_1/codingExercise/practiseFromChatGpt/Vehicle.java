package OOP_1.codingExercise.practiseFromChatGpt;

/**
 * Problem: Vehicle Hierarchy
 *
 * Imagine you’re designing a hierarchy for different types of vehicles in a transportation management system.
 * All vehicles share some basic properties, but specific types of vehicles have unique characteristics and behaviors.
 * Use inheritance and constructor chaining to implement this.
 * Requirements
 *
 *     Base Class: Vehicle
 *         Attributes:
 *             String type (e.g., "Car", "Motorbike", "Truck")
 *             String size (e.g., "Small", "Medium", "Large")
 *             double weight (weight in kg)
 *         Constructors:
 *             Default constructor (sets default values for type, size, and weight).
 *             Constructor with type, size, and weight parameters.
 *         Methods:
 *             move(String speed) — Prints a statement indicating the vehicle type and its speed (e.g., "Car moves at 60 km/h").
 *             toString() — Returns a string representation of the Vehicle with all its attributes.
 *
 *     Derived Class: Car
 *         Attributes:
 *             int numberOfDoors (e.g., 2, 4)
 *             boolean hasAirConditioning (true if the car has air conditioning, false otherwise)
 *         Constructors:
 *             Default constructor — Calls the Vehicle default constructor using super() and
 *             sets numberOfDoors to 4 and hasAirConditioning to true.
 *             Constructor with only type and weight parameters — Uses this() to call the next constructor with
 *             default values for numberOfDoors and hasAirConditioning.
 *             Constructor with all parameters (type, weight, numberOfDoors, hasAirConditioning).
 *         Methods:
 *             Override move() — Calls super.move(speed) and adds additional output indicating that the car can drive smoothly.
 *             Override toString() — Adds car-specific attributes to the Vehicle toString() output.
 *
 *     Derived Class: Truck
 *         Attributes:
 *             double loadCapacity (maximum load in kg)
 *             boolean hasTrailer (true if the truck has a trailer)
 *         Constructors:
 *             Default constructor — Calls the Vehicle constructor with
 *             default values and sets loadCapacity to 1000 kg and hasTrailer to false.
 *             Constructor with only type and weight parameters — Uses this() to call the next constructor
 *             with default values for loadCapacity and hasTrailer.
 *             Constructor with all parameters (type, weight, loadCapacity, hasTrailer).
 *         Methods:
 *             Override move() — Calls super.move(speed) and adds additional output indicating that the truck moves slowly.
 *             Override toString() — Adds truck-specific attributes to the Vehicle toString() output.
 *
 * Exercise Tasks
 *
 *     Implement the Classes: Start by implementing the Vehicle class with its attributes and methods.
 *     Then, implement the Car and Truck classes, making sure to use super() and this() effectively to avoid duplication.
 *
 *     Create Objects: In a main method or test file,
 *     create instances of Car and Truck with different combinations of parameters
 *     (e.g., use the constructor with only type and weight, and also the one with all parameters).
 *
 *     Test Inherited and Overridden Methods: Test the move() and toString()
 *     methods on both Car and Truck instances to see how the output differs based on inheritance and overridden methods.
 *
 * Sample Output
 *
 * Here’s an example of what the output might look like when you create and test these classes:
 *
 * Vehicle vehicle = new Vehicle("Motorbike", "Small", 200);
 * System.out.println(vehicle.toString());
 * // Output: Vehicle{type='Motorbike', size='Small', weight=200.0}
 *
 * Car car = new Car("Car", 1500, 4, true);
 * System.out.println(car.toString());
 * // Output: Car{numberOfDoors=4, hasAirConditioning=true} Vehicle{type='Car', size='Large', weight=1500.0}
 *
 * car.move("80 km/h");
 * // Output:
 * // Car moves at 80 km/h
 * // Car drives smoothly
 *
 * Truck truck = new Truck("Truck", 5000, 2000, true);
 * System.out.println(truck.toString());
 * // Output: Truck{loadCapacity=2000.0, hasTrailer=true} Vehicle{type='Truck', size='Large', weight=5000.0}
 *
 * truck.move("50 km/h");
 * // Output:
 * // Truck moves at 50 km/h
 * // Truck moves slowly
 *
 * This exercise will give you practice with constructor chaining, inheritance, method overriding,
 * and using super() and this() in a way that reduces redundancy.
 *
 */

public class Vehicle {
    // fields
    private String type;
    private String size ;
    private double weight;

    //default constructor
    public Vehicle() {
//        this("Car", "Small", 300);

    }

    // constructor with params
    public Vehicle(String type, String size,double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void move(String speed){
        System.out.println(type + " moves at " + speed + " Km/h" );
    }

    //toString() method implementations.

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
