package L4.post;

import java.util.Random;

public abstract class DeliveryService {

  protected int maxDeliveryDays;

  public void deliver(Message message) throws InterruptedException {
    Random randomNumberGenerator = new Random();
    int deliveryTime = randomNumberGenerator.nextInt(this.maxDeliveryDays);
    System.out.printf("Estimated delivery time: %d days\n", deliveryTime);
    Thread.sleep(deliveryTime * 100L);
    System.out.printf("[%d days later]\n", deliveryTime);
    message.getPostService().onReceive(message);
  }
}
