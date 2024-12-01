package OOP_1.inheritance.StringFormatAndTypes;


/**String Comparison Methods
 * These methods don't actually changes the underlying meaning of the text value but performs some kind of clean up
 *
 * indent() ->  This method was added in JDK 15, and add or removes spaces from the beginning of lines and multiline text.
 *
 * strip(), stripLeading(), stripTrailing() and trim() -> The difference between the strip method and trim method is
 *                                                        that the strip() supports a larger set
 *                                                        of white space characters.It and the corresponding
 *                                                        stripLeading and stripTrailing methods were added in JDK 11.
 *
 * toLowerCase() and toUpperCase() -> Returns a new String, either in a lower case or upper case.
 *
 *
 * This sets of methods transforms the String value and returns a String with a different meaning than the original result.
 *
 * concat() -> similar to plus operator for String, it concatenates text to the String and return a new String as teh result.
 *
 * join() -> Allows multiple Strings to be concatenated together in a single method. specifying delimiter.
 * repeat() -> Returns the String repeated by the number of times specified in the argument.
 *
 * replace(), replaceAll() and replaceFirst() -> These methods replace characters or strings in the string, returning a
 *                                               new String with replacements made.
 *
 * substring() and subSequence() -> These return a part of the string, its range defined by the start and end index specified.
 * */

public class StringMethods {
    public static void main(String[] args) {

        String birthDate = "25/11/1982";

        // get index of given string
        int startingIndex = birthDate.indexOf("1982");
        // get the starting index
        System.out.println(STR."startingIndex = \{startingIndex}");

        //get the slice part start from the startingIndex -> [6]
        System.out.println(STR."Birth year = \{birthDate.substring(startingIndex)}");

        //get the slice part of string by passing start index  and end index
        System.out.println(STR."Month = \{birthDate.substring(3, 5)}"); // start with 3 and end with 5(excluded)

        //join string with delimiter
        System.out.println("New date " + String.join("/","25","11","1982"));

        //replace the string char using the replace(old char(need to be replaced), new char(replace by this ));
        System.out.println("New date " + birthDate.replace("/","-")); // output -> 25-11-1982

        // using replaceFirst(regex, replacement) this will replace first part and this method is of regex
        System.out.println(birthDate.replaceFirst("/","-")); // replace only first part output -> 25-11/1982

        // using replaceAll(regex, replacement) this will replace all occurrence of string & is also of regex
        System.out.println(birthDate.replaceAll("/", "---")); // replace all occurrence output -> 25---11---1982

        // in python, we us * to repeat the string now in java we use .repeat(count n) to get the occurrence of  string
        System.out.println("ABC\n".repeat(3)); // repeat "ABC" 3 times
        System.out.println("-".repeat(20)); // repeat "-" 20 times

        System.out.println("ABC\n".repeat(3).indent(8));// repeat "ABC" 3 times with indentation of 8 spaces
        System.out.println("-".repeat(20)); // repeat "-" 20 times

        System.out.println("    ABC\n".repeat(3).indent(-2)); // repeat "ABC" 3 times with indentation of -2 + 4 spaces = 2 space
        System.out.println("-".repeat(20)); // repeat "-" 20 times

    }
}
