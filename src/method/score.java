package method;
import java.util.Scanner;
public class score {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();


        System.out.print("Enter your score: ");
        int playerScore = sc.nextInt();
        System.out.println(" ");

        int Position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(name, Position); // we get the position from  the calculateHighScorePosition


    }
    public static void displayHighScorePosition(String name, int position){
        System.out.printf("%s managed to get into position %d on the high score list", name, position);

    }
    public static int calculateHighScorePosition(int playerScore){
//        int position = 4;
//        if (playerScore >= 1000){
//            position = 1;
//        } else if (playerScore >= 500) {
//            position = 2;
//        } else if (playerScore >= 100) {
//            position = 3;
//        }
//        return  position;
        return playerScore >= 1000 ? 1 :
               playerScore >= 500 ? 2:
               playerScore >= 100 ? 3: 4;
    }
}