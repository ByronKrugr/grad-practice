package za.co.dvt.emailValidator;

import org.junit.Test;
import za.co.dvt.validators.EmailValidator;

public class EmailValidatorUnitTest {

    @Test
    public void canCreateEmailValidator(){
        EmailValidator emailValidator = new EmailValidator();
    }

    @Test
    public void canCallValidate(){
        EmailValidator emailValidator = new EmailValidator();
        boolean isValid = emailValidator.validate("");
    }
}
