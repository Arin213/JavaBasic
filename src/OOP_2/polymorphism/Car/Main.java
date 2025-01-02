package OOP_2.polymorphism.Car;

import java.util.Scanner;

/** requirement fo this challenge.
 *
 * This diagram shows a base class, Car, with one field, description, and three methods,
 * startEngine(), drive(), and runEngine().
 *
 * The first two methods should be declared as public.
 *
 * The method, runEngine, however, is protected, and it will only get called from
 * the drive method Car.
 *
 * and here, three tyoes of subclass of three types of cars that we might
 * find on the road.
 *
 * we have the GasPoweredCar, ElectricCar, and HybridCar.
 *
 * we can imagine that these three subclasses might have different ways to
 * start their engine or dirve, depending on their engine type.
 *
 * Each of these classes might also have different fields that mght be used in those
 * methods.
 *
 * it's our job to create this class structure in java and override methods appropriately.
 * and we will write code in main class and main method that created an instance of each of these classes and
 * that executes different behaviour for each.
 *
 * At least oce method should print the type of the runtime object.
 *
 * Car as class;
 *  description String
 *  startEngine()
 *  drive()
 *  protected runEngine()
 *
 *  subclass GasPoweredCar
 *      avgKmPerLiter double
 *      Cylinder: int
 *
 *  subclass ElectricCar
 *      avgKmPerCharge double
 *      batterySize int
 *
 *  subclass HybridCar
 *      avgKmPerLiter double
 *      batterySize int
 *      cylinder int
 * */


public class Main {
    public static void main (String[] args){
//        Car car = Car.getCar("Noble");
//        car.drive();
//
////        Car car = new Car("Car"); // this is the base class
//
//        // Car classes with reference gasCar but pointing to the GasPoweredCar object
//        Car gasCar = new GasPoweredCar("Gas", 10.0, 4);
//        gasCar.startEngine();
//        gasCar.drive();
//        //casting is necessary to call the typeCar method of the GasPoweredCar class because
//        // no method(typeCar()) is in the base class
//        ((GasPoweredCar)gasCar).gasTypeCar();
//
//        // using the var infer
//        var electricCar = new ElectricCar("Electric", 100.0, 100);
//        electricCar.drive();
//        electricCar.electricTypeCar();

        /** Using the factory method to create the object given car
         * */
        Scanner scn = new Scanner(System.in);

        while (true){
            System.out.println("Enter the type of car you want to drive or type exit to quit: ");
            String type = scn.nextLine();
            if (type.equals("exit")){
                break;
            }
            Car car = Car.getCar(type);
            car.drive();

        }
//        Car hybridCar = Car.getCar("HybridCar");
//        hybridCar.drive();
//        ((HybridCar) hybridCar).hybridTypeCar();




//        GasPoweredCar gasCar = new GasPoweredCar("Gas Car", 10.0, 4);
//        ElectricCar electricCar = new ElectricCar("Electric Car", 100.0, 100);
//        HybridCar hybridCar = new HybridCar("Hybrid Car", 20.0, 200, 4);
//
//        car.startEngine();
//        car.drive();
//        System.out.println("=====================================");
//        gasCar.startEngine();
//        gasCar.drive();
//        System.out.println("=====================================");
//        electricCar.startEngine();
//        electricCar.drive();
//        System.out.println("=====================================");
//        hybridCar.startEngine();
//        hybridCar.drive();
//        hybridCar.runEngine();
    }
}
