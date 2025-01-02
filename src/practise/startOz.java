package practise;

public class startOz {
    public static void main (String[] args){



    }
    public String startOz(String str) {
        return str.substring(str.indexOf("o"), str.indexOf("o") + 1).equals("oz") ? "oz":
                str.contains("z") ? "z" : str.contains("o") ? "o":str;
    }
}
