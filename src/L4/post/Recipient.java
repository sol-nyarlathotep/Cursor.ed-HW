package L4.post;

public class Recipient extends Client {

  public Recipient(String firstName, String secondName, String lastName) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.lastName = lastName;
  }

  @Override
  void getDeliveryNotification(Message message) {
    Sender sender = message.getSender();
    System.out.printf(
        "Dear %s,\nIncome message from %s delivered to your Post Department\n", this, sender);
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
