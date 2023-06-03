package day15_Loop;

public class ContinueStatement {

    public static void main(String[] args) {

        for(int i=1; i<6; i++) {

            if(i == 4){ // 4 is skipped and continue to 5
                continue;
            }
            System.out.println(i);
        }
        System.out.println("_____________________________________");

        for(int i=10; i<21; i++){

            if(i % 2 == 0){
                continue;// skips even numbers
            }
            System.out.println(i);
        }
        System.out.println("_____________________________________");

        for(char i='A'; i <= 'G'; i++){

            if(i == 'B' || i == 'E'){ // B, E will be skipped
                continue;
            }



            System.out.println(i);
        }
        System.out.println("_____________________________________");

        //find the sum of all the even number between 50~100
        //50, 52, 54, 56, 58
        for(int i=50; i< 101; i+=2){

            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=50; i < 101; i++){

            if (i % 2 !=0){
                continue;
            }

            System.out.print(i + " ");
        }


    }
}
