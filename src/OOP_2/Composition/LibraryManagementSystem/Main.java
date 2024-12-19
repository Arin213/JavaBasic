package OOP_2.Composition.LibraryManagementSystem;
/**Here’s a problem that incorporates **inheritance** and **composition** in Java,
 * along with a scenario to make it relatable. Give it a try! 🚀

 ---

 **Problem: A Library Management System**

 You need to create a mini-library system with the following requirements:

 ---

 **Requirements:**
 1. **Inheritance:**
 - Create a `Person` class with basic details (like `name` and `age`).
 - Extend it to create two specific classes:
 - `Author`
 - `Reader`

 2. **Composition:**
 - Create a `Book` class that includes attributes like `title`, `genre`, and `author` (composition: a `Book` has an `Author`).

 3. Library Class:

 Create a Library class with:
 A fixed number of Book slots (use a plain array, e.g., Book[]).
 Methods to:
 Add a Book to the library (find an empty slot in the array).
 Search for books by genre.
 Search for books by a specific author.

 4. **Interactions:**
 - Create a `Main` class where you:
 - Create some `Author` objects.
 - Create some `Book` objects using the authors.
 - Add books to the `Library`.
 - Have a `Reader` search for books by genre or author.

 ---

**Expected Classes:**
 1. **Person (Base class)**
 Attributes: `name`, `age`.

 2. **Author (Subclass of Person)**
 Additional Attributes: `biography`.

 3. **Reader (Subclass of Person)**
 Additional Attributes: `preferredGenre`.

 4. **Book**
 Attributes: `title`, `genre`, `author` (an `Author` object).

 5.Library

 Attributes: Book[] books (a fixed-size array of books).

 ---


 **Challenge:**
 - Write the full implementation for these classes and methods.
 - Ensure each class uses inheritance or composition appropriately.
 - Demonstrate the functionality in the `Main` class.

 ---

 Let me know if you need help or guidance on solving it! 😊
 * */
public class Main {
    public static void main(String[] args){
        // create authors
        Author author1 = new Author("John Keats", "25",
                "an English poet of the second generation of Romantic poets, ");
        Author author2 = new Author("Mary Shelley", "30", "Author of Frankenstein");

        //create books
        Book book = new Book("Ode to a Nightingale","Poem", author1);
        Book book2 = new Book("Frankenstein", "Novel", author2);
        Book book3 = new Book("To Autumn", "Poem", author1);

        // crate the array of library
        Library library = new Library(5);

        // add books to the library
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);

        //display all books
        System.out.println("All books inn library");
        library.displayBook();

        //search book by genre
        System.out.println("\nsearch by genre");
        library.bookGenre("Poem");
        library.bookGenre("Novel");

        //search book by author
        System.out.println("\nSearch by Author Name:");
        library.findBookByAuthor("John Keats");
        library.findBookByAuthor("Mary shelley");

    }
}
