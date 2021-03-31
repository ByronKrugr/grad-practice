package za.co.dvt.emailValidator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.co.dvt.validators.EmailValidator;

import static org.junit.Assert.assertEquals;

public class EmailValidatorUnitTest {
    private EmailValidator emailValidator;

    @BeforeEach
    public void setUp(){
        this.emailValidator = new EmailValidator();
    }

    @Test
    public void canCallValidate(){
        boolean isValid = this.emailValidator.validate("");
    }

    @Test
    public void validateReturnsFalseWhenNullEmail(){
        boolean isValid = this.emailValidator.validate(null);
        assertEquals(isValid, false);
    }
}
