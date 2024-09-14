package methodOverLoading;
/*  Create two methods with the same name:ConvertToCentimeters.
> The first method has one parameter of type int, which represents the entire
> height in inches.You will convert inches to centimeters, in this method, and pass back
> the number of centimeters, as double.

* The second method has two parameters of type int, one to represent height in feet, and one
> is to represent the remaining height in inches.So if a person is 5 feet, 8 inches, values 5 for feet and 8 inches
> would be passed to this method. This method will convert feet and inches to just inches, then cal the first method
> to get the number of centimeters, also returning the value as a double.

>>Both methods should return a real number or decimal value for total height in centimetres.
>>Call both methods, and print out the results.
The conversion formula from inches to centimeters is 1 inch = 2.54 cm.
Also, remember one foot = 12 inches.
 */
public class measurement {
    public static void main(String[] args) {
        System.out.println("Measurement of Centimeters in given inches: " + convertToCentimeters(68));
        System.out.println("Measurement of centimeters in given feet and inches: " + convertToCentimeters(5, 8));

    }
    public static double convertToCentimeters(int inches){
        // 1 inch = 2.54cm
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        //1 foot = 12 inches
//        return feet * 12 * 2.54 + convertToCentimeters(inches);
        return convertToCentimeters((feet * 12) + inches );
    }
}
