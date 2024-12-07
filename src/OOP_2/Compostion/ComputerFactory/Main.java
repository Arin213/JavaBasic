package OOP_2.Compostion.ComputerFactory;

public class Main {
    public static void main (String[] args){
        ComputerCase theCase = new ComputerCase("2208", "dell",
                "240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1400");

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208","Dell",theMonitor,
                theMotherboard,theCase);

//        thePC.getMonitor().drawPixelAt_(10,10, "ged");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();

    }
}
