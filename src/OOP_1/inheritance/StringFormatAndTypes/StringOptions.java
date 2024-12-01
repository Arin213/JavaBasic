package OOP_1.inheritance.StringFormatAndTypes;

public class StringOptions {
    public static void main(String[] args){
        /**String: Immutable

         Strings in Java are immutable, meaning once a String object is created, its value cannot be changed.
         When you call a method like concat() on a String, it doesn't modify the original String.
         Instead, it creates a new String with the concatenated value.
         * */

        /**String x = "hello ";
         x.concat("world"); // Creates a new String "hello world" but does not assign it to x
         System.out.println(x); // Output: "hello "

         To get the desired result, you need to assign the result of concat() to a variable:
         x = x.concat("world");
         System.out.println(x); // Output: "hello world"

         * */
        String helloWorld = "hello" + " World";
        helloWorld.concat(" and Goodbye");

        /**StringBuilder: Mutable

         StringBuilder is mutable, meaning its value can be modified directly.
         When you call methods like append() on a StringBuilder, it modifies the original object rather than creating a new one.
         * */

        /**StringBuilder y = new StringBuilder("hello ");
         y.append("world"); // Modifies the original StringBuilder
         System.out.println(y); // Output: "hello world"

         * */
//        StringBuilder helloWorldBuilder ="hello" + " World"; // this won't compile, need constructor for this using new keyword.
        StringBuilder helloWorldBuilder = new StringBuilder("hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        //make a call
        System.out.println("Case for String".toUpperCase());
        printInformation(helloWorld);
        System.out.println("\nCase for StringBuilder".toUpperCase());
        printInformation(helloWorldBuilder);

        //use case and features of String Builder
        StringBuilder emptyStart = new StringBuilder(); //by default the space capacity is 16 char
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32); // now the space capacity is 32
        emptyStart32.append("a".repeat(17));

        //make call for stringBuilder method
        printInformation(emptyStart);
        printInformation(emptyStart32);
//        printInformation(builderPlus);

        /**SOME METHODS UNIQUE TO THE StringBuilder CLASS
         * A StringBuilder class has many similar methods to Strings.
         *
         * delete() and deleteCharAt() -> You can delete a substring using indices to specify a range, or delete a
         * single character at an index
         *
         * insert() -> you can insert text at a specified position.
         * reverse() -> you can reverse the order of the characters in the sequence.
         * setLength() -> setLength can be used to truncate the sequence to the length.
         * */

        StringBuilder builderPlus = new StringBuilder("hello" + " World");
        builderPlus.append(" and Goodbye"); //hello World and Goodbye

        // chaining methods
        builderPlus.deleteCharAt(16).insert(16,'g'); //del char at 16 and insert new char at 16
        System.out.println(STR."del char(G) at 16 and add small char(g) at 16\n\{builderPlus}");
        //replce(start, end, arg as "string") will replace the chars using index as well
        builderPlus.replace(16,17,"G"); // get back to capital "G" from 'g'.
        System.out.println(STR."Get back to capital G:\n\{builderPlus}");

        //using reveres() we can reverse the string and with setLength() we can adjust the length of chars
        builderPlus.reverse().setLength(7); // set length of total 7 chars and revers the chars goodbye -> eybdoog.
        System.out.println(builderPlus);



    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println(STR."length = \{string.length()}");
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        System.out.println(STR."length = \{builder.length()}");
        System.out.println(STR."Capacity = \{builder.capacity()}");
    }
}
