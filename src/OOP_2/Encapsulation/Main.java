package OOP_2.Encapsulation;


/** Create a class named printer.
 * The fields on this class are as follows:
 * -> TonerLevel -> percentage of toner left in the toner cartridge.
 * -> pagesPrinted -> count the total pages printed.
 * -> duplex -> indicator of whether the printer will print on both sides of a
 * sheet of paper. True means it can, false means it can only print on one side of paper.
 *
 * You'll want to initialize your printer by specifying a starting toner amount and whether the printer
 * has duplex capabilities or not.
 *
 * On the printer class, create two methods, which the calling code
 * should be able to access.
 * These methods are:
 *
 * -> addToner() -> which takes a tonerAmount argument.
 *          -> tonerAmount is added to the tonerLevel field.
 *          -> The tonerLevel should never exceed 100 percent or even get below 0 percent.
 *          -> if the amount being added makes the level fal outside that range, return a -1 form the
 *          method, otherwise return the actual toner level after adding the amount passed to the method.
 *
 * -> printPages() -> which should take pages to be printed as the argument.
 *          -> it should determine how many sheets of paper will be printed.
 *          It should take into account the duplex value set for the printer.It should return the
 *          calculated number of sheets of paper.
 *          -> The sheet number should also be added to the pagesPrinted field.
 *          -> if it's duplex printer, print a message that it's a duplex printer.
 *
 *
 * */

public class Main {
    public static void main (String[] args){
        Printer printer = new Printer(50, true);
        System.out.println("Initial count: " + printer.getPagesPrinted());
//        System.out.println(printer.addToner(51));
        System.out.println(printer.printPages(5));
        System.out.println(printer.printPages(10));
        System.out.println("Print total: " + printer.getPagesPrinted());

    }
}
