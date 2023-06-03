package day26_statics;

public class TestCarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        System.out.println(car1);

        Car car2 = new Car("audi","q3");
        System.out.println(car2);

        Car car3 = new Car("Toyota", "camry", 2020);
        System.out.println(car3);

        Car car4 = new Car("Lexus", "RX350", 2022, 45000);
        System.out.println(car4);

        Car car5 = new Car("Honda", "civic", "white", 2013, 8000);
        System.out.println(car5);
    }
}
