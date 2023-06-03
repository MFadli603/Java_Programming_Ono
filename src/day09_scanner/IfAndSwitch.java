package day09_scanner;

public class IfAndSwitch {

    public static void main(String[] args) {

         int number = 75;

if(number == 50 || number == 75 || number == 100){
    switch (50){
        case 50:
            System.out.println("20 crew, 30 passengers");
            break;
        case 75:
            System.out.println(" 25 crew, 50 passenger");
            break;
        default:
            System.out.println("30 crew, 75 passenger");

    }

}else {
    System.out.println("Invalid number");
}

    }
}
