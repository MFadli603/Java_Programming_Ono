package day34_abstraction2.carTask;

public class TestCarObject {

    public static void main(String[] args) {

       // Car car1= new Car("X6", "red", 2020, 45000);

        Honda honda = new Honda("civic", "black", 2020, 30000);
        Audi audi = new Audi("Q7", "White", 2021,33000 );
        Tesla tesla1 = new Tesla("Y", "red", 2023, 45000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla1);

        System.out.println("--------------");

        honda.start();
        audi.start();
        tesla1.start();
    }
}
