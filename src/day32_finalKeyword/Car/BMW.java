package day32_finalKeyword.Car;

public class BMW extends Car{
    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Call the mechanic or jump start " + getMake() + " " + getModel());
    }
}
