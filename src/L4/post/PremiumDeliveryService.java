package L4.post;

public class PremiumDeliveryService extends DeliveryService{
    static double deliveryPriceMultiplier = 1.5;
    static double maxMessageWeight = 100.0;
    int maxDeliveryDays = 16;

    public PremiumDeliveryService(){
        super.maxDeliveryDays = this.maxDeliveryDays;
    }

    @Override
    public String toString() {
        return "Premium Delivery Service";
    }
}
