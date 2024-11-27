package OOP_1.inheritance.LibrarySystem;


/** 3. Create another subclass Magazine that also inherits from LibraryItem:

 Add an attribute issue_number in the constructor.
 Override the display_info() method. This method should:
 Call the display_info() method from the superclass using super.
 Print the additional issue_number information:

 Issue Number: [issue_number]
 * */
public class Magazine extends LibraryItem {
    private static int issueNumber = 0;

    public Magazine(String title, String author, int issueNumber ) {
        super(title, author);
        this.issueNumber = issueNumber;
        Magazine.issueNumber++;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Issue Number - " + issueNumber);
    }

    @Override
    public String toString() {
        return "Magazine{IssuedNumber=" + issueNumber + "}" + super.toString();
    }
}
