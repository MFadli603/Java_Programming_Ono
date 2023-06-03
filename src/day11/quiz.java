package day11;

public class quiz {

    public static void main(String[] args) {

        boolean x = false;
        boolean y = !x == false;
        boolean z = y;

        if (x) {
            System.out.println("helloe everyone");
        }
        if (y) {
            System.out.println("Today is great");
        }
        if (z) {
            System.out.println("We are");
        }
        System.out.println(y);
    }
}
