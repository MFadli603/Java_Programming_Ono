package day15_Loop;

public class BreakStatement {

    public static void main(String[] args) {

        for(int i=0; i<10; i++){

            if(i==6){// 6 garahgui yaagaad gewel print statement-in umnu bichsen
                break; // has to be in the loop body
            }

            System.out.println(i);
        }

        System.out.println("__________________________");

        for(char i='A'; i<= 'Z'; i++){

            System.out.println(i);
            if(i=='J'){ // after the print statement --> J printed
                break; // after branching statement you cannot print anything, it gives an error
            }
        }
        System.out.println("__________________________");



    }
}
