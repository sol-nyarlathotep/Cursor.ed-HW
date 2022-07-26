package L4.post;

public class PremiumDeliveryService implements DeliveryService{
    private double deliveryPriceMultiplier = 1.5;
    private double maxMessageWeight = 100.0;
    private int maxDeliveryDays = 16;

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
        return "Premium Delivery Service";
    }
}
