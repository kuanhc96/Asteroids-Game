package _03objects;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {
    public List<Message> mailbox;

    public Mailbox() {
        this(new ArrayList<Message>());
    }

    public Mailbox(List<Message> mailbox) {
        this.mailbox = mailbox;
    }

    public void addMessage(Message message) {
        mailbox.add(message);
    }

    public Message getMessage(int i) {
        return mailbox.get(i);
    }

    public void removeMessage(int i) {
        mailbox.remove(i);
    }
}
