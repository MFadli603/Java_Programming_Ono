package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.println("Enter your first number:");
            int num1 = input.nextInt();

            System.out.println("Enter your math operator:");
            char o = input.next().charAt(0);

            while (!(o == '+' || o == '-' || o == '*' || o == '/')) {

                System.err.println("Invalid operator. Please re-enter the math operator");
                o = input.next().charAt(0);
            }

            System.out.println("Enter your second number");
            double num2 = input.nextDouble();

            double result = (o == '+') ? num1 + num2 : (o == '-') ? num1 - num2 : (o == '*') ? num1 * num2 : num1 / num2;
            System.out.println("result = " + result);

            System.out.println("Would you like to continue? yes/no");
            answer =input.next().toLowerCase();

            while (!(answer.equals("yes") && answer.equals("no"))){
                System.out.println("Invalid answer! Would you like to continue?");
                answer =input.next().toLowerCase();

            }

        }

    }
}
