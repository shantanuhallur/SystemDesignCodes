import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        VoiceMailSender voiceMail = new VoiceMailSender();
        EncryptedMessage encrytpted = new EncryptedMessage("ecnrypt", "sad", "sda",
         "ss", "56", voiceMail);
        encrytpted.send();

        SMSSender smsSend = new SMSSender();
        PriorityMessage priority = new PriorityMessage("bosy", "to", "from",
         "tit;e", 56, smsSend);
        priority.send();

        VoiceMailSender vcMail = new VoiceMailSender();
        ArrayList<String> issues = new ArrayList<>();
        issues.add("issue 1"); issues.add("issue 2"); issues.add("issue 3");
        IssuesMessage issuesMessage = new IssuesMessage("Issues", "sarKar", "me",
         "ISSUES", issues,vcMail);
        issuesMessage.send();
    }
}