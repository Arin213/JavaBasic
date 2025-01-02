package OOP_2.polymorphism.Movie;

import java.util.Locale;

public class Movie {
    private String title;

    public Movie(String title){
        this.title = title;

    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
//        System.out.println(title + " is a " this.getSimpleName() + " film");

    }
    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}
class Adventure extends Movie{
    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();

        // .repeat(3) will repeat "... %s%n" where %s -> Strings, %n -> new line
        System.out.printf("... %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad happens");
    }
    public void feedback(){
        System.out.println(STR."great and good film love this one!");

    }
    public void watchAdventure(){
        System.out.println("Adventure is playing!");
    }
}

class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();

        // .repeat(3) will repeat "... %s%n" where %s -> Strings, %n -> new line
        System.out.printf("... %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending ");
    }
    public void watchComedy(){
        System.out.println("Comedy is playing!");
    }
}

class ScienceFiction extends Movie{
    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();

        // .repeat(3) will repeat "... %s%n" where %s -> Strings, %n -> new line
        System.out.printf("... %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens ",
                "Planet Blows Up");
    }
    public void watchScienceFiction(){
        System.out.println("ScienceFiction  is playing!");
    }

}
