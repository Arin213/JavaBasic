package methodOverLoading;
/* In this challenge, we're going to create a method, that takes time, represented in seconds as the
    parameter.
    We'll then want to transform the seconds into hours.
    Next, we'll display the time in hours with the remaining minutes and seconds in string.
    We'll do this transformation in two steps, which allows us to use overloaded methods.


    We want to create two methods with the same name: getDurationString
 >> The first method has one parameter of type int, named seconds.
 >> The second method has two parameters, named minutes and seconds, both int.
 >> Both methods return a String in the format shown:
 "XXh YYmm ZZs".
  Where XX represents the number of hours, YY the number of minutes, and ZZ the number
  of seconds.
 >> The first method should in turn call the second method to return its results.
 >> Make both methods public and static as we've been doing so far...
 >> Remember that one minute is 60 seconds, and one hour equals 60 minutes, or 3600 seconds.
 - Add validation to the methods as a bonus:
 >> For the first method, the second parameter should be >= 0.
 >> For the second method, the minute parameter should be >= 0.
    And the second parameter should be >= 0, and <= 59.
 >> If either method is passed and invalid value, print out some type of meaningful message to the user.
* */
public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDuringString(-3945));
        System.out.println(getDuringString(-65,45));
        System.out.println(getDuringString(65,145));
        System.out.println(getDuringString(3945));
        System.out.println(getDuringString(65,45));

    }
    public static String getDuringString(int seconds){
        if (seconds <= 0){
            return "Seconds must be greater than zero";
        }
//            int hours = seconds/3600;
//            seconds %= 3600;
        int minutes = seconds / 60;
//            seconds %= 60;
        return  getDuringString(minutes, seconds % 60);



    }
    public static String getDuringString(int minutes, int seconds){
        if ((minutes > 0) && seconds <= 59 && seconds >= 0){
            int hours = minutes / 60;
            minutes %= 60;
            // "XXh YYmm ZZs"
            return (hours+"h " + minutes+"m " + seconds+"s");

        }
        return ("minutes must be  >= 0 or seconds must be >=0 and <= 59");

    }
}
