package OOP_2.polymorphism.Movie;

import java.util.Scanner;

public class Main {
    public  static void main (String[] args){
//        Movie movie = new Movie("Silent sea");

        /* well the class movie has the reference but the reference will no more
        point to the movie object but rather can be point to the subclasses object and if we go deep
        in the compile time the class Movie with the reference movie get compiled and ignore the object like
        what ever it is and during the runtime the object will be handled by jvm and look through the object
        in the case the object the Adventure not Movie so the Adventure will get run .
        This means polymorphism.
        * */
//        Movie movie = new Adventure("Stars Wars");
////        System.out.println(movie.getClass());
//        movie.watchMovie();

//        Movie movie = Movie.getMovie("Adventure", "Stars wars");
//        Movie movie = Movie.getMovie("Science", "Stars wars");
//        movie.watchMovie();
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("Enter type (A for Adventure, C for comedy, S for scienceFiction or Q for quit): ");
            String type = scn.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter the title: ");
            String title = scn.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();

        }

    }
}
