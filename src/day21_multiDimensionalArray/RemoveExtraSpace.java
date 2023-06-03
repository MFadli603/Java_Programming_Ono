package day21_multiDimensionalArray;

public class RemoveExtraSpace {

    public static void main(String[] args) {

     String  str = "  Hello world      I      love      Java    ";

        String[] words = str.split(" ");

        str = "";

        for( String each: words){// accessing each word of the string
            if(!each.isEmpty()){
                str += each + " ";
            }

        }
        str = str.trim(); // to remove the space on the last word
        System.out.println("str = " + str);

    }
}
/* Write a program that can remove all the extra space from string
        Ex:
        str = "  Hello world      I      love      Java    "

        Output:
        Hello world I love Java
        */
