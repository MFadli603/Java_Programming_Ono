package day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int []score = new int [5];

score[2] = 70;
score[3] = 80;
        System.out.println(Arrays.toString(score));
        System.out.println(score[2]);

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println(score[score.length-1]);
    }
}
