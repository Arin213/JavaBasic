package OOP_1.inheritance.LibrarySystem;


/**4.Create a subclass DigitalResource that inherits from LibraryItem:

 Add an attribute file_size (in MB) in the constructor.
 Override the display_info() method. This method should:
 Call the display_info() method from the superclass using super.
 Print the additional file_size information:

 File Size: [file_size] MB
 * */
public class DigitalResource extends LibraryItem {
    private int fileSize;

    public DigitalResource(String title, String author, int fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("File Size - " + fileSize +"Mb");
    }

    @Override
    public String toString() {
        return "DigitalResource{" +
                "fileSize=" + fileSize +
                "} " + super.toString();
    }
}
