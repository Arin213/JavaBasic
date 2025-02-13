package dev.learnArray.twoDimensionalArray;


import java.util.Arrays;

/*int[][] array = {
                {1, 2},
                {4, 5, 6},
                {7, 8, 9, 10, 11}
        };
        we have 2D array with 3 elements and nested array with different length.

we can initialize a two-dimensional array and define the size of the nested arrays.
                as shown here.
        int[][] array = new int[3][3];
        This statement says we have 3 nested arrays, and each nested array will have 3 ints.

we can initialize a two-dimensional array without specifying the size of the nested array
               int[][] array = new int[3][]; // this is a valid statement.
               here we have outer length of 3 but left the inner array empty so can add any number of elements
               to the inner array.

There are a lot of ways to declare a two-dimensional array.
               most common:
               int[][] myDoubleArray; //This is the best recommendation.
               int[] myDoubleArray[];
* */
public class Main {
    public static void main(String... args){
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        //loop through outer array and print the address of the nested arrays.
        for(int[] outer: array2){
//            System.out.println(outer);
            //get the actual instead of address of the nested arrays.
            System.out.println(Arrays.toString(outer));
        }
        for(int i = 0; i< array2.length; i++){
            var innerArray = array2[i];
            for(int j = 0; j < innerArray.length; j++){
//                System.out.println("array2[" + i + "][" + j + "] = " + innerArray[j]);
                array2[i][j] = (i * 10) + (j + 1);

            }
            System.out.println();
        }
        //using for each loop or enhanced for loop to loop through the nested arrays.
//        for(var outer: array2){
//            for(var inner: outer){
//                System.out.print(inner + " ");
//            }
//            System.out.println();
//        }

        //initialize a two-dimensional array with different length of nested arrays.
        //In single line with neat and clearer way.
        System.out.println(Arrays.deepToString(array2));
        array2[1]= new int[]{1, 2, 3, 4}; //adding new int array to the nested array at index 1.
        //however we can't use the anonymous array to add new array to the nested array.
//         array2[1] = {1,2,3,4}; //this is not allowed.
        /* When we declare multi-dimensional array, the declared type can itself be an array, and
        this is how java supports two-dimensional arrays.
        int[][] array = new int[3][];
        declares and instantiate an array of 3 integer arrays, whose size are not specified.
        dog[][] my dogs = new dog[3][];
        declares and instantiate an array of 3 arrays,
        which will have dog elements, again the sizes of the inner arrays aren't specified.

        int[3][] ={
        }
        * */


        System.out.println(Arrays.deepToString(array2));

        /*The outer array can have references to any kind of array itself.
        in this example, we have an outer array with three elements.

       Object[] multiArray = new Object[3];
       multiArray[0] = new Dog[3];
       multiArray[1] = new Dog[3][];
       multiArray[2] = new Dog[3][][];

       The first element is itself a single-dimensional array.
       The second element is a two-dimensional array.
       And lastly, the third element is a three-dimensional array.

        * */

        //Everything can be referred to as an object including arrays themselves.
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        anyArray[0] = new String[]{"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{
                {"a", "b"},
                {"d", "e", "f"},
                {"g", "h", "i", "j"}

        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for(Object element : anyArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString = " + element);

            //java compile not sure what the type of the element is, so we need to cast it to the appropriate type.
            //so object[] can hold any type of array. and casting is required to get the actual type of the element.
            //however Object should not be used to store different types of elements.because it can lead to runtime errors.
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
