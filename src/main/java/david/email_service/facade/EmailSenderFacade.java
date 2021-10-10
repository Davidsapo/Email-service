package david.email_service.facade;

import david.email_service.model.EmailDetails;
import david.email_service.request.SendEmailRequest;
import david.email_service.service.EmailSenderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Email Sender Facade.
 *
 * @author dsapozhnik
 */
@Component
public class EmailSenderFacade {

    @Autowired
    private EmailSenderService emailSenderService;

    @Autowired
    private ModelMapper modelMapper;

    public void sendEmail(SendEmailRequest request) {
        EmailDetails emailDetails = modelMapper.map(request, EmailDetails.class);
        emailSenderService.sendEmail(emailDetails);
    }
}
