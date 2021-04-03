package za.co.dvt.validators;

public class EmailValidator {
    public boolean validate(String email) {
        if (email != null)
            return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$") ? true : false;
        return false;
    }
}
