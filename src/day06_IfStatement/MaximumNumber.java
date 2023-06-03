package day06_IfStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1= 10, num2= 10;

        if(num1>num2){

            System.out.println(num1 + " is max number");
        }
        if (num1<num2){

            System.out.println(num2 + " is max number");

        }
         if(num1==num2) {

             System.out.println(num1 + " and " + num2 + " are equal numbers");
         }
    }
}
