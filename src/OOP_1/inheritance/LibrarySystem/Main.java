package OOP_1.inheritance.LibrarySystem;

/**problem: Library Hierarchy

 You are designing a program for a library system that deals with different types of materials. Here’s what you need to do:

 1. Create a superclass LibraryItem with:
 A constructor to initialize title and author.
 A method display_info() that prints:

 Title: [title]
 Author: [author]

 2. Create a subclass Book that inherits from LibraryItem:

 Add an attribute page_count in the constructor.
 Override the display_info() method. This method should:
 Call the display_info() method from the superclass using super.
 Print the additional page_count information:

 Page Count: [page_count]

 3. Create another subclass Magazine that also inherits from LibraryItem:

 Add an attribute issue_number in the constructor.
 Override the display_info() method. This method should:
 Call the display_info() method from the superclass using super.
 Print the additional issue_number information:

 Issue Number: [issue_number]

 4.Create a subclass DigitalResource that inherits from LibraryItem:

 Add an attribute file_size (in MB) in the constructor.
 Override the display_info() method. This method should:
 Call the display_info() method from the superclass using super.
 Print the additional file_size information:

 File Size: [file_size] MB

 5.Write a main function to:

 Create objects of LibraryItem, Book, Magazine, and DigitalResource.
 Display their details using the display_info() method.
 * */

public class Main {
    public static void main (String[] args){
        LibraryItem lib = new LibraryItem("Metamorphosis", "Franz kafka");
        System.out.println(lib);
        lib.displayInfo();
        System.out.println(" ");

        Book book = new Book("Sherlock's homes", "Sir Arthur Conan Doyle",360);
        System.out.println(book);
        book.displayInfo();
        System.out.println(" ");

        Magazine mag = new Magazine("Increment in declination of health ", "unknown",420265);
        System.out.println(mag);
        mag.displayInfo();
        System.out.println(" ");

        DigitalResource digitRrc = new DigitalResource("Toshiba", "????",1000 );
        System.out.println(digitRrc);
        digitRrc.displayInfo();

    }
}
