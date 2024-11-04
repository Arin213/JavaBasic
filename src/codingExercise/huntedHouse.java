package codingExercise;
import java.util.Scanner;
/**Create a ghost detector program for a haunted house. The detector activates
 * when it's dark AND either cold or there's a strange noise.
 * Input a boolean value for each condition (dark, cold, noise) and output whether the ghost detector is activated.
 * */
public class huntedHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        boolean isDark = Boolean.parseBoolean(scanner.nextLine());
        boolean isCold = Boolean.parseBoolean(scanner.nextLine());
        boolean isNoisy = Boolean.parseBoolean(scanner.nextLine());

        // Implement ghost detector logic here
        boolean isDetectorActivated = false;
        if(isDark && (isCold || isNoisy)){
            isDetectorActivated = true;
        }

        // Output the result
        System.out.println(String.valueOf(isDetectorActivated));

        scanner.close();
    }
}
