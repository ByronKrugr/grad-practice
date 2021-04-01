package com.designpatterns.dp;

public class HayesModem implements Modem {

  @Override
  public String dial() {
    return "Hayes modem dial\n";
  }

  @Override
  public String hangUp() {
    return "Hayes modem hangUp\n";
  }

  @Override
  public String send() {
    return "Hayes modem send\n";
  }

  @Override
  public String receive() {
    return "Hayes modem receive\n";
  }
}
