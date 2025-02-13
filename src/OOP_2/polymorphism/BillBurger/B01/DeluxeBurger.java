package OOP_2.polymorphism.BillBurger.B01;

public class DeluxeBurger extends Burger{
    Item deluxe1;
    Item deluxe2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
        deluxe1 = new Item("TOPPING", "extra01", 0);
        deluxe2 = new Item("TOPPING", "extra02", 0);

    }


    @Override
    public void addTopping(String topping) {
        System.out.println("You can't add additional items to Deluxe Burger");
    }

    @Override
    public void printItemSizedList() {
        super.printItemSizedList();
        if (deluxe1 != null){
            deluxe1.printItem();
        }
        if (deluxe2 != null){
            deluxe2.printItem();
        }
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
