package OOP_2.polymorphism.FourCar;

public class Holden {

    private Car car;

    public Holden(int cylinders, String name) {
        this.car = new Car(cylinders, name);
    }

    public String startEngine(){
        return "Holden -> startEngine()";
    }

    public String accelerate(){
        return "Holden -> accelerate()";
    }

    public String brake(){
        return "Holden -> brake()";
    }
}
