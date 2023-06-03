package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;
/* not the best practice
    { // setting default
        name ="James";
        age = 20;
    }
*/

    public InstanceInitializationBlock(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("Bella", 19);

        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }

}
