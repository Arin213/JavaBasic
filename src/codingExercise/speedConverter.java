package codingExercise;

public class speedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(60.5);
        printConversion(10.5);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }
    public static long toMilesPerHour(double KilometersPerHour){
        return KilometersPerHour < 0 ? -1: Math.round(KilometersPerHour/1.609);
    }
    public static void printConversion( double KilometersPerHour){
        if (KilometersPerHour < 0){
            System.out.println("Invalid Value");
            return;
        }
        long convert = toMilesPerHour(KilometersPerHour);

        System.out.println(KilometersPerHour + " Km/h" + " = " + convert + " mi/h");

    }
}
