//public class ServerMain {
//
//    public static void main(String[] args) {
//
//
//        //        TestMod.logSome();
//        Jdbi jdbi = Jdbi.create("jdbc:h2:file:./grillfestplaner.db");
//        var mailSendenHandler = new MailSendenHandler(sendMails);
//
//        Javalin.create((config) -> {
//                    config.staticFiles.add(staticFiles -> {
//                        staticFiles.hostedPath = "/";
//                        staticFiles.directory = "public";
//                        staticFiles.location = Location.CLASSPATH;
//                    });
//                })
//
//                .post("/mail/", mailSendenHandler).start(8081);
//        //  logger.info("Server gestartet");
//
//
//    }
//}