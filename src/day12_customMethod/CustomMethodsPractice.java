package day12_customMethod;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        maxNumber(10000,5000);

        System.out.println("_________________");

        initials("Jew=nny", "Bat");
    }

    public static void maxNumber(double num1, double num2){

        if(num1>num2){
            System.out.println(num1 + " is the maximum number");
        }else if(num1<num2){
            System.out.println(num2 + " is the maximum number");
        } else {
            System.out.println("equal");
        }

    }

    // create a method that can display the initials of a person

    public static void initials(String firstName, String lastName){

       String initials = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println(initials);
    }
}
