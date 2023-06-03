package day17_customClass;

public class TestDojObjects {

    public static void main(String[] args) {

     Dog dog1 =  new Dog(); // dog1 is reference name
        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Gray";

        Dog dog2 = new Dog();
        dog2.setInfo("Bella", "Golden retriever", 'M', 8, "Small", "white");


        System.out.println(dog1);
        System.out.println(dog2);



    }
}
