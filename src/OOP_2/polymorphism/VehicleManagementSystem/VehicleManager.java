package OOP_2.polymorphism.VehicleManagementSystem;

import java.util.ArrayList;
import java.util.List;

/** VehicleManager Class:

 Composition: Contains a list of Vehicle objects.

 Methods: addVehicle(Vehicle vehicle), removeVehicle(Vehicle vehicle), displayAllVehicles()

 VehicleManager manager = new VehicleManager();

 * */
public class VehicleManager {
    private List<Vehicles> vehicles;
//    private Car car;
//    private Bike bike;
//    private Truck truck;
//
    // constructor with no args
    public VehicleManager() {
        vehicles = new ArrayList<>();
    }

    // method for adding vehicles
    public void addVehicle(Vehicles vehicle){
        vehicles.add(vehicle);
    }

    // method for removing vehicles:
    public void removeVehicle(Vehicles vehicle){
        vehicles.remove(vehicle);
    }

    //diplay vechiles using for each loop:
    public void displayAllVehicles(){
        for(Vehicles vehicle: vehicles){
            vehicle.displayInfo();
            System.out.println(" ");
        }
    }
}
