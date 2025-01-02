package OOP_2.polymorphism.FourCar;

public class Ford {

    private Car car;

    public Ford(int cylinders, String name) {
        this.car = new Car(cylinders, name);
    }

    public String startEngine(){
        return "Ford -> startEngine()";
    }

    public String accelerate(){
        return "Ford -> accelerate()";
    }

    public String brake(){
        return "Ford -> brake()";
    }
}
