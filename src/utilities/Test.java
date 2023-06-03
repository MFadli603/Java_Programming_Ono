package utilities;

import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data; // imports everything from Data class
public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data(); // has to create object in order to call instance variables and method
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("----------------------");

        System.out.println(AccessModifiers.publicData);
        // System.out.println(AccessModifiers.protectedData); not accessible in different package

      //  System.out.println(AccessModifiers.defaultData);
    }
}
