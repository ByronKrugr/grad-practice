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

    public boolean getValidateResult(String email){
        return this.emailValidator.validate(email);
    }

    @Test
    public void validateReturnsFalseWhenNullEmail(){
        assertEquals(getValidateResult(null), false);
    }

    @Test
    public void validateReturnsFalseWhenEmptyEmail(){
        assertEquals(getValidateResult(""), false);
    }

    @Test
    public void validateReturnsFalseWhenSingleChar(){
        assertEquals(getValidateResult("a"), false);
    }

    @Test
    public void validateReturnsFalseWhenMultiCharStringAndNoEmailSymbols(){
        assertEquals(getValidateResult("abcdefghijk12345"), false);
    }

    @Test
    public void validateReturnsFalseWhenJustAtSymbol(){
        assertEquals(getValidateResult("@"), false);
    }

    @Test
    public void validateReturnsFalseWhenJustPeriod(){
        assertEquals(getValidateResult("."), false);
    }

    @Test
    public void validateReturnsFalseWhenNothingBeforeAtSymbol(){
        assertEquals(getValidateResult("@abc123"), false);
    }

    @Test
    public void validateReturnsFalseWhenNothingAfterAtSymbol(){
        assertEquals(getValidateResult("abc123@"), false);
    }

    @Test
    public void validateReturnsFalseWhenNoPeriod(){
        assertEquals(getValidateResult("abc123@abc123"), false);
    }

    @Test
    public void validateReturnsFalseWhenNothingAfterFirstPeriod(){
        assertEquals(getValidateResult("abc123@abc123."), false);
    }

    @Test
    public void validateReturnsTrueWhenValidEmail(){
        assertEquals(getValidateResult("abc124@abc123.abc.abc"), true);
    }

}
