package utilities;

import static day27_accessModifiers.Data.d; // imports static variable d;
import static day27_accessModifiers.Data.method3; // imports method3 only
import static day27_accessModifiers.Data.*; // imports all the static variables and methods
public class Test2 {

    public static void main(String[] args) {

        System.out.println(d);
        method3();

        System.out.println(e);
        System.out.println(f);

        method4();

    }

}
