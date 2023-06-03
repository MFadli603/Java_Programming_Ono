package day19_array;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[] args) {

        int[] num= {10,20,430,40, 50}; // use it when you know what those elements are

        System.out.println(Arrays.toString(num));

        System.out.println("----------------------");

        String[] days ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};//  index number starts with 0
        int n=1;
        System.out.println(days[n-1]); // this is 0 --> Monday


    }
}
