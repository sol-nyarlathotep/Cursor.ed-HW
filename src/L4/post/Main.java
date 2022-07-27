package L4.post;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Sender sender1 = new Sender("Richard", "Tristan", "Gosling");
    Recipient recipient = new Recipient("John", "Leicus", "Reitherford");
    Post postService = new Post();
    Message message = new Message(TypeOfMessage.PARCEL, sender1);
    postService.acceptMessage(recipient, message);
  }
}
