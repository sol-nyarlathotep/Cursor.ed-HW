package L4.post;

import java.util.Random;
import L4.post.utils.Utils;

public class Post {

  private double basePrice = 75.0;
  DeliveryService standardDeliveryService = new StandardDeliveryService();
  DeliveryService premiumDeliveryService = new PremiumDeliveryService();
  DeliveryService platinumDeliveryService = new PlatinumDeliveryService();

  public void acceptMessage(Recipient recipient, Message message) throws InterruptedException {
    message.setRecipient(recipient);
    message.setPostService(this);
    this.weighMessage(message);
    this.chooseDeliveryService(message);
    this.sendTo(message);
  }

  private void chooseDeliveryService(Message message) {
    System.out.println("You need to choose which delivery service you want to use");
    System.out.printf(
        "Prices: Standard - %.2f, Premium - %.2f, Platinum - %.2f\n",
        basePrice * standardDeliveryService.getDeliveryPriceMultiplier(),
        basePrice * premiumDeliveryService.getDeliveryPriceMultiplier(),
        basePrice * platinumDeliveryService.getDeliveryPriceMultiplier());
    String baseNotice = "The following services are available to you: ";
    double messageWeight = message.getMessageWeight();
    if (messageWeight <= standardDeliveryService.getMaxMessageWeight()) {
      System.out.println(baseNotice + "Standard, Premium, Platinum");
      DeliveryService deliveryService =
          Utils.getDeliveryServiceFromUserInput(new String[] {"Standard", "Premium", "Platinum"});
      message.setDeliveryService(deliveryService);
    } else if (messageWeight <= premiumDeliveryService.getMaxMessageWeight()) {
      System.out.println(baseNotice + "Premium, Platinum");
      DeliveryService deliveryService =
          Utils.getDeliveryServiceFromUserInput(new String[] {"Premium", "Platinum"});
      message.setDeliveryService(deliveryService);
    } else if (messageWeight <= platinumDeliveryService.getMaxMessageWeight()) {
      System.out.println(baseNotice + "Platinum");
      DeliveryService deliveryService =
          Utils.getDeliveryServiceFromUserInput(new String[] {"Platinum"});
      message.setDeliveryService(deliveryService);
    } else {
      System.out.println("You cannot use our services");
    }
  }

  private void sendTo(Message message) throws InterruptedException {
    message
        .getSender()
        .sendCustomNotification(
            "We accepted your message and transfer to Delivery Service. Wait for delivered notification.");
    DeliveryService deliveryService = message.getDeliveryService();
    int maxDeliveryDays = deliveryService.getMaxDeliveryDays();
    deliveryService.deliver(message, maxDeliveryDays);
  }

  private void weighMessage(Message message) {
    Random randomNumberGenerator = new Random();
    double lowBound = 0.1;
    double highBound = 1000.0;
    TypeOfMessage messageType = message.getTypeOfMessage();
    switch (messageType) {
      case LETTER:
        highBound = 0.5;
        break;
      case PARCEL:
        highBound = 50;
        break;
      default:
        break;
    }
    double messageWeight = lowBound + (highBound - lowBound) * randomNumberGenerator.nextDouble();
    message.setMessageWeight(messageWeight);
    System.out.printf("Weight of your message: %.2f kg\n", messageWeight);
  }

  public void onReceive(Message message) {
    message.getSender().getDeliveryNotification(message);
    message.getRecipient().getDeliveryNotification(message);
  }
}
