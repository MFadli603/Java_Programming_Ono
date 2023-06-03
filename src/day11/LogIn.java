package day11;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        String correctUserName = "Cydeo", // string literal method in the string pool
                correctPassword = "WoodenSpoon";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:"); // new keyword
        String username= input.nextLine();

        System.out.println("Enter your password:");
        String password = input.nextLine();

        input.close();

        if(username.equals(correctUserName)  && password.equals(correctPassword)){

            System.out.println("You are logged in");
        } else{
            System.out.println("Incorrect username or password. Please try again");
        }


    }
}
