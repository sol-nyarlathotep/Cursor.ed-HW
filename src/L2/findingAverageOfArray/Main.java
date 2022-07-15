package L2.findingAverageOfArray;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();

        int[] randomArrayNumbers = new int[10];
        for (int i = 0; i < randomArrayNumbers.length; i++) {
            randomArrayNumbers[i] = randomNumberGenerator.nextInt(10);
        }

        double sumAccumulator = 0;
        for (int i :
                randomArrayNumbers) {
            sumAccumulator += i;
        }

        double averageOfArray = sumAccumulator / randomArrayNumbers.length;
        System.out.println(Arrays.toString(randomArrayNumbers));
        System.out.println("Average of array: " + averageOfArray);
    }


}
