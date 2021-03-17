package com.designpatterns.dp;

public class Main {

    public static void main(String[] args){
        Authenticator authenticator = new Authenticator();
        AuthenticatorProxy authenticatorProxy = new AuthenticatorProxy(authenticator);
        authenticatorProxy.authenticate("email", "password1");
        authenticatorProxy.authenticate("email", "password2");
        authenticatorProxy.authenticate("email", "password3");
        authenticatorProxy.authenticate("email", "password4");
        authenticatorProxy.authenticate("email", "password5");
        authenticatorProxy.authenticate("email", "password6");
    }
}
