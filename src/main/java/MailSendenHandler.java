//
//import io.javalin.http.Context;
//import io.javalin.http.Handler;
//import org.jetbrains.annotations.NotNull;
//import org.slf4j.LoggerFactory;
//
//public class MailSendenHandler implements Handler {
//
//
//    private final boolean sendMails;
//
//
//    public MailSendenHandler(boolean sendMails) {
//        this.sendMails = sendMails;
//    }
//
//    @Override
//    public void handle(@NotNull Context context) {
//
//        var veranstaltungErstellen = context.bodyAsClass(EineVeranstaltungErstellen_Bearbeiten.class);
//
//        int neueVeranstaltungId = veranstaltungSpeicher.erstellenNeueVeranstaltung(veranstaltungErstellen);
//
//        context.result(String.valueOf(neueVeranstaltungId));
//
//        if (sendMails) {
//            try{
//                MailVeranstaltungErstellen mailVeranstaltungErstellen = new MailVeranstaltungErstellen();
//                mailVeranstaltungErstellen.mailText(veranstaltungErstellen, neueVeranstaltungId);
//                mailVeranstaltungErstellen.mailVersenden(veranstaltungErstellen, neueVeranstaltungId);}
//            catch (Exception e) {
//                System.out.println("Fehler beim Versand der Mail: " + e.getMessage());
//                // Optional: Hier könntest du weitere Maßnahmen ergreifen
//            }
//        }
//    }
//}
