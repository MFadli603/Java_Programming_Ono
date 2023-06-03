package day10_string;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;
public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String t1 = "Python"; // in the string pool
        String t2 = new String("Python"); // outside the string pool
        String t3 = new String("Python");// outside the string pool
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2);// they are not the same and stored in the java heap by creating new memory
        System.out.println(t2 == t3);// they are not the same

        String s1 ="cat";
        String s2 = "cat";
        System.out.println(s1==s2); // they are the same objects and only one cat will be stored in the string pool

    }
}
