package OOP_1.codingExercise.practiseFromChatGpt;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle("Motorbike", "Small", 200);
//        System.out.println(vehicle);
//        vehicle.move("150");
//        System.out.println(vehicle);
        getFeatures(vehicle, "190");

        Car car = new Car("Car", 1500, 4, true);
//        System.out.println(car.toString());
//        car.move("80");
//        System.out.println(car.getType() + " can drive smoothly");
        getFeatures(car, "200");


        Truck truck = new Truck("Truck", 5000, 2000, true);
//        System.out.println(truck.toString());
//        truck.move("50");
//        System.out.println(truck.getType() + " moves slowly");
        getFeatures(truck, "180");


    }
    public static void getFeatures(Vehicle vehicle,String speed){
        System.out.println(vehicle);
        vehicle.move(speed);
        switch (vehicle.getType()){
            case "Car" -> System.out.println(vehicle.getType() + " runs Smothly");
            case "Truck" -> System.out.println(vehicle.getType() + " moves slowly");
            default -> {
                System.out.println("Runs ok!");
            }
        };

        System.out.println("===========");
    }
}
