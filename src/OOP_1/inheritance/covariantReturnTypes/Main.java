package OOP_1.inheritance.covariantReturnTypes;

//Super class and Subclass with Covariant Return type

/**SuperClass declaration
 * Method getAnimal: in animal, this method returns an object of type animal.
 * this serves as the base implementation.Any subclass can override this method.
 *
 * */
// Superclass
class Animal {
    public Animal getAnimal() {
        System.out.println("Returning an Animal");
        return new Animal();
    }
}

/**Subclass Declaration:
 * the getAnimal method in Dog overrides the method in Animal
 * it uses covariant return types by returning Dog instead of Animal.
 * Since, Dog is a subclass of Animal, this is allowed.
 * */
// Subclass
class Dog extends Animal {
    @Override
    public Dog getAnimal() {
        System.out.println("Returning a Dog");
        return new Dog();
    }
}

/**Main Method for testing
 * here,we create an animal object and call its getAnimal method.
 * the Animal class implementation is used.
 *
 * */
// Main Class
public class Main {
    public static void main(String[] args) {
        // Superclass reference and object
        Animal animal = new Animal();
        animal.getAnimal(); // Calls Animal's getAnimal method

        /** Calling Subclass Implementation:
         * we create a Dog Object and call getAnimal.The dog class
         * implementation is used, and the method returns a dog.
         * */
        // Subclass reference and object
        Dog dog = new Dog();
        dog.getAnimal(); // Calls Dog's getAnimal method

        /**Polymorphism in action
         * here, in Animal reference points to a Dog object.At runtime, the method in the actual
         * object type(Dog) is executed due to method overriding.
         * This shows polymorphic behaviour where the actual return type
         * depends on the runtime object(Dog), but still complies with the expected Animal return type.
         * */
        // Polymorphic behavior
        Animal polymorphicDog = new Dog();
        polymorphicDog.getAnimal(); // Calls Dog's getAnimal method (runtime behavior)
    }
}


/**Why Covariant Return Types Matter:

 Without covariant return types, overriding would be more restrictive. For example:
 Without Covariant Return Types (Older Java Versions):
 * */

/**class Animal {
 public Animal getAnimal() {
 return new Animal();
 }
 }

 class Dog extends Animal {
@Override
public Animal getAnimal() { // Must return Animal, not Dog
return new Dog(); // No flexibility
}
}
 en though the method in Dog could return a Dog, the superclass method forces the return type to be Animal.
 This would require casting the result to Dog explicitly in the caller.
 * */
