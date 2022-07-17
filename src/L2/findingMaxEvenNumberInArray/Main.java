package L2.findingMaxEvenNumberInArray;

import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random randomNumberGenerator = new Random();
    int[] randomArrayNumbers = new int[10];
    for (int i = 0; i < randomArrayNumbers.length; i++) {
      randomArrayNumbers[i] = randomNumberGenerator.nextInt(10_000);
    }
    /*
     * Below is commented some test cases. Uncomment the specific line for use it.
     * 1. Only negative numbers with some evens
     * 2. Only negative numbers without evens
     * 3. Only positive numbers with some evens
     * 4. Only positive numbers without evens
     * */
    // int[] randomArrayNumbers = {-2,-3,-5,-17,-275,-99,-100};
    // int[] randomArrayNumbers = {-3, -7, -457, -901, -23, -43};
    // int[] randomArrayNumbers = {2,3,6,7,88,23,256,345, 234,231, 967, 12};
    // int[] randomArrayNumbers = {3,5,7,9,11,279,311,1473};
    boolean isEvenPresentInArray = false;
    int maxEvenNumberInArray = Integer.MIN_VALUE;
    for (int i : randomArrayNumbers) {
      if (i % 2 == 0 && i > maxEvenNumberInArray) {
        maxEvenNumberInArray = i;
        isEvenPresentInArray = true;
      }
    }
    if (!isEvenPresentInArray) {
      System.out.println("There is no even number in the array.");
      System.exit(0);
    }
    System.out.println(Arrays.toString(randomArrayNumbers));
    System.out.println("Max even number in the array: " + maxEvenNumberInArray);
  }
}
