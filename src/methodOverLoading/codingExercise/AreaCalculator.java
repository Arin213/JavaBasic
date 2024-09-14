package methodOverLoading.codingExercise;
/*  Area Calculator

Write a method named area with one double parameter named radius.

The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative, then return -1.0 to represent an invalid value.

Write another overloaded method with 2-parameter x and y (both doubles), where x and y represent the sides of a rectangle.

The method needs to return an area of a rectangle.

If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

For formulas and PI value, please check the tips below.

Examples of input/output:

    area(5.0); should return 78.53981633974483 or 78.53981

    area(-1);  should return -1 since the parameter is negative

    area(5.0, 4.0); should return 20.0 (5 * 4 = 20)

    area(-1.0, 4.0);  should return -1 since the first parameter is negative


NOTE: All methods need to be defined as public static ​like we have been doing so far in the course.
* */
public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.0, 4.0));
    }
    public static double area(double radius){
        return radius < 0 ? -1.0: Math.PI*Math.pow(radius,2);
    }
    public static double area(double x, double y){
        return x < 0 || y < 0 ? -1.0: x * y;
    }
}
