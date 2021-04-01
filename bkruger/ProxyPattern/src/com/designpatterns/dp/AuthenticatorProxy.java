package com.designpatterns.dp;

public class AuthenticatorProxy implements IAuthenticator {
  private Authenticator authenticator;
  private static final int FAILED_LOGIN_LIMIT = 5;
  private int failedLoginAmount;

  public AuthenticatorProxy(Authenticator authenticator) {
    this.authenticator = authenticator;
  }

  @Override
  public boolean authenticate(String email, String password) {
    if (this.failedLoginAmount >= FAILED_LOGIN_LIMIT) {
      System.out.println("Exceeded failed log in limit.");
      return false;
    }

    if (!authenticator.authenticate(email, password)) {
      this.failedLoginAmount = this.failedLoginAmount + 1;
    }

    return true;
  }
}
