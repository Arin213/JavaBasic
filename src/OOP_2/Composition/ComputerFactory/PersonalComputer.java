package OOP_2.Composition.ComputerFactory;

public class PersonalComputer extends Product {
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer,
                            Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    private void drawLogo(){
        monitor.drawPixelAt_(1200, 50, "yellow");

    }
    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }


//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
}
