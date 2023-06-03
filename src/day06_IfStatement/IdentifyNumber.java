package day06_IfStatement;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number =0;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0; // isZero = !isPositive && !isNegative gej bas bichij bolno

        System.out.println(number + " is positive: "+ isPositive);
        System.out.println(number + " is negative: "+ isNegative);
        System.out.println(number+ " is zero: " + isZero);
    }
}
