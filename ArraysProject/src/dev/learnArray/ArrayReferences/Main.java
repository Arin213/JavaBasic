package dev.learnArray.ArrayReferences;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        /* we create the array object of size of 5  with reference
        myIntArray, and again we pass the reference with the another references call the
        anotherArray. but no matter what the changes will made in reference the changes will be in other references
        as well this is because many references but pointing to the same object.
        * */

        anotherArray[0] = 1;
        modifyArray(myIntArray); // the changes will made in all references as same.
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
        /* Now if we make the changes in one reference the changes will be made in another references as well.
        in above we made the change in anotherArray[0] to 1 but the chagnes will made in myInt array also.
        * */

    }

    private static void modifyArray(int[] array){
        array[1] = 2;
    }
    /* now even we modify the argument of same array object but pointing by different
    references the result will be same.
    here three references:
        1. myIntArray
        2. anotherArray
        3. array
        These three references will point to the same array object.
        when passing the array as argument, java will make the copy of reference,
        not a copy of the object,
    * */
}
