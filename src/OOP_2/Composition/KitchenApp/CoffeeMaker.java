package OOP_2.Composition.KitchenApp;

/**outline:
 *        CoffeeMaker
 * attributes:
 *           hasWorkToDo : boolean
 * method: brewCoffee()
 * */
public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        System.out.println("Coffee make start!");
    }
}
