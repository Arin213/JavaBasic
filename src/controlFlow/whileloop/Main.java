package controlFlow.whileloop;

public class Main {
    public static void main (String[] args){
        /* for loop will run up to the given range where for loop
           has the start line and end line.In given below  start line
           will be i and end will be given as 5.
        * */
        for(int i = 1; i <= 5; i ++){
            System.out.println(i);
        }

        /*  for while loop the initialization should be out of scope, and
            the condition is passed inside while (condition) and loop until the
            condition get meets.
            NOTE: to stop the while loop, we must add the increment
            so that the condition will be matched or also break can also do the work if the
            condition got matched.
            NOTE: while using while loop, we must be careful with the side effect of it cause
            using while loop is straightforward to get into infinite loop.
        * */
        int j =1;
        while(j <= 5){
            System.out.println(j);
            j++;
        }

        // using while (ture)
        int k = 1;
        while(true){
            if (k > 5){
                break;
            }
            System.out.println(k);
            k++;
        }

        /* Do-while run at least once, even the condition won't get matched.
           NOTE: the expression always ends with ";" when using do-while unlike using
           while loop.

           When to use do while?
           → If there's a scenario where you must execute a piece of code
           at least once before checking a condition, a do-while loop is perfect.
           For example:

           User Input Validation: You want to prompt the user for input and then validate it.
           The prompt should appear at least once, and if the input is invalid, ask again.
        * */
        int l = 1;
        boolean isReady = false;
        do{
            if (l > 5){
                break;
            }
            System.out.println("This while loop = " + l);
            l++;
            isReady = (j > 0);
        } while(isReady); // ending with ";"
    }

}
