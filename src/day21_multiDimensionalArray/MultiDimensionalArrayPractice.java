package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel"};
        String[] group2 = {"Bella", "Tom", "Jerry"};
        String[] group3 = {"Ali", "Mohammed", "John", "Ben"};
        String[] group4 = {"Luis", "Brian", "Jenny", "Carlos", "Isabella"};

        String[][] groups = {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {

            String[] eachGroup= groups[i];

            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);

            }
        }

        System.out.println("-------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }


        System.out.println("-----------------------------------------------------------");

       // System.out.println(groups);  --> hashcode error

        // System.out.println( Arrays.toString(groups)); // toString() ==> for single dimensional arrays ONLY

        System.out.println( Arrays.deepToString(groups) ); // deepToString() ==> for multi-dimensional dimensional arrays ONLY


    }
}
