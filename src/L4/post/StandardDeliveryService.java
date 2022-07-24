package L4.post;

public class StandardDeliveryService extends DeliveryService {

  static double deliveryPriceMultiplier = 1.0;
  static double maxMessageWeight = 35.0;
  int maxDeliveryDays = 35;

  public StandardDeliveryService(){
    super.maxDeliveryDays = this.maxDeliveryDays;
  }

  @Override
  public String toString() {
    return "Standard Delivery Service";
  }
}
