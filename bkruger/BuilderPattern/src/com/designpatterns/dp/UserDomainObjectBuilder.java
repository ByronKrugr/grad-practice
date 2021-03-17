package com.designpatterns.dp;

import java.awt.*;
import java.util.List;

public class UserDomainObjectBuilder {
    private String email;
    private String password;
//    private boolean isActivated;
//    private float reputation;
//    private int visitCount;
//    private long currentPlace;
//    private String phone;
//    private Point location;
//    private List<Long> visits;

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public UserDomainObjectBuilder(String email){
        if (email == null)
            throw new IllegalArgumentException("User must at least have an email");
        this.email = email;
    }

    public UserDomainObjectBuilder withPassword(String password){
        this.password = password;
        return this;
    }
}
