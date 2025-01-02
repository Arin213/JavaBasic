package OOP_2.polymorphism.Movie;

import java.util.Scanner;
/** Casting with classes,and using object and var references;
 * Polymorphism allows writing code in a more generic fashion.
 *.............................................................
 * The same piece of code with a compile-time type of Movie can support different runtime types
 * (e.g., Adventure, Comedy) through polymorphism.
 * */
public class NextMain {
    public static void  main (String[] args){
        /**The Code Structure

         Movie.getMovie("A", "Jaws")
         This is a factory method that returns a Movie object, which could be an instance of
         Movie or one of its subclasses, like Adventure.

         movie.watchMovie()
         This calls the watchMovie() method on the object referenced by movie.
         If the object is an instance of Adventure, and Adventure overrides watchMovie(),
         then the overridden method will execute. This is runtime polymorphism.

         Casting and Reference
         Adventure jaws = (Adventure) Movie.getMovie("A", "jaws");
         This casts the object returned by getMovie() to the Adventure subclass.
         You can now access any methods or fields specific to Adventure using the jaws reference,
         as long as the object is indeed an Adventure instance. If the cast is invalid
         (e.g., the object isn't an Adventure), a ClassCastException will be thrown at runtime.

         Accessing via Casting
         Once cast, the specific subclass (Adventure) methods can be invoked. However,
         this does not bypass the factory method logic. The object creation still happens in Movie.getMovie(),
         and casting only alters how you interact with the returned object.
         * */

        //simply calling the watchMovie method of the Adventure class where base class reference is used.
//        Movie adventure = new Adventure("jaws");
//        adventure.watchMovie();

        // casting is ncessary to call the feedback method of the Adventure class
        // because no method(feedback() , watchAdventure()) is in the base class
//        ((Adventure) adventure).feedback();
//        ((Adventure) adventure).watchAdventure();

//        Movie movie = Movie.getMovie("A", "Jaws");
//        movie.watchMovie();
//
//        Adventure jaws = (Adventure) Movie.getMovie("A", "jaws");
//        jaws.watchMovie();
//        jaws.feedback();
//        jaws.watchAdventure();
//


//        Comedy com = (Comedy) Movie.getMovie("C","newline");
//        com.watchComedy();


        /**
         * Here, Movie.getMovie("C", "Airplane") is first assigned to a variable of type Object. Then:
         *
         *     Since Object is the root class in Java, the reference comedy can store any type of object.
         *     To use it as a Comedy, you need to explicitly cast it to Comedy (via (Comedy) comedy).
         *     This extra step is required because the compiler sees comedy as a general Object,
         *     and it has no knowledge that it might actually be a Comedy at runtime.
         */

//        Object comedy = Movie.getMovie("C","Airplane");
//        Comedy comedyMovie = (Comedy) comedy;
//        comedyMovie.watchComedy();
//
//        var airplane = Movie.getMovie("C", "Airplane");
//        airplane.watchMovie();

//        var plane = new Comedy("Airplane");
//        plane.watchMovie();

//        //testing the runtime using the instance of operator
        Object unknownObject = Movie.getMovie("S","stars wars ");
        // == operator won't work because check reference not the actual value
        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();

        } else if (unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }



//        Scanner scn = new Scanner(System.in);
//        String type = scn.nextLine();
//        String title = scn.nextLine();
//        Movie movie = Movie.getMovie(type, title);
//
//        System.out.println("method of main class or base class called watch movie");
//        movie.watchMovie();
//        System.out.println(" ");
//        // polymorphism behaviour Movie class references pointing to the Adventure object.
//        System.out.println("method of Adventure object as watch movies using the main class references:");
//        Movie instMovie = new Adventure(title);
//        instMovie.watchMovie();
//
//        System.out.println(" ");
//        System.out.println("Using the object casting:");
//        // casting with classes . this will allow to use the object Adventure even the references is Movie
//        ((Adventure)instMovie).feedback();
//
//        System.out.println(" ");
//        System.out.println("using the var references which will automate the type infer .");
//        //finally with var, Java figures out the type automatically. but initialization is ncessary;
//        var varinstOfMoive = new Adventure(title);
//        //call watchMovie of Adventure
//        varinstOfMoive.watchMovie();
//        // call the feedback
//        varinstOfMoive.feedback();






    }
}
