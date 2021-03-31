package za.co.dvt.emailValidator;

import org.junit.jupiter.api.Test;
import za.co.dvt.validators.EmailValidator;

public class EmailValidatorUnitTest {

    @Test
    public void canCreateEmailValidator(){
        EmailValidator emailValidator = new EmailValidator();
    }
}
