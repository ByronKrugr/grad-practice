import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPassword {
    @Test
    public void TestPasswordLength(){
        PasswordValidator password = new PasswordValidator();
        assertEquals(true, password.isValid("Abc123"));
    }
}
