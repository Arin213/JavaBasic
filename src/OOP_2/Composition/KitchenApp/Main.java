package OOP_2.Composition.KitchenApp;

/** Apps for controlling a smart kitchen
 * outline:
 *      SmartKitchen
 * attribute: brewMaster : CoffeeMaker
 *            dishWasher : DishWasher
 *            iceBox : Refrigerator
 * methods:
 *        addWater()
 *        pourMilk()
 *        loadDishWasher()
 *        setKitchenState(boolean, boolean, boolean)
 *
 *        doKitchenWork()
 *
 * outline:
 *        Refrigerator
 * attribute:
 *          hasWorkToDo: boolean
 * method:  orderFood()
 *
 * outline:
 *       DishWasher
 * attribute:
 *          hasWorkTodo: boolean
 * method : doDish()
 *
 * outline:
 *        CoffeeMaker
 * attributes:
 *           hasWorkToDo : boolean
 * method: brewCoffee()
 *
 * Methods on SmartKitchen class, will determine what work needs to be done.
 * . addWater() -> will set the Coffee Maker's hasWorkToDo field to true.
 * . pourMilk() -> will set the Refrigerator's hasWorkToDo to true.
 * . loadDishWasher() -> will set the hasWorkToDo flag to true for that appliance.
 *
 * Alternately, we could have a single method called setKitchenState that takes three boolean values,
 * which would set each appliance accordingly.
 *
 * To execute the work needed to be done by the appliance, we can implement this in two ways.
 * First, application will access each appliance by using getter and execute a method.
 * . The appliance methods are oderFood() on Refrigerator, doDishes() on DishWasher,
 *   and brewCoffee() on CoffeeMaker.
 *
 * . These methods should check the hasWorkToDo flag, and if true, print message out indicating what work is being done.
 *
 * Second, application won't access the appliances directly.
 *  . It should call doKitchenWork(), which delegates the work to any of its appliances.
 * */
public class Main {
    public static void main (String[]  args){
        CoffeeMaker coffeeMake = new CoffeeMaker(true);
        DishWasher dishWash = new DishWasher(false);
        Refrigerator RF = new Refrigerator(true);

        SmartKitchen SMK = new SmartKitchen(coffeeMake, dishWash, RF);
        SMK.setKitchenState(true, false);
        SMK.setKitchenState(false, true);
        SMK.setKitchenState(false, false);

    }
}
