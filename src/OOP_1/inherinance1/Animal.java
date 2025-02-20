package OOP_1.inherinance1;

public class Animal {
    //because private can access within the same class however protected can be access through package.
//    private String type;
    protected String type;
    private String size;
    private double weight;

    //constructor for child
    public  Animal(){

    }
    public Animal(String type, String size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " makes some kind of noise ");
    }
}
