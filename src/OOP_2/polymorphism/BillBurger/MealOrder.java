package OOP_2.polymorphism.BillBurger;

public class MealOrder {
    private burger burger;
    private drink drink;
    private sideitem sideitem;

    public MealOrder(){
        this(new burger("Regular", 5.00), new drink("Coke", "Small", 1.00),
                new sideitem("Fries", 1.00));
    }

    public MealOrder(burger burger, drink drink, sideitem sideitem){
        this.burger = burger;
        this.drink = drink;
        this.sideitem = sideitem;
    }

    public burger getBurger() {
        return burger;
    }

    public void setBurger(burger burger) {
        this.burger = burger;
    }

    public drink getDrink() {
        return drink;
    }

    public void setDrink(drink drink) {
        this.drink = drink;
    }

    public sideitem getSideitem() {
        return sideitem;
    }

    public void setSideitem(sideitem sideitem) {
        this.sideitem = sideitem;
    }
    public double getTotal(){
        if (burger.getType().equals("Deluxe")){
            return burger.getPrice();
        }
        return burger.getPrice() + drink.getPrice() + sideitem.getPrice();
    }

}
