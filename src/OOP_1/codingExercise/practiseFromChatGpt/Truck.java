package OOP_1.codingExercise.practiseFromChatGpt;

public class Truck extends Vehicle {
    private double loadCapacity;
    private boolean hasTrailer;

    //default constructor
    public Truck(){
        super();
        this.loadCapacity = 1000;
        this.hasTrailer = false;
    }

    //chaining
    public Truck(String type, double weight){
        this(type, weight, 1000, false);
    }

    public Truck(String type, double weight, double loadCapacity, boolean hasTrailer){
        super(type, (weight < 1000 ? "Small":(weight < 5000) ? "Medium":"Large"), weight);
        this.loadCapacity = loadCapacity;
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void move(String speed) {
        super.move(speed);

    }

    @Override
    public String toString() {
        return "Truck{" +
                "hasTrailer=" + hasTrailer +
                ", loadCapacity=" + loadCapacity +
                "} " + super.toString();
    }
}

//NOte: haven't call the parent class thats why i am gettting errors here just check extends vechile in truck or not .
