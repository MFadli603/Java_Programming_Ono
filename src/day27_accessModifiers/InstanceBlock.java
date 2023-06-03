package day27_accessModifiers;

public class InstanceBlock {//Instance block gets executed before constructor

    {
        System.out.println("Instance block");
    }

    public InstanceBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();
    }
}
