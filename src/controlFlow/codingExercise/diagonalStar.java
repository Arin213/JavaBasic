package controlFlow.codingExercise;

/** Diagonal Star

 Write a method named printSquareStar with one parameter of type int named number.

 If the number is < 5, the method should print "Invalid Value".

 The method should print diagonals to generate a rectangular pattern composed of stars (*).
 This should be achieved by using loops (see examples below).

 EXAMPLE INPUT/OUTPUT:

 EXAMPLE 1

 printSquareStar(5); should print the following:

 → NOTE: For text in Code Blocks below, use code icon {...}  On Udemy

 *****
 ** **
 * * *
 ** **
 *****


 Explanation:

 *****   5 stars
 ** **   2 stars space 2 stars
 * * *   1 star space 1 star space 1 star
 ** **   2 stars space 2 stars
 *****   5 stars


 EXAMPLE 2

 printSquareStar(8); should print the following:

 ********
 **    **
 * *  * *
 *  **  *
 *  **  *
 * *  * *
 **    **
 ********


 The patterns above consist of a number of rows and columns (where number is the number of rows to print).
 For each row or column, stars are printed based on four conditions (Read them carefully):

 In the first or last row

 In the first or last column

 When the row number equals the column number

 When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)


 HINT: Use a nested loop (a loop inside a loop).

 HINT: To print on the same line, use the print method instead of println, e.g., System.out.print(" ");
 prints a space and does not "move" to another line.

 HINT: To "move" to another line, you can use an empty println call, e.g., System.out.println();.

 NOTE: The method printSquareStar should be defined as public static like we have been doing so far in the course.
 *
 */

public class diagonalStar {
    /**
     HINT: Use a nested loop (a loop inside a loop).

     HINT: To print on the same line, use the print method instead of println, e.g., System.out.print(" ");
     prints a space and does not "move" to another line.

     HINT: To "move" to another line, you can use an empty println call, e.g., System.out.println();.
     * */
    public static void main (String[] args){
        printSquareStar(5);
        printSquareStar(8);
    }
    public static void printSquareStar(int num){
        if (num < 5){
            System.out.println("Invalid Value");
        }
        for (int row = 1; row <=num; row++){
            /**  First let's break down the problem,
             * for the first step we get the full "*" of 1st column passing condition (column = 1)
             * working mechanism = when column = 1 for 1st repetition print (*) now it no longer work for inner loop
             * and get out and outer go for row 2 and again inner loop starts and check for column = 1 and print (*) and
             * again done for inner loop and outer loop go for row 3 and so on.
             * <p>
             * now the second step I have done here for row = 1
             * working mechanism = when row = 1, the inner loop starts to work and print the first 8 horizontal
             *  (*) and finally the loop will exit.
             * <p>
             * for column == num (8, 8); printing will start at the last position i.e., num(8).
             * for row == column (1,1) (2,2) the printing will be diagonal for a left up to the bottom right down
             * for row == num (8,8) (8, 8)... prints horizontal line of (*) at bottom.
             * for (column + row) == num +1 i.e. (1+ 8) num(8) + 1 = 9
             *                                   (2+ 7) = 9 ... so on
             *  a working mechanism = first row = 1 and second loop will start and column = 1 and 2 and so on and keep
             *  adding the number until the row(1) + column(1 -> 8) = num(8 0r 5) + = (9 or 6)
             *  if column (1, 2, 3 ,4) + row (1) = num(8) + 1 = 9 and so on.
             *                                   this will print the diagonal stars form up right to leave down
             *
             *
            */
            for (int column = 1; column <= num; column++ ){
                if((column == 1 || row == 1) || (column == num )  || (row == column) ||
                        (row == num) ||   ((column + row) == (num + 1))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
