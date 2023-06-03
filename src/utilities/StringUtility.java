package utilities;

public class StringUtility {

    public static String reverse(String str){
        String reverse = ""; // to contain all the characters of the given string in reversed order

        for(int i = str.length() - 1 ; i >= 0; i-- ){
            reverse += str.charAt(i);// to get the characters
        }

        return reverse;
    }
}
