package david.email_service.request;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author dsapozhnik
 */
@Data
public class SendEmailRequest {

    @Email
    @NotBlank
    private String email;

    @Length(max = 20)
    private String subject;

    @NotBlank
    @Length(max = 500)
    private String body;
}
