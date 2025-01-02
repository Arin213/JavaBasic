package practise;

public class startOz {
    public static void main (String[] args){
        System.out.println(ispalindrome(-121));
        System.out.println(ispalindrome(1234567899));




    }
//    public String startOz(String str) {
//        return str.substring(str.indexOf("o"), str.indexOf("o") + 1).equals("oz") ? "oz":
//                str.contains("z") ? "z" : str.contains("o") ? "o":str;
//    }

    public static boolean ispalindrome(int x){
        if (x < 0){
            return false;
        }
        StringBuilder str = new StringBuilder(String.valueOf(x));
        String reverse = str.reverse().toString();
        int reverseInt = Integer.parseInt(reverse);
        return x == reverseInt;
    }
}
