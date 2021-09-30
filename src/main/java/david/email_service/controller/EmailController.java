package david.email_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dsapozhnik
 */

@Controller
@RequestMapping("/email-service")
public class EmailController {

    @GetMapping("/form")
    public String emailForm(Model model) {
        return "send-email-form";
    }

}
