package OOP_2.Composition.KitchenApp;
/** * outline:
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
 * */
public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private  Refrigerator iceBox;

//    public SmartKitchen(){
//
//    }
    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void setKitchenState(boolean coffee, boolean dishWash){
        if (coffee) {
            brewMaster.brewCoffee();
        } else if (dishWash) {
            dishWasher.DoDish();

        }else {
            iceBox.oderFood();
        }

    }


}
