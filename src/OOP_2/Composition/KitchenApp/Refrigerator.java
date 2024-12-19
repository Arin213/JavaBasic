package OOP_2.Composition.KitchenApp;

/**outline:
 *        Refrigerator
 * attribute:
 *          hasWorkToDo: boolean
 * method:  orderFood()
 * */
public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
    public void oderFood(){
        System.out.println("The food is being ordered! ");
    }

}
