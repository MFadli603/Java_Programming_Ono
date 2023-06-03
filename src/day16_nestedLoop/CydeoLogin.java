package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();
        System.out.println("Enter your password:");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged in");
        } else {

            for(int i = 0; i < 3; i++){
                if(i!=2) {
                    System.err.println("Incorrect username and password. Please re-enter.");
                } else{
                    System.err.println("This is your last attempt. Please re-enter your username and password.");
                }

                System.out.println("Enter your username:");
                u = input.next();
                System.out.println("Enter your password:");
                p = input.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
                    System.out.println("You are now logged in");
                    break;
                }
            }

            if(!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.out.println("Your account is locked. Please contact with support team.");
            }

        }
input.close();

    }
}
/*
Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."

 */