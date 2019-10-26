package _03objects;

public class P8_16 {
    public static void main(String[] args) {
        Message message = new Message("Kuan", "Melody");
        message.append("How have you been?");
        Mailbox mailbox = new Mailbox();
        mailbox.addMessage(message);
        System.out.println(mailbox.getMessage(0));
    }
}
