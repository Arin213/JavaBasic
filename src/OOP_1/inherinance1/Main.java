package OOP_1.inherinance1;
/**let's go with the Animal class with the fields
 * type: String
 * size: String
 * weight: double
 *
 * and methods:
 * move(String speed)
 * makeNoise()
 *
 *let's say this is a class diagram which allows us to design our classes before we build them
 * This diagram shows the Animal class with the attributes.
 *
 * Now let's create the dog class connect to animal which will inherit the
 * fields and method of animal as well we can add extra method the dog class
 * so, what's the progress well it helps to avoid the duplication of code like fields and methods .
 *
 * Super():
 * Super() is a lot like this().
 * It's a way to call a constructor on the super class directly from the subclass's constructor.
 * like this(), it has to be the first statement of the constructor.
 * Because of that rule, this(), and super() can never be called from the same constructor.
 *
 * */
public class Main {
    public static  void main (String[] args){

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        // well class is passed as parameter 'animal'
        doAnimalStuff(animal, "slow");
//        animal.makeNoise();

        Dog dog = new Dog();
        /**dog as param will access to the class dog materials
         * */
        doAnimalStuff(dog, "fast");

        Dog boxer = new Dog("Boxer tendu", 50);
        doAnimalStuff(boxer, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("wolf", 40);
        doAnimalStuff(wolf,"slow");

        Fish goldie =  new Fish("Goldfish", 0.75, 2, 3);
        doAnimalStuff(goldie, "fast");

    }
    // body or actions of animals
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
