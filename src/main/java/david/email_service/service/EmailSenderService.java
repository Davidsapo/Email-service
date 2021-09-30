package david.email_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author dsapozhnik
 */

@Service
public class EmailSenderService {

    private static final String FROM = "From spring boot application :)";

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(prepareBody(body));
        mailSender.send(message);
    }

    private String prepareBody(String body) {
        return String.format("%s\n\n%s", body, FROM);

    }
}
