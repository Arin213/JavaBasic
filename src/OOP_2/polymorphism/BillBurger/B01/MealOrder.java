package OOP_2.polymorphism.BillBurger.B01;

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("regular","coke","fires");
    }

    public MealOrder(String burgerName, String drinkName, String sideName){
        this.burger = new Burger(burgerName, 2.0);
        this.drink = new Item("Drink", drinkName, 1.0);
        this.side = new Item("Side", sideName, 1.0);
    }
    public double getTotalPrice(){
        return burger.getPrice() + drink.getPrice() + side.getPrice();
    }

    public void printOrder(){
        System.out.println("Your order is: ");
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("Total price: $" + getTotalPrice());
    }

    public void addBurgerTopping(String topping){
        burger.addTopping(topping);
    }
    public void setDrinkSize(String size){
        drink.setSize(size);
    }
}
