package OOP_2.Composition.LibraryManagementSystem;

/****Composition:**
 - Create a `Book` class that includes attributes like
 `title`, `genre`, and `author` (composition: a `Book` has an `Author`).

 *
 */


public class Book {
    private String title;
    private String genre;
    private Author author;

    public Book(String title, String genre, Author author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }

}
