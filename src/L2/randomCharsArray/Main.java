package L2.randomCharsArray;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int lowBound = 32;                      // Start code of human-readable char in ASCII table
        int highBound = 127;                    // End code of human-readable char in ASCII table


        char[] charsRandomArray = new char[10]; // Create an array with 10 elements


        for (int i = 0; i < charsRandomArray.length; i++)
        {
            int randomNumber;
            // Generate a number within the given bounds
            randomNumber = randomNumberGenerator.nextInt(highBound - lowBound) + lowBound;
            charsRandomArray[i] = (char) randomNumber;
        }

        System.out.println(Arrays.toString(charsRandomArray));

    }
}
