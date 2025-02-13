package OOP_2.polymorphism.BillBurger;

public class burger {
    private String type;
    private double price;
    private String topping;

    public burger(String type, double price){
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type.equals("Healthy") || type.equals("Deluxe") ? type : "Regular";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        switch (topping.toUpperCase()){
            case "LETTUCE", "TOMATO" -> setPrice(0.50);
            case  "CARROT"-> setPrice(0.25);
            default -> setPrice(price);
        }
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping.equals("Lettuce") || topping.equals("Tomato")
                || topping.equals("Carrot") ? topping : "No Topping";
    }
}

class deluxeBurer extends burger{
    public deluxeBurer(String type, double price) {
        super(type, price);
    }




}