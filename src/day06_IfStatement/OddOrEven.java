package day06_IfStatement;

public class OddOrEven {

    public static void main(String[] args) {

        int number =33;

        boolean isEven = number % 2 == 0;// even number
        boolean isOdd = !isEven;

        System.out.println( number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " +isOdd);
    }
}

