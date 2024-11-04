package projectCinema;

/**Description

 There are many enjoyable activities on this funny little planet Earth, and still, the happiest, simplest,
 and most fulfilling one is probably going to the movies. Going with friends, going with loved ones,
 experiencing a whole new adventure from the safety of a cinema seat, surrounded by like-minded fellow travelers.

 As a beginner developer, you can contribute to creating this wonderful cinema experience.
 Your good friends asked you to help them create an application for a cinema theatre where people can get tickets,
 reserve seats, and enjoy their movie night.

 An illustration of a modern cozy theater
 Objectives

 There is not a lot of space in our new cinema theatre, so you need to take into account the restrictions
 on the number of seats. Your friends said that the room would fit 7 rows of 8 seats.
 Your task is to help them visualize the seating arrangement by printing the scheme to the console.

 Your output should be like in the example below and should contain 9 lines, the title "Cinema:" - 1 line and room size - 8 lines.
 Cinema:
   1 2 3 4 5 6 7 8
 1 S S S S S S S S
 2 S S S S S S S S
 3 S S S S S S S S
 4 S S S S S S S S
 5 S S S S S S S S
 6 S S S S S S S S
 7 S S S S S S S S
 * */
public class PrintSeats {
    public static void main(String[] args){
        printSeats(8);
        System.out.println(" ");
        printSeats(7, 8);


    }
    public static void printSeats(int column){
        System.out.println("Cinema:");
        for(int l = 1; l <= column; l++){
            if (l == 1){
                System.out.print(" ");
            }
            System.out.print(" " +l);
        }
    }
    public static void printSeats(int row, int column){
        for(int i = 1; i <= row; i++){
            System.out.print(i);
            for(int j = 1; j <= column; j++ ){ // column = 1(n ++) + 8(column)
                System.out.print(" S");
            }
            System.out.println("");
        }
    }
}
