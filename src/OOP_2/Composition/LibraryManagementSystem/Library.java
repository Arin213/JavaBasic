package OOP_2.Composition.LibraryManagementSystem;

public class Library {
    private Book[] book;
    private int bookCount;

    public Library(int size) {
        book = new Book[size];
        bookCount = 0;
    }

    // add books
    public boolean addBook(Book books){
        if(bookCount < book.length){
            book[bookCount] = books; // books will be added to book where bookCount[0] will be its index.
            bookCount++;
            return true;
        }
        return false; // means book capacity is full or no book
    }

    // display books
    public void displayBook(){
        for(int i = 0; i < book.length; i++ ){
            if(book[i] != null){
                System.out.println("index " + i + " " + book[i].getTitle() +
                    " "+ "by " + book[i].getAuthor().getName());
            }else{
                System.out.println("index " + i  + " " + "is [EMPTY]");
            }
        }
    }

    // search by genre
    public void bookGenre(String genre){
        System.out.println("Book in genre " + genre);
        for(Book books : book){ // for(type variable: array)
            if(books != null && books.getGenre().equalsIgnoreCase(genre)){
                System.out.println(books.getTitle());
            }
        }
    }

    //find books by author
    public void findBookByAuthor(String authorName){
        System.out.println("Book by author " + authorName + ":");
        for(Book searchBook :book){
            if(searchBook != null && searchBook.getAuthor().getName().equalsIgnoreCase(authorName)){
                System.out.println(searchBook.getTitle());
            }
        }
    }
}
