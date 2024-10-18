package OOP_1;

/** NOTE: null is a special Keyword in Java, meaning the variable or attribute
 * has a type but no reference to an object.

 * This means that no instance or object is assigned to the variable or field.

 * Fields with primitive data types are never null. (int, float, double, Long, etc.)
 *  however, the string is not primitive type so if there is no object assigned to it then "null"

 * Fields no classes are assigned default values automatically by java, if you don't assign value by yourself.
 * Boolean = false
 * [byte, short, int, long, char] = 0
 * [double, float] = 0.0

 *

 *
 */


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        /** car.make = "Porsche";
         car.model = "Carrera";
         car.colour = "Red";
         System.out.println("make = " + car.make);
         System.out.println("model = " + car.model);
         it is not possible to access or make changes of attribute because of access modifier is "Private"
         and private can be accessible only within the same class i.e in Car class not in Main class.

         However, we can make changes of attributes by simply changing modifier to the public, but it's usually regarded
         as bad practice.

         In this case, we can make changes using getters and setters

         Getters and setters?
         Getters: A getter is a method on a class that retrieves the value of a private field and returns it.
         Setters: S setter is a method on a class that sets the value of a private field.
         Purpose: The purpose of these methods is to control and protect access to private fields.

         * */
//        Car car = null;
        car.setMake("Porsche");
//        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColour("red");
        //now through getter, we can access the attribute of Car class
        System.out.println("Make " + car.getMake());
        System.out.println("Model " + car.getModel());
        System.out.println("Model " + car.isConvertible());
        car.describeCar();

        System.out.println(" ");

        Car targa = new Car();
        targa.setMake("Porsche");
//        car.setMake("Maserati");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColour("black");
        targa.describeCar();
        System.out.println("Make " + targa.getMake());
        System.out.println("Model " + targa.getModel());
        System.out.println("Convertible " + targa.isConvertible());

    }
}
/** Now if we look above code, its hell lot of duplications is going on and also
 * so much dirty as hell. And hard to grasp.
* */