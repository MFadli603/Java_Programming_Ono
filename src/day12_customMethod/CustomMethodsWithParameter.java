package day12_customMethod;

import day06_IfStatement.OddOrEven;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        OddOrEven(8);
        System.out.println("____________________");
        OddOrEven(10000);
        System.out.println("_____________");
        isEligible(22);

        System.out.println("_______________________");
        int num1= 100;
      OddOrEven(num1);
        int num2 = 200;
        OddOrEven(num2);

        System.out.println("_______________________");

        IsOddOrEvenOrZero(33);
    }

    public static void OddOrEven(int number){
if(number%2==0){
    System.out.println(number + " is even number");
 }else {
    System.out.println(number + " is odd number");
}

    }
    // creat a method if the person is eligible to buy alcohol

    public static void isEligible(int age){

        if(age >=21 && age <=150){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }

    }

    public static void IsOddOrEvenOrZero(int num){

        if(num%2==0){
            System.out.println(num + " is even number");
        }else if(num==0){
            System.out.println(num+ " is zero");
        }else  {
            System.out.println(num + " is odd number");
        }
    }

}

