package L4.post;

public class PlatinumDeliveryService implements DeliveryService {
  private double deliveryPriceMultiplier = 2.5;
  private double maxMessageWeight = 1000.0;
  private int maxDeliveryDays = 10;

  public double getDeliveryPriceMultiplier() {
    return deliveryPriceMultiplier;
  }

  public double getMaxMessageWeight() {
    return maxMessageWeight;
  }

  public int getMaxDeliveryDays() {
    return maxDeliveryDays;
  }

  @Override
  public String toString() {
    return "Platinum Delivery Service";
  }
}
