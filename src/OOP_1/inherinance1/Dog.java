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
        super("Mike", "Small", 15);
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

//    @Override
//    public void makeNoise() {
//        super.makeNoise();
//        bark();
//        System.out.println();
//    }

    // overridden the method makeNoise()
    public void makeNoise(){
        /**type == "wolf" not possible because of private access, however protected can do the job
         * because protected access modifier can accessible with in the packages,
         * just changing the field of Animal private String type to protected String type:
         * */
        if(type == "wolf"){
            System.out.println("Ow Woooooo! ");
        }
        bark();
        System.out.println();

    }

    /** override the method move() of the superclass or Animal class here
     * adding methods or let's say extends more functionality can be ok in inheritance.
     * */

    /**can be accessible in other class like main class & from this class we can access private.
     * since   animal.makeNoise(); can access walk(), wagTail()
     * run() and bark().
     * This is a common pattern where public  methods act as a "gateway"
     * for external code to access specific internal behaviours without      *  exposing the internal methods directly.
     * */
    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dog walk, run, and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        } else {
          run();
          bark();
        }
        System.out.println();
    }

    //Access Modifiers
    /** Now this will be access within the same class not outside the class
     * */
    private void bark(){
        System.out.print("Woof! ");
    }

    private void run(){
        System.out.print("Dog Running ");
    }

    private void walk(){
        System.out.print("Dog Walking ");
    }
    private void wagTail(){
        System.out.print("Tail wagging");
    }
}