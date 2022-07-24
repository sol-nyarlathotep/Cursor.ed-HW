package L4.post;

public class PlatinumDeliveryService extends DeliveryService {
  static double deliveryPriceMultiplier = 2.5;
  static double maxMessageWeight = 1000.0;
  int maxDeliveryDays = 10;

  public PlatinumDeliveryService() {
    super.maxDeliveryDays = this.maxDeliveryDays;
  }

  @Override
  public String toString() {
    return "Platinum Delivery Service";
  }

}
