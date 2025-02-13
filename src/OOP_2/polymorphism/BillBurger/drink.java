package OOP_2.polymorphism.BillBurger;

/** The drink class with the type,size and price
 * */

public class drink {
    private String type;
    private String size;
    private double price = 1.0;

    public drink(String type, String size, double price){
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size.equals("Medium") ||
                size.equals("Large") ? size : "default";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = size.equals("Medium") ? 2.0 : size.equals("Large") ? 3.0 : price;
    }
}


class sideitem extends drink{
    public sideitem(String type, double price) {
        super(type, "default", price);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
      switch (getType().toUpperCase()){
            case "FRIES" -> super.setPrice(1.0);
            case "CHIPS" -> super.setPrice(1.5);
            case "NUGGETS" -> super.setPrice(2.0);
            default -> super.setPrice(price);
      };
    }
}
