package day06_IfStatement;

public class MinimumNumber {

    public static void main(String[] args) {

        int num1=20, num2=30;

        if(num1<num2){

            System.out.println(num1 +" is minimum");
        }
        if (num1>num2){
            System.out.println(num2 + " is minimum");
        }

        if(num1==num2){
            System.out.println("equal");
        }
    }

}
