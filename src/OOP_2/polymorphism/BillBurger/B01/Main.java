package OOP_2.polymorphism.BillBurger.B01;

public class Main {
    public static void main (String[] args){
//        Item item = new Item("Burger", "Cheese Burger", 2.0);
////        Item item1 = new Item("Side", "fries", 1.0);
//        item.printItem();
//
//        Burger burger = new Burger("Cheese Burger", 2.0);
////        burger.printItemSizedList();
//        burger.printItem();
//
//        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger", 3.0);
//        deluxeBurger.printItem();
        MealOrder mealOrder = new MealOrder();
//        mealOrder.printOrder();

        mealOrder.addBurgerTopping("cheese");
        mealOrder.addBurgerTopping("avocado");
        mealOrder.addBurgerTopping("ham");
        mealOrder.setDrinkSize("large");
        mealOrder.printOrder();
    }

}
