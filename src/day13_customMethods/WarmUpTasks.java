package day13_customMethods;

import java.util.Scanner;

public class WarmUpTasks {

    public static void main(String[] args) {

calculate(4,2,'+');

calculate(1,100,'-');

        Scanner input= new Scanner(System.in);
/*
        System.out.println("Enter 2 number and math operator:");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        char operator = input.next().charAt(0);
        calculate(n1, n2, operator);
 */
        System.out.println("___________________________");
    }

    public static void  calculate(double num1, double num2, char mathOperator){
double result = 0;
        switch (mathOperator){
            case '+': result = num1 + num2;
                System.out.println(num1+ " " + mathOperator + " " + num2 + " = " + result);
                break;
            case '-': result = num1 - num2;
                System.out.println(num1+ " " + mathOperator + " " + num2 + " = " + result);
                break;
            case '*': result = num1 * num2;
                System.out.println(num1+ " " + mathOperator + " " + num2 + " = " + result);
            case '/': result = num1 / num2;
                System.out.println(num1+ " " + mathOperator + " " + num2 + " = " + result);
            default:
                System.out.println("Invalid operator" + mathOperator);
        }
    }
}
/*
1. Create a method named calculate that can take three arguments:
        num1 (double)
        num2 (double)
        mathOperator (char)

        The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

        Ex:
        calculate(10, 20, '+')

        output:
        10 + 20 = 30

 */