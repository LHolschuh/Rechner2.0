//package mail;
//
//import org.simplejavamail.api.email.Email;
//import org.simplejavamail.api.mailer.Mailer;
//import org.simplejavamail.email.EmailBuilder;
//import org.simplejavamail.mailer.MailerBuilder;
//
//public class MailSenden {
//
//    public String sendMail(String subject, String messageBody) {
//        try {
//            Email email = EmailBuilder.startingBlank()
//                    .from("sender@example.com")
//                    .to("recipient@example.com")
//                    .withSubject(subject)
//                    .withPlainText(messageBody)
//                    .buildEmail();
//
//            Mailer mailer = MailerBuilder
//                    .withSMTPServerHost("mailrelay.hausvorsorge.de")
//                    .buildMailer();
//
//            mailer.sendMail(email);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "Fehler beim Senden der E-Mail: " + e.getMessage();
//        }
//        return messageBody;
//    }
//
//}


