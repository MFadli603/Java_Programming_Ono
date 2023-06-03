package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {
        // Implicit casting

        byte a = 15;

        short b = a;
        // short b = (short)a;

        System.out.println(b);

        int c = a;// implicit casting

        int x = 100; // explicit casting
        byte y = (byte) x;

        float z = 20.8F;

        short q = (short) z;// only show integer result 20
        System.out.println(q);

        double n1 = 2.5;

        byte n2= (byte) n1;
    }


}
