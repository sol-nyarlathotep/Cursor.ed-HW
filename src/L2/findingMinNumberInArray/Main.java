package L2.findingMinNumberInArray;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random randomNumbersGenerator = new Random();

        int[] randomNumbersArray = new int[10];

        for (int i = 0; i < randomNumbersArray.length; i++) {                       // Init array
            randomNumbersArray[i] = randomNumbersGenerator.nextInt(10_000);
        }

        int minNumberInArray = randomNumbersArray[0];
        for (int i : randomNumbersArray) {                                          // Finding min in array
            if (i < minNumberInArray)
                minNumberInArray = i;
        }


        System.out.println(Arrays.toString(randomNumbersArray));
        System.out.println(minNumberInArray);

    }
}
