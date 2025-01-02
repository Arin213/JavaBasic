package OOP_2.polymorphism.FourCar;

public class Mitsubishi {
   private Car car;

   public Mitsubishi(int cylinders, String name) {
       this.car = new Car(cylinders, name);
    }

    public String startEngine(){
        return "Mitsubishi -> startEngine()";
    }

    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }

    public String brake(){
        return "Mitsubishi -> brake()";
    }

}
