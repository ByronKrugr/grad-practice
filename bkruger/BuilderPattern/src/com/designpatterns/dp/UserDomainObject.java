package com.designpatterns.dp;

import java.awt.*;
import java.util.List;

public class UserDomainObject {
  private String email;
  private String password;
  private boolean isActivated;
  private float reputation;
  private int visitCount;
  private long currentPlace;
  private String phone;
  private Point location;
  private List<Long> visits;

  public UserDomainObject(UserDomainObjectBuilder builder) {
    this.email = builder.getEmail();
    this.password = builder.getPassword();
//        this.isActivated = builder.isActivated;
//        this.reputation = builder.reputation;
//        this.visitCount = builder.visitCount;
//        this.currentPlace = builder.currentPlace;
//        this.phone = builder.phone;
//        this.location = builder.location;
//        this.visits = builder.visits;
  }
}
