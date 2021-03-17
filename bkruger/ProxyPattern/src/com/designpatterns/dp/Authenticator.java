package com.designpatterns.dp;

public class Authenticator implements IAuthenticator{
    private static final String CORRECT_EMAIL="email";
    private static final String CORRECT_PASSWORD="password";

    public boolean authenticate(String email, String password){
        return ((email.equals(CORRECT_EMAIL)) && (password.equals(CORRECT_PASSWORD))) ? true : false;
    }
}
