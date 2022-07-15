package L2.randomNumbersArray;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i<randomNumbers.length;i++){
            while ( true ){
                int randomNumber = randomGenerator.nextInt();
                if (randomNumber % 2 == 0){
                    randomNumbers[i] = randomNumber;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(randomNumbers));
    }
}