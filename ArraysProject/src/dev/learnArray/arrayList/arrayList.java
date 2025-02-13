package dev.learnArray.arrayList;

/*An array is mutable, and we saw that while we could set or change values in the array,
we couldn't resize the array.

Java gives us several classes that let us add and remove items adn resize a sequence of elements.
these classes are said to implement a lists' behaviour.

A list is a special type in java, called an interface.
list interface describes a set of method signatures that all list classes are expected to have.

let's look at some of these methods.
* */

/* ArrayList is list interface implementation. work as a dynamic array.
can be resized at runtime.
can do insert,delete adn modify.
so List interface consists different List Implementations:
1. ArrayList
2. LinkedList
3. Vector
4. Stack

Features of List Interface:
1. -is an ordered collection.
2. -can contain duplicate elements.
3. - is a collection of elements that can be stored in a sequence.
4. - is an interface, and it implements the Collection framework.
5. - Insert, update, delete, and search operations can be performed on the elements of a List.

The ArrayList:
- The ArrayList is a class that maintains an array in memory that's actually bigger than what we need, in most cases.
- It keeps track of the capacity or maximum size of the array in memory.
- But it also keeps track of the elements that'd been assigned or set, which is the size of the ArrayList.
- As elements are added to an ArrayList,  its capacity may need to grow. This occurs for your automatically, behind
the scenes, when you add elements to the ArrayList.
- This is why the ArrayList is resizeable.
* */

import java.util.ArrayList;
import java.util.Arrays;

//record covers all the boilerplate code that we have to write for a class that is just a data container.
record GroceryItem(String name, String type, int count) {

    //without using record:
//    import java.util.Objects;
//
//    public class GroceryItem {
//        private final String name;
//        private final String type;
//        private final int count;
//
//        // Constructor
//        public GroceryItem(String name, String type, int count) {
//            this.name = name;
//            this.type = type;
//            this.count = count;
//        }
//
//        // Getters
//        public String getName() { return name; }
//        public String getType() { return type; }
//        public int getCount() { return count; }
//
//        // toString() Method
//        @Override
//        public String toString() {
//            return "GroceryItem[name=" + name + ", type=" + type + ", count=" + count + "]";
//        }
//
//        // equals() Method
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GroceryItem that = (GroceryItem) o;
//            return count == that.count &&
//                    name.equals(that.name) &&
//                    type.equals(that.type);
//        }
//
//        // hashCode() Method
//        @Override
//        public int hashCode() {
//            return Objects.hash(name, type, count);
//        }
//    }


    //custom constructor
    public GroceryItem(String name){
        //chaining constructor by calling default constructor using name, literal String dairy and 1 as arguments.
        this(name, "Dairy", 1);
    }
}
public class arrayList {
    public static void main (String... args){
        //creating the array of object which is not recommended.
        GroceryItem [] groceryItems = new GroceryItem[3];
//        Object [] groceryItems = new Object[3];
        groceryItems[0] = new GroceryItem("Milk"); // customised constructor dariy and 1 get filled.
        groceryItems[1] = new GroceryItem("apples","PRODUCE", 6);
        /*We are dealing with the object groceryItems, so we can't use the literal string. however the compiler
        will allow us to do this, but it's not recommended. because it will allow us to store the literal string instead
        of the GroceryItem object.
        * */

        /*however instead of using Object array, we can use GroceryItem array to store the object.
        so that we can't store the literal string instead of object. because this time compiler
        will not allow us to do this. After changing the array type to GroceryItem, we can't store the literal string.
        * */
//        groceryItems[2] = "5 oranges"; //literal string instead of object.
        groceryItems[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryItems));


        //ArrayList:
        ArrayList objectlist = new ArrayList();
        objectlist.add(new GroceryItem("Butter"));
        objectlist.add("yogurt"); //literal string, and it is allowed & we don't want this.

        /* when we declare an array list, we probably know what data we want in that list.
        here we want GroceryItem item record, and we don't want to store the literal string.
        so we can specify the type of the ArrayList.
        syntax: ArrayList<type> listName = new ArrayList<>();
        * */

        /*with this declaration, the compiler will not allow us to store the literal string in the ArrayList.
        because the  compilor will do the compile time type checking after when type is specified.

        * */
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
//        groceryList.add("yogurt"); //literal string, and it is not allowed.


    }
}
