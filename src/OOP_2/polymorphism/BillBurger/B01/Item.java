package OOP_2.polymorphism.BillBurger.B01;

import java.lang.classfile.instruction.SwitchCase;

// this item class would be the base class for all the items (burger, drinks, sideItem, etc)
public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "Regular";

    public Item(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return type.equals("SiDE") || type.equals("DRINK") ? size + " " + name : name ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return switch (size.toUpperCase()){
            case "SMALL" -> price - 0.5;
            case "LARGE" -> price + 0.5;
            default -> price;
        };
    }

//    public void setPrice(double price) {
//        switch (size.toUpperCase()){
//            case "SMALL" -> this.price = price - 0.5;
//            case "LARGE" -> this.price = price + 0.5;
//            default -> this.price = price;
//        };
//    }

//    public String getSize() {
//        return size;
//    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price){
        System.out.println(name + " : $" + price);
    }

    public void printItem(){
        System.out.println(getName() + " : $" + getPrice());
    }
}
