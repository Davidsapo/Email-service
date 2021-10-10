package david.email_service.model;

import lombok.Data;

/**
 * @author dsapozhnik
 */
@Data
public class EmailDetails {

    private String email;

    private String subject;

    private String body;
}
