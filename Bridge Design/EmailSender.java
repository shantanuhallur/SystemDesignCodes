public class EmailSender implements MessageSender {
    @Override
    public void send(String from, String to, String title, String body) {
        System.out.println("------------------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Body: " + body);
        System.out.println("from: " + from);
        System.out.println("To: " + to);

        System.out.println("Send via Email: ");
    }
}
