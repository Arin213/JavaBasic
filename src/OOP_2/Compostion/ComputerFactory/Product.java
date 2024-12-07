package OOP_2.Compostion.ComputerFactory;

/** Creeated product class as main super class and has its subclasses
 * Moniter, Motherboard and ComputerCase but this relationship is tightly
 * coupled because the sublclasses has the properties  belongs to the product
 * class and we can say subclassesd is a product right ?
 * if one changes in attributes will affect all other subclasses and superclass
 * THE TYPE OF REALTIONSHIP:
 * INHERITANCE DEFINES A IS-A RELATIONSHIP
 *
 * */

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }
    public void drawPixelAt_(int x, int y, String color){
        System.out.println(String.format("Drawing pixel at %d, %d in color %s ", x, y, color));
    }
}

class Motherboard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots,
                       String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.bios = bios;
        this.cardSlots = cardSlots;
    }
    public void loadProgram(String programName){
        System.out.println(STR."Progaram \{programName} is now loading");
    }

}

class ComputerCase extends Product{
    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {

        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}
