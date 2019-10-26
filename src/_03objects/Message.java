package _03objects;

public class Message {
    private String sender;
    private String receiver;
    private String message;

    public Message(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = "";
    }

    public void append(String text) {
        message += text + "\n";
    }

    public String toString() {
        return "From: " + sender + "\n" + "To: " + receiver + "\n" + message;
    }
}
