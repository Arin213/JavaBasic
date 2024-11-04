package practise.Chaining;

public class  Main{
    public static void main(String [] args){
        // constructor with 0 args
        CarModel car = new CarModel();
        System.out.println("Constructor with 0 argument");
        System.out.println(car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getSpeed());
        System.out.println(car.getYear());

        // constructor with 3 args
        System.out.println("Constructor with 3 arguments");
        CarModel car2 = new CarModel("Bmw","11x05",2000);
        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getSpeed());
        System.out.println(car2.getYear());

        // constructor with 4 args
        System.out.println("Constructor with 4 args");
        CarModel car3 = new CarModel("Tesla", 2019, "T900", 1250);
        System.out.println(car3.getName());
        System.out.println(car3.getModel());
        System.out.println(car3.getSpeed());
        System.out.println(car3.getYear());

    }
}
