package david.email_service.service;

import david.email_service.model.EmailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Email Sender Service.
 *
 * @author dsapozhnik
 */

@Service
public class EmailSenderService {

    private static final String FROM = "From Spring Boot application :)";

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(EmailDetails emailDetails) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailDetails.getEmail());
        message.setSubject(emailDetails.getSubject());
        message.setText(prepareBody(emailDetails.getBody()));
        mailSender.send(message);
    }

    private String prepareBody(String body) {
        return String.format("%s\n\n%s", body, FROM);
    }
}
