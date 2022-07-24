package L4.post;

import java.util.Random;
import L4.post.utils.Utils;

public class Post {

  double basePrice = 75.0;

  public void acceptMessage(Recipient recipient, Message message) throws InterruptedException {
    message.setRecipient(recipient);
    message.setPostService(this);
    this.weighMessage(message);
    this.chooseDeliveryService(message);
    this.sendTo(message);
  }

  protected void chooseDeliveryService(Message message) {
    System.out.println("You need to choose which delivery service you want to use");
    System.out.printf(
        "Prices: Standard - %.2f, Premium - %.2f, Platinum - %.2f\n",
        basePrice * StandardDeliveryService.deliveryPriceMultiplier,
        basePrice * PremiumDeliveryService.deliveryPriceMultiplier,
        basePrice * PlatinumDeliveryService.deliveryPriceMultiplier);
    String baseNotice = "The following services are available to you: ";
    double messageWeight = message.getMessageWeight();
    if (messageWeight <= StandardDeliveryService.maxMessageWeight) {
      System.out.println(baseNotice + "Standard, Premium, Platinum");
      DeliveryService deliveryService =
          Utils.getDeliveryServiceFromUserInput(new String[] {"Standard", "Premium", "Platinum"});
      message.setDeliveryService(deliveryService);
    } else if (messageWeight <= PremiumDeliveryService.maxMessageWeight) {
      System.out.println(baseNotice + "Premium, Platinum");
      DeliveryService deliveryService =
          Utils.getDeliveryServiceFromUserInput(new String[] {"Premium", "Platinum"});
      message.setDeliveryService(deliveryService);
    } else if (messageWeight <= PlatinumDeliveryService.maxMessageWeight) {
      System.out.println(baseNotice + "Platinum");
      DeliveryService deliveryService =
          Utils.getDeliveryServiceFromUserInput(new String[] {"Platinum"});
      message.setDeliveryService(deliveryService);
    } else {
      System.out.println("You cannot use our services");
    }
  }

  protected void sendTo(Message message) throws InterruptedException {
    message
        .getSender()
        .sendCustomNotification(
            "We accepted your message and transfer to Delivery Service. Wait for delivered notification.");
    message.getDeliveryService().transferTo(message);
  }

  protected void weighMessage(Message message) {
    // TODO: Define weight, based on message type
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

  protected void onReceive(Message message) {
    message.getSender().getDeliveryNotification(message);
    message.getRecipient().getDeliveryNotification(message);
  }
}
