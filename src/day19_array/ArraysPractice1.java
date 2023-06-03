package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String name[] = new String[5];
        name[0]= "Mohammed";
        name[1] = "Jawit";
        name[2] = "Senait";
        name[3] = "Senai";
        name[4] = "Asil";

        System.out.println(Arrays.toString(name));
        name[3]= "Jenny";
        System.out.println(Arrays.toString(name));

        for (int i = name.length-1; i >=0 ; i--) { // reversing the list from last to first
            System.out.println(name[i]);

        }

        System.out.println("____________________");

        for (int i = 0; i < name.length; i++) {

        }


    }
}
