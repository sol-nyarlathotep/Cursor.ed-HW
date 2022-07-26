package L4.post;

public class Recipient extends Client {
  public Recipient(String firstName, String secondName, String lastName) {
    super(firstName, secondName, lastName);
  }

  @Override
  void getDeliveryNotification(Message message) {
    System.out.println("\n[Notification for Recipient]");
    Sender sender = message.getSender();
    System.out.printf(
        "Dear %s,\nIncome message from %s delivered to your Post Department\n\n", this, sender);
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
