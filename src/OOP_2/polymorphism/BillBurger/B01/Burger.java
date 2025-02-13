package OOP_2.polymorphism.BillBurger.B01;

public class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("Burger", name, price);

    }

    @Override
    public String getName() {
        return super.getName() + "Bruger";
    }

    @Override
    public double getPrice() {
       return super.getPrice() + ((extra1 == null ? 0 : extra1.getPrice()) +
                           (extra2 == null ? 0 : extra2.getPrice()) +
                           (extra3 == null ? 0 : extra3.getPrice()));
    }

    public double getToppingPrice(String topping){
        return switch (topping.toUpperCase()){
            case "AVOCADO","CHEESE" -> 1.0;
            case "BACON","HAM","SALAMI" -> 1.5;
            default -> 0;
        };
    }
    public void addTopping(String topping){
        if(extra1 == null){
            extra1 = new Item("Topping", topping, getToppingPrice(topping));
        }else if(extra2 == null){
            extra2 = new Item("Topping", topping, getToppingPrice(topping));
        }else if(extra3 == null){
            extra3 = new Item("Topping", topping, getToppingPrice(topping));
        }else{
            System.out.println("You can only add 3 toppings");
        }
    }

    public void printItemSizedList(){
        printItem("BASE BURGER", getPrice());
        if (extra1 != null){
            extra1.printItem();
        }
        if (extra2 != null){
            extra2.printItem();
        }
        if (extra3 != null){
            extra3.printItem();
        }

    }

    @Override
    public void printItem() {
        printItemSizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
