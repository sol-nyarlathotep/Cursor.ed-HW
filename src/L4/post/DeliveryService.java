package L4.post;

import java.util.Random;

public interface DeliveryService {


  int getMaxDeliveryDays();
  double getMaxMessageWeight();
  double getDeliveryPriceMultiplier();

  default void deliver(Message message, int maxDeliveryDays) throws InterruptedException {
    Random randomNumberGenerator = new Random();
    int deliveryTime = randomNumberGenerator.nextInt(maxDeliveryDays);
    System.out.printf("Estimated delivery time: %d days\n", deliveryTime);
    Thread.sleep(deliveryTime * 100L);
    System.out.printf("[%d days later]\n", deliveryTime);
    message.getPostService().onReceive(message);
  }
}
