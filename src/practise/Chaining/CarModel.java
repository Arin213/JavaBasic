package practise.Chaining;

public class CarModel {
    private String name;
    private int year;
    private String model;
    private int speed;

    public CarModel(String name, int year, String model, int speed){
        this.name = name;
        this.year = year;
        this.model = model;
        this.speed = speed;
    }

    public CarModel(String name, String model, int speed){
        this(name, 2015, model, speed);
    }
    public CarModel(){
        this("Toyota", 2017, "0T15", 2500);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

