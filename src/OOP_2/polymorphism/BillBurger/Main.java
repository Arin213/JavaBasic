package OOP_2.polymorphism.BillBurger;

/**Challenge is to build a complete application using all the principles of
 * object-oriented programming that have been taught in these modules.
 *
 * The challenge is to write an application for a food restaurant.
 * Some details about the restaurant and what is required.
 *
 * Bill runs a fast-food hamburger restaurant and sells hamburger meals.
 * His meals orders are composed of three items, the hamburger, the drink,and the side item.
 *
 * Your challenge is to write and application to let Bill select the type of burgers and some of the
 * additional items or extras that can be added to the burgers,as well as the actual pricing.
 *
 * You need a meal order.
 * -> This should be composed of exactly one burger,one drink and one side item.
 * -> The most common meal order should be created without any arguments,like a regular burger,
 * drinks, and side items.
 *
 * You need a drink and side item.
 * -> The drink should have at least a type size, and price, and the price of the drink should change
 * for each size,
 *
 *-> The side item needs at least a type and price.
 *
 * You need a burger.
 * -> Every hamburger should have a burger type, and base price, and upto a maximum of three extra toppings.
 * -> The constructor should include only the burger type and price.
 * -> Extra toppings on a burger need to be added somehow and priced according to their type.
 *
 * The deluxe burger bonus.
 * -> Create a deluxe burger meal with a deluxe burge that has a set price, so that any additional
 * toppings do not change the price.
 *
 * -> The deluxe burger should have room for an additional two toppings.
 *
 * Main method should have code to do the following;
 * -> Create a default meal that uses the no argument constructor.
 * -> Create a meal with a burger and the drink adn side item of your choice, with up to 3 extra toppings..
 * -> Create a meal with a deluxe burger, where all items, drink, side items.
 *    and up to 5 extra toppings are included in the burger price.
 *
 * For each meal order, you'll want to perform these functions:
 * -> Add some additional toppings to the burger.
 * -> Change the size of the drink.
 * -> Print the itemized list. This should include the price of the burger, any extra toppings,
 * the drink price based on size, and the side item price.
 *-> Print the total due amount for the meal.
 *
 *
 * */


public class Main {
    public static void main (String[] args){
        MealOrder mealOrder = new MealOrder();

        System.out.println("Default Meal Order");
        printDetails(mealOrder);

        mealOrder.setBurger(new burger("Healthy", 6.00));
        mealOrder.setDrink(new drink("Coke", "Medium", 1.00));
        mealOrder.setSideitem(new sideitem("Fries", 1.00));
        mealOrder.getBurger().setTopping("Lettuce");
        mealOrder.getBurger().setTopping("Tomato");
        mealOrder.getBurger().setTopping("Carrot");
        mealOrder.getDrink().setSize("Large");
        mealOrder.getDrink().setPrice(3.00);
        mealOrder.getSideitem().setPrice(2.00);
        System.out.println("Custom Meal Order");
        printDetails(mealOrder);


    }
    public static void printDetails( MealOrder mealOrder){
        System.out.println("Burger Type: " + mealOrder.getBurger().getType());
        System.out.println("Burger Price: $" + mealOrder.getBurger().getPrice());
        System.out.println("Drink Type: " + mealOrder.getDrink().getType());
        System.out.println("Drink Type price: $" + mealOrder.getDrink().getPrice());
        System.out.println("Side Item: " + mealOrder.getSideitem().getType());
        System.out.println("Side Item price: $" + mealOrder.getSideitem().getPrice());
        System.out.println("===".repeat(5));
        System.out.println("Total: $" + mealOrder.getTotal());

    }

}
