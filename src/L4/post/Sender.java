package L4.post;

import java.util.Date;

public class Sender extends Client {
  public Sender(String firstName, String secondName, String lastName) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.lastName = lastName;
  }

  @Override
  void getDeliveryNotification(Message message) {
    Recipient recipient = message.getRecipient();
    System.out.printf("Dear %s,\nRecipient %s received your message\n", this, recipient);
  }

  @Override
  void sendCustomNotification(String customText) {
    System.out.printf("Dear %s,\n%s\n", this, customText);
  }

  @Override
  public String toString() {
    return String.format("%s %s %s", firstName, secondName, lastName);
  }
}
