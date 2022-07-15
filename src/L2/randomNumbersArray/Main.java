package L2.randomNumbersArray;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomGenerator = new Random();                  // Initialize random number generator class
        int[] randomNumbers = new int[10];                      // Create an array with 10 elements
        for (int i = 0; i<randomNumbers.length;i++){            // Traversing an array
            while ( true ){                                     // Generate number until it even
                int randomNumber = randomGenerator.nextInt();
                if (randomNumber % 2 == 0){
                    randomNumbers[i] = randomNumber;            // Write even number to array
                    break;                                      // Exit from "while"
                }
            }
        }
        System.out.println(Arrays.toString(randomNumbers));
    }
}