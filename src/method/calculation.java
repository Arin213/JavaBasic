package method;

public class calculation {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        int highScore = calculateScore(gameOver, score,levelCompleted, bonus);
        System.out.println("The next high score is " + calculateScore(gameOver, score,levelCompleted, bonus));
//        System.out.println("The high score is " + highScore);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);

        }
        return finalScore;

    }



}
/*   some programming languages will call a method that returns a value
    a function, and a method that doesn't return a value, procedure

    DECLARING  THE METHOD:
    declarations that need to occur as we create a method.
    * declaring Modifies: These are keywords in Java with special meaings,
    we've seen public and static as examples, but there are others as well.

    * declaring the return type:
    - void is a java keyword meaning no data is returned from a method.
    - alternatively, the return type can be any primitive data type or class.
    - if a return type is defined, the code block must use at least one return statement,
      returning a value, of the declared type or comparable type.

    one common practise is to declare a default return value at the start of a method, and only
    have a single return statement from a method, returning that variable, as shown in this
    example method;

    public static boolean isTooYoung (int age){
    boolean result = false;
    if (age < 21){
        result = true;
    }
    return result;
}

    * Void return type: in this case statement is optional, but it may be used to terminate execution
    of the method at some earlier point than the end of the method block, as shown here:

    public static void methodDoesSomething (int age){
    if(age > 21){
        return;
    }
    // to do things here....
}
NOTE: Java doesn't support default values for parameters.
The main method is special in Java, because java's virtual machine (JVM)
looks for the method, with this particular signature, and uses it as the entry point
for execution of code.

public  static void main(String[] args){
    // code in  here
}
* */
