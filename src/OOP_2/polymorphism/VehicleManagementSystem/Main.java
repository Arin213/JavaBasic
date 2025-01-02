package OOP_2.polymorphism.VehicleManagementSystem;

/**Project: Vehicle Management System
 Project Description:

 Create a simple Vehicle Management System that manages different types of vehicles
 such as Cars, Bikes, and Trucks. The system should allow you to perform operations like
 adding vehicles, removing vehicles, and displaying vehicle details.
 Requirements:

 Inheritance:

 Create a base class Vehicle with common attributes and methods.

 Create subclasses Car, Bike, and Truck that inherit from Vehicle
 and override methods to provide specific behaviors.

 Encapsulation:

 Ensure that the attributes of the classes are private and provide public getter and setter methods.

 Protect the data by validating inputs in the setter methods.

 Composition:

 Use composition to manage a collection of vehicles.
 For example, a VehicleManager class can contain a list of Vehicle objects.

 Polymorphism:

 Use method overriding in subclasses to provide specific implementations of methods like start() and stop().

 Use method overloading where appropriate.

 Use polymorphism to handle different types of vehicles in the VehicleManager class.

 Sample Class Structure:

 Vehicle Class:

 Attributes: make, model, year, color

 Methods: start(), stop(), displayInfo(), getters and setters

 Car Class (extends Vehicle):

 Additional Attributes: numDoors

 Override methods: start(), stop()

 Bike Class (extends Vehicle):

 Additional Attributes: hasSidecar (boolean)

 Override methods: start(), stop()

 Truck Class (extends Vehicle):
 Additional Attributes: cargoCapacity

 Override methods: start(), stop()

 VehicleManager Class:

 Composition: Contains a list of Vehicle objects.

 Methods: addVehicle(Vehicle vehicle), removeVehicle(Vehicle vehicle), displayAllVehicles()

 VehicleManager manager = new VehicleManager();

 Car car = new Car("Toyota", "Camry", 2020, "Blue", 4);
 Bike bike = new Bike("Honda", "CBR500R", 2021, "Red", false);
 Truck truck = new Truck("Ford", "F-150", 2019, "White", 1000);

 manager.addVehicle(car);
 manager.addVehicle(bike);
 manager.addVehicle(truck);

 manager.displayAllVehicles();
 * */

public class Main {
    public static void main(String[] args) {
        Vehicles car = new Car("Toyota", "Camry", 2020, "Blue", 4);
        Vehicles bike = new Bike("Honda", "CBR500R", 2021, "Red", false);
        Vehicles truck = new Truck("Ford", "F-150", 2019, "White", 1000);

        car.displayInfo();
        car.start();
        car.stop();
        car.displayInfo();

//        bike.start();
//        bike.stop();
//
//        truck.stop();
//        truck.stop();

        VehicleManager manager = new VehicleManager();
        manager.addVehicle(car);
        manager.addVehicle(bike);
        manager.addVehicle(truck);
        manager.displayAllVehicles();

        manager.removeVehicle(truck);
        manager.displayAllVehicles();
    }
}
