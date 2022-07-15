package L2.printNumbersWithEvenIndexes;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int[] randomArrayNumbers = new int[10];
        for (int i = 0; i < randomArrayNumbers.length; i++) {
            randomArrayNumbers[i] = randomNumberGenerator.nextInt(10_000);
        }

        for (int i = 0; i < randomArrayNumbers.length; i++) {

            if (i % 2 == 0)
                System.out.printf("Index: %d, Value: %d;\n", i, randomArrayNumbers[i] );

        }

        System.out.printf("%s",Arrays.toString(randomArrayNumbers));

    }
}
