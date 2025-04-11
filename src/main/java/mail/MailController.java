//package mail;
//
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class MailController {
//
//    private final MailService mailService = new MailService();
//
//    @PostMapping("/sendMail")
//    public String sendMail(@RequestBody MailRequest request) {
//        return mailService.sendMail(request.getSubject(), request.getMessage());
//    }
//}
