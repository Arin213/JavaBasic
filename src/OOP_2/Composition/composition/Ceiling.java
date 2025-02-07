package OOP_2.Composition.composition;

/**3) Create a class with the name Ceiling. There are two member variables for this one, height and paintedColor,
 both of type int. There should also be a constructor which accepts both member variables as parameters.
 There are also two additional methods which should be defined: getHeight() shall return the value of height and
 getPaintedColor() should return the value of paintedColor.
 * */
public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    //getters

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
