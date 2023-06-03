package day07_IfStatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 100;

        if (score >= 0 && score <= 100) {// if the score is valid

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else{
            System.out.println("Invalid Score");// if the score is invalid
        }

        System.out.println("______________________");

        int age = -32;

        if(age >= 1 && age <= 150){
            if(age >=21){
                System.out.println("Eligible");
        }else {
                System.out.println("Ineligible");
            }

        }else{
            System.out.println("Invalid age");
        }

        System.out.println("_________________________");


    }
}