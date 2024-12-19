package OOP_2.Encapsulation;

public class Printer {
//    private int tonerLevel;
//    private int pagesPrinted;
//    private boolean duplex;
//
//    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
//        this.tonerLevel = tonerLevel;
//        this.pagesPrinted = pagesPrinted;
//        this.duplex = duplex;
//
//    }
//
//    public int getTonerLevel() {
//        return tonerLevel;
//    }
//
//
//    public boolean isDuplex() {
//        return duplex;
//    }
//
//    public int addToner(int tonerAmount){
//        int total = tonerAmount + tonerLevel;
//        return (total > 100) || (tonerLevel < 0) ? -1:total;
//
//    }
//
//    /*-> printPages() -> which should take pages to be printed as the argument.
//     *          -> it should determine how many sheets of paper will be printed.
//     *          It should take into account the duplex value set for the printer.It should return the
//     *          calculated number of sheets of paper.
//     *          -> The sheet number should also be added to the pagesPrinted field.
//     *          -> if it's duplex printer, print a message that it's a duplex printer.
//    * */
//    public String printPages(int pages){
//        if(isDuplex()){
//            return ((pages/2 + pages % 2) + pagesPrinted) + " It's a duplex printer";
//        }
//        return Integer.toString((pages/2 + pages % 2) + pagesPrinted);
//
//    }
//    public int getPagesPrinted() {
//        return pagesPrinted;
//    }

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = tonerLevel > -1 && tonerLevel <= 100 ? tonerLevel: -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int newTonerLevel = tonerAmount + tonerLevel;
        return tonerAmount > 0 &&  tonerAmount <= 100 ?
                (newTonerLevel > 100 ? -1 : newTonerLevel) : -1;
    }

    public int printPages(int pages){
        int pagesToPrint = (duplex) ? pages/2 + pages%2 : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

}

