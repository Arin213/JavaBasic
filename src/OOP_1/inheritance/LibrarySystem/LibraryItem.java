package OOP_1.inheritance.LibrarySystem;

public class LibraryItem {
    private String title;
    private String author;

    public LibraryItem(){

    }

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void displayInfo(){
        System.out.println("Title - " + title);
        System.out.println("Author - " + author);
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
