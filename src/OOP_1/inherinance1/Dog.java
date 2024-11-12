package OOP_1.inherinance1;
/** Now to inherit the attributes and everything we use the new keyword extends which will specifies
 * the superclass (or the parent class) of the class we're declaring.
 * well we can say that the Dog is a subclass or child class of Animal.
 * and Animal is a parent or super Class of Dog.
 * [Note]: A class can specify one and only one class in its extends clause.
 *
 * If you don't make a call to super(), then Java makes it for you using super's default
 * constructor.
 *
 * if your super class doesn't have a default constructor, then your must explicitly call super()
 * in all of your constructors, passing the right arguments to that constructor.
 *
 *
 * */
public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Boxer tendu", "Big", 50);
    }
    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small": (weight < 35 ? "medium": "large"), weight); // get the size by getting the weight.
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString(); // this super is different than super(). lot like this keyword wit the dot notation.
    }

    public void makNoise(){

    }

    /** override the method move() of the superclass or Animal class here
     * adding methods or let's say extends more functionality can be ok in inheritance.
     * */
    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dog walk, run, and wag their tail");
    }
}