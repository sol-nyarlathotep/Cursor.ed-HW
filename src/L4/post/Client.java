package L4.post;

public abstract class Client {
  protected String firstName;
  protected String secondName;
  protected String lastName;

  protected Client(String firstName, String secondName, String lastName) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.lastName = lastName;
  }

  abstract void getDeliveryNotification(Message message);
  abstract void sendCustomNotification(String customText);
}
