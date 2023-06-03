package day09_scanner;

import java.util.Scanner;
public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a character: ");
      //  char ch = input.next().charAt(0);// 0 stands for first character

     //   System.out.println("You have entered: "+ ch);

        System.out.println("Would you like to continue?");
        String answer = input.nextLine(); // shows entire sentence from the user

        System.out.println("Your answer is: " + answer);

input.close();

    }
}
