package day13_customMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {
        System.out.println(isOdd(6));
        }


    public static boolean isOdd(int num){

        return (num %2 !=0)? true: false;

        // if (num%2!=0){
        // return true;
        // } else { return false;
        // }
    }
    public static boolean isEven(int num){
       return !isOdd(num) ;
    }
}
/* isOdd, isEven, max, min method uusgeh*/