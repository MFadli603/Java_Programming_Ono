package day06_IfStatement;

public class Cigarettes {

    public static void main(String[] args) {

        int age= 20;

        if(age>=21 && age <100){

            System.out.println("Eligible to buy cigarettes.");
        }
        if(age<=20 || age >100){

            System.out.println("Not eligible");
        }
    }
}
