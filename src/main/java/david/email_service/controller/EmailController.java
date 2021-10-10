package david.email_service.controller;

import david.email_service.facade.EmailSenderFacade;
import david.email_service.request.SendEmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;

/**
 * Email Controller
 *
 * @author dsapozhnik
 */

@Controller
@RequestMapping("/email-service")
public class EmailController {

    @Autowired
    private EmailSenderFacade emailSenderFacade;

    @GetMapping("/form")
    public String emailForm(Model model) {
        model.addAttribute("form", new SendEmailRequest());
        return "send-email-form";
    }

    @PostMapping("/form")
    public RedirectView sendEmail(@ModelAttribute @Valid SendEmailRequest request) {
        emailSenderFacade.sendEmail(request);
        return new RedirectView("/email-service/form");
    }

    @RequestMapping("/error")
    public String handleError() {
        return "error";
    }

}
