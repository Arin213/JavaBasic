package OOP_2.Composition.composition;

/**1) Create a class and name it Lamp. Inside this class should be declared three member variables:
 style of type String, battery of type boolean, and globRating of type int. All variables should be marked private.
 A constructor needs to be created which accepts the three member variables as parameters.
 In addition, four methods should also be created: turnOn() has no return type and
 should print a message that the lamp is being turned on; getStyle() returns the lamp style;
 isBattery returns the value of battery; and getGlobRating() returns the globRating of the lamp.

 * */
public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    //creation of turnOn() -> sop("Lamp -> Turning on");
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    //getters

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
