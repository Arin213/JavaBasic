package OOP_1;



public class Car {
    /**　public static void main(String[] args) {
            Car newC = new Car();
            newC.make = "posher";

        }
     here modification of attributes can be possible even the modifier is set as private
     because private modifier allows the accessible within the same class (Car class) but not
     in other class like Main class.
     *
     */


    //attributes(fields)

    private String make = "Tesla";
    private String model= "Model X";
    private String colour = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    /** now if we look at the setMake(String make), param suppose to carry the value of make and assigned
     * to the private field of make i.e. private string make = "telsa(supposed to be updated)"
     * however make = make cause the problem because it refers to local param  and method is just assigning make to
     * make itself, and java could not able to understand that we are referring to the instance variable.

     * for this, we have a new keyword "this" which will help us to clarify the problems.work as accesser fields on
     * class.
     * this.make = make [this.make holds the value for what make is assigned to and make is simple the param also known
     * as (string make) got passed to public void setMake(string make)]
     * */
    public void setMake(String make){
//        make = make; // this won't work
//        this.make = make; //this wil work
//        if (make == null) {
//            make = "unknown";
//        }
        // or we could use this ↓↓↓
        if(make == null) make = "unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " +
         colour + " " +
         make + " " +
         model + " " +
         (convertible ? "convertible" : ""));



    }

}

