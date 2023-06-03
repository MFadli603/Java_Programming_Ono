package day32_finalKeyword.Car;

import utilities.Test;

public class TestCarObject {

    public static void main(String[] args) {

       Toyota toyota = new Toyota("Camry", "white", 2020, 25999);
       Honda honda = new Honda("civic", "black", 2019, 20000);
       Audi audi = new Audi("Q7", "blue", 2000, 23000);
       BMW bmw = new BMW("x5", "black",2010, 10000 );
        Tesla tesla = new Tesla("X", "White", 2010, 51000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("--------------------");

        honda.start();
        toyota.start();
        bmw.start();
        audi.start();
        tesla.autoPilot();
    }
}
