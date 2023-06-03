package day35_polymorphism;

import day29_inheritance1.animalTask.Animal;
import day29_inheritance1.animalTask.Tiger;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Animal tiger = new Tiger();
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();
    }
}
