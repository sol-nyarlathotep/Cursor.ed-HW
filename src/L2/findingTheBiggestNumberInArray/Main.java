package L2.findingTheBiggestNumberInArray;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();

        int[] randomNumbersArray = new int[10];

        for (int i = 0; i < randomNumbersArray.length; i++) {           // Initialize the array with random numbers
            randomNumbersArray[i] = randomNumberGenerator.nextInt(10_000);
        }

        int maximalNumberInArray = 0;
        for (int i : randomNumbersArray) {                              // Traversing the array and finding max number
            if (i > maximalNumberInArray)
                maximalNumberInArray = i;
        }

        System.out.println(Arrays.toString(randomNumbersArray));
        System.out.println("Max number in array: " + maximalNumberInArray);
        
    }

}
