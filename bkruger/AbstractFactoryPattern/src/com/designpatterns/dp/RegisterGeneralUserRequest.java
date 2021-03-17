package com.designpatterns.dp;

import java.util.HashMap;

public class RegisterGeneralUserRequest implements Request{
    private HashMap<String, String> requestArgs;

    public RegisterGeneralUserRequest(HashMap<String, String> requestArgs){
        this.requestArgs = requestArgs;
    }

    public String description() {
        return "Register GeneralUser request: \n" +
                "email: " + this.requestArgs.get("email") + "\n" +
                "password: " + this.requestArgs.get("password") + "\n";
    }
}
