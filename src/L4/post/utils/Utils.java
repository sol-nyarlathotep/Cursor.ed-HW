package L4.post.utils;

import L4.post.DeliveryService;
import L4.post.PlatinumDeliveryService;
import L4.post.PremiumDeliveryService;
import L4.post.StandardDeliveryService;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Utils {

  public static DeliveryService getDeliveryServiceFromUserInput(String[] availableServices) {

    List<String> availableServicesList =
        Arrays.stream(availableServices).map(String::toLowerCase).collect(Collectors.toList());

    while (true) {
      System.out.print("Enter whichever you want: ");
      Scanner scanner = new Scanner(System.in);
      String answer = scanner.nextLine().toLowerCase();
      if (answer.equals("standard") && availableServicesList.contains("standard")) {

        return new StandardDeliveryService();
      }
      if (answer.equals("premium") && availableServicesList.contains("premium")) {
        return new PremiumDeliveryService();
      }
      if (answer.equals("platinum") && availableServicesList.contains("platinum")) {
        return new PlatinumDeliveryService();
      }
    }
  }
}
