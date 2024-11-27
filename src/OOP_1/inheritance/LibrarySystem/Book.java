package OOP_1.inheritance.LibrarySystem;

public class Book extends LibraryItem{
    private static  int pageCount = 0;


    public Book(String title, String author, int pageCount){
        super(title, author);
        this.pageCount = pageCount;
        Book.pageCount++;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("page " + pageCount);
    }

    @Override
    public String toString() {
        return "Book{pageCount=" + pageCount + "}" + super.toString();
    }
}
