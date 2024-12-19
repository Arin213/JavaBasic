package OOP_2.Composition.KitchenApp;

/**outline:
 *       DishWasher
 * attribute:
 *          hasWorkTodo: boolean
 * method : doDish()
 * */
public class DishWasher {
    private  boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void DoDish(){
        System.out.println("Dish wash activated!");
    }
}
