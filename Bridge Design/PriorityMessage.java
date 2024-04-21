public class PriorityMessage extends Message {
    int priority;

    PriorityMessage(String body, String to, String from, String title, int priority, MessageSender sender) {
        super(body, to, from, title, sender);
        this.priority = priority;
        
        if(priority > 50) {
            body += "important message 50";
        } else if(priority > 60) {
            body += "important message 60";
        }
    }
}
