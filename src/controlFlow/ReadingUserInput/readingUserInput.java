package controlFlow.ReadingUserInput;
import java.sql.SQLOutput;
import java.util.Scanner;
public class readingUserInput {
    public static void main (String[] args){
        int currentYear = 2024;

//        String usersDataOfBirth = "1999";
//        // converting str into in using wrapper method (use of static method no need of instantiation of obj)
//        int dataOfBirth = Integer.parseInt(usersDataOfBirth);
//        // Error: cant do (-) operation with strings
//        // does compile if (+) operation reason - concatenation but unexpected result.
////        System.out.println("Age = " + (currentYear - usersDataOfBirth));
//        System.out.println("Age = " + (currentYear  - dataOfBirth));
//        String userAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
//        System.out.println("The user says he's " + ageWithPartialYear);
        /** The use of try and catch where try lets the code flow if the code is not
         *  expected, then instead of throwing error modified error will be thrown
         * as below code if the try statement failed then catch will executed.
         * */
        try {
            System.out.println(getInputFromScanner(currentYear));

        }catch(NullPointerException e){
            System.out.println(getInputFromConsole(currentYear));

        }

    }
    /** this won't work in ide if ide is disabled of use of console()
     *  we need terminal to work this run (System.Console().readLine())
     * similar like of python sys.args() [CLI]
     * */
    public  static String getInputFromConsole (int currentYear){
        String name = System.console().readLine("Hi, what's your Name ? \n");
        System.out.println("Hi " + name + ", Nice to meet  your !");
        System.out.println();

        String dateOfBirth = System.console().readLine("What year were you born ? \n");
        int getAge = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + getAge + " years old !";
    }
    public  static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
//        String name = System.console().readLine("Hi, what's your Name ? \n");
        System.out.println("Hi, what's your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Nice to meet  your !");
        System.out.println();

//        String dateOfBirth = System.console().readLine("What year were you born ? \n");
        System.out.println("what year were you born? ");
        boolean validDoB = false;
        int getAge = 0;
        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
//            String datOfBirth = scanner.nextLine();
//            getAge = currentYear -Integer.parseInt(datOfBirth);
            try{
                getAge = checkData(currentYear, scanner.nextLine());
                validDoB = getAge < 0? false: true;

            } catch (NumberFormatException badUserData){
                System.out.println("Non numeric data !! try again !");
            }
        }while (!validDoB);
//        String dateOfBirth = scanner.nextLine();
//        int getAge = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + getAge + " years old !";
//        return "";
    }
    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if ((dob < minimumYear) || (dob > currentYear)){
            return  -1;
        }
        return (currentYear - dob);
    }
}
