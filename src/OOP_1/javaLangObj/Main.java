package OOP_1.javaLangObj;

/** 1. The Object Class in Java

 In Java, Object is the root class of the entire Java class hierarchy.
 Every single class in Java directly or indirectly inherits from the Object class, either explicitly or implicitly.

 2. Inheritance from Object

 If you create a class and don’t explicitly specify a superclass, it automatically extends Object.
 */

/**Explicit: You declare it.
 * public class MyClass extends Object {
    // Explicitly mentions Object, but it's redundant
}
 *Implicit: If you don’t specify a superclass, Java does this for you:
 * public class MyClass {
 // Implicitly extends Object
 }

 */
public class Main extends Object{
    public static void main (String[] args){
        Student max = new Student("Max", 21);

        ///  toString(): Returns a string representation of the object.
        ///   Default implementation: prints the class name + hash code (e.g., MyClass@15db9742)
        ///
//        System.out.println(max.toString()); //
        System.out.println(max); //
        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);

    }

}

class Student {
    private String name;
    private int age;

    Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    /** call code explicitly called the code  that
     *  java would have implicitly done for us.
     * */
//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student {
    private  String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        // calls students not toString(). but still inherits other obj functionality.
        return parentName + "'s kid " + super.toString();
    }
}
