package L4.post;

public class Sender extends Client {
  public Sender(String firstName, String secondName, String lastName) {
    super(firstName, secondName, lastName);
  }

  @Override
  void getDeliveryNotification(Message message) {
    System.out.println("\n[Notification for Sender]");
    Recipient recipient = message.getRecipient();
    System.out.printf("Dear %s,\nRecipient %s received your message\n\n", this, recipient);
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
