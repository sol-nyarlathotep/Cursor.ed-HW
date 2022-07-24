package L4.post;

public abstract class Client {

  protected String firstName;
  protected String secondName;
  protected String lastName;

  abstract void getDeliveryNotification(Message message);
  abstract void sendCustomNotification(String customText);
}
