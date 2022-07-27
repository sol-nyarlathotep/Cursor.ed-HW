package L4.post;

public class StandardDeliveryService implements DeliveryService {
  private double deliveryPriceMultiplier = 1.0;
  private double maxMessageWeight = 35.0;
  private int maxDeliveryDays = 35;

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
    return "Standard Delivery Service";
  }
}
