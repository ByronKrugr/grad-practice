package za.co.dvt.emailValidator;

import org.junit.Before;
import org.junit.Test;
import za.co.dvt.validators.EmailValidator;

public class EmailValidatorUnitTest {
    private EmailValidator emailValidator;

    @Before
    public void setUp(){
        this.emailValidator = new EmailValidator();
    }

    @Test
    public void canCallValidate(){
        boolean isValid = this.emailValidator.validate("");
    }
}
