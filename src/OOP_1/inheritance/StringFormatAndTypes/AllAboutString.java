package OOP_1.inheritance.StringFormatAndTypes;


/**The purpose of String Methods
 * we can split String's methods up to into three basic categories;
 * \u2022 String inspection Methods.
 * \u2022 Methods for Comparing String values.%n
 * String Manipulation Methods.
 *
 * Methods:
 * length() -> Returns the number of characters in the String.
 * charAt() -> Returns the character at the index that's passed.
 * indexOf(), lastIndexOf -> Returns an integer, representing the index in the sequence where the
 * String or character passed, can be located in the String.
 * isEmpty() -> Returns true if length is zero
 * isBlank() -> Returns true if the length is zero OR the String only contains
 * whitespace characters, added in jdk11.
 *
 *
 * STRING COMPARISON METHODS
 * contentEquals() -> Returns a boolean if the string's value is equal to the *
 *                    value of the argument passed. This method allows for
 *                    arguments other than String, for any type that is a character sequence.
 *
 * equals() -> Return a boolean if the String's value is equal to the value of the  *
 *             argument passed.
 *
 * equalsIgnoreCase() -> Return a boolean if the String's value is equal(ignoring case),
 *                      to the value of the argument passed.
 *
 * contains() -> Returns a boolean if the String contains the argument passed.
 *
 * endsWith() and startsWith() -> These return a boolean,and are much like the contains method,
 *               but more specific to the placement of the argument in the String.
 *
 * regionMatches() -> Returns a boolean, if defined sub-regions are matched.
 * */
public class AllAboutString {
    public static void main (String[] args){
        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");
        String helloWorld = "hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of world = %d %n", helloWorld.indexOf("world"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        // start from index 3 where is l ? in which index l is itself in index 3
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        // start from the  8 now search the l where is the first occurrence ? it's in 3 again so 3 and 3 .
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l',8));

        //use of .equals() which checks the two string and return bool.
        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)){
            System.out.println("Value match exactly");
        }
        // use of equalsIgnoreCase()
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring case");
        }

        // the use of startsWith()
        if(helloWorld.startsWith("hello")){
            System.out.println("Starting starts with hello");
        }
        // the use of .endsWith()
        if(helloWorld.endsWith("World")){
            System.out.println("Starting end with World");
        }

        //use of contains
        if(helloWorld.contains("World")){
            System.out.println("String contains World");
        }

        //use of contentEquals contains more features then equals()
        //It can be used to compare a string builder's value, which the equals method
        // doesn't support.
        if (helloWorld.contentEquals("hello World")){
            System.out.println("Value match exactly");
        }







    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("length = %d %n", length); //get length

        //difference between empty and blank
        if(string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n",string.charAt(0) ); //get first char
        System.out.printf("Last char = %c %n", string.charAt(length-1)); //get last char


    }
}

