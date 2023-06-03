package day19_array;

public class MaxNumber {

    public static void main(String[] args) {
        
        int[] numbers = {100,200,10,-10, 0};
        
        int max= numbers[0]; // assuming first one is min

        for (int i = 1; i < numbers.length ; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
    }
}
