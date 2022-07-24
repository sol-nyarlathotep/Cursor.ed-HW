package L4.post;

public interface Sendable {
    Sender getSender();
    void setSender(Sender sender);
    Recipient getRecipient();
    void setRecipient(Recipient recipient);
}
