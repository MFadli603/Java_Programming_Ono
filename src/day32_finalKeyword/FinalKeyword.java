package day32_finalKeyword;

import java.time.LocalDate;

class CydeoStudent{
    public final void methodA(){
        System.out.println("Java programming");
    }
}
public class FinalKeyword extends CydeoStudent{
    public static void main(String[] args) {

        final char gender = 'M';
        System.out.println(gender);
        //gender = 'F';
        System.out.println(gender);

        System.out.println("-----------------");

        final LocalDate DOB = LocalDate.now();
        System.out.println(DOB);

        new CydeoStudent().methodA();
    }
}
