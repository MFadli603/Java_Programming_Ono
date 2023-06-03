package day19_array;

public class MinNumber {

    public static void main(String[] args) {

        int[] numbers = {100,200,10,-10, 0};

        int min= numbers[0]; // assuming first one is min

        for (int i = 1; i < numbers.length ; i++) {
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);
    }
}

