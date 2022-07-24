package L4.post;

public class Message implements Sendable {
  private final TypeOfMessage typeOfMessage;
  private Sender sender;
  private Double messageWeight;
  private Post postService;
  private Recipient recipient;

  private DeliveryService deliveryService;

  Message(TypeOfMessage typeOfMessage, Sender sender) {
    this.typeOfMessage = typeOfMessage;
    this.sender = sender;
  }

  public DeliveryService getDeliveryService() {
    return deliveryService;
  }

  public void setDeliveryService(DeliveryService deliveryService) {
    this.deliveryService = deliveryService;
  }

  public Double getMessageWeight() {
    return messageWeight;
  }

  public void setMessageWeight(Double messageWeight) {
    this.messageWeight = messageWeight;
  }

  public TypeOfMessage getTypeOfMessage() {
    return typeOfMessage;
  }

  public Sender getSender() {
    return sender;
  }

  public void setSender(Sender sender) {
    this.sender = sender;
  }

  public Post getPostService() {
    return postService;
  }

  public void setPostService(Post postService) {
    this.postService = postService;
  }

  public Recipient getRecipient() {
    return recipient;
  }

  public void setRecipient(Recipient recipient) {
    this.recipient = recipient;
  }
}
