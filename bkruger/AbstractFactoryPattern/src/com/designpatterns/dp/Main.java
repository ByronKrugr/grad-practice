package com.designpatterns.dp;

public class Main {

    public static void main(String[] args){
        RegisterGeneralUserController registerGeneralUserController = new RegisterGeneralUserController();
        registerGeneralUserController.registerGeneralUser();

        AddTrustedUserController addTrustedUserController = new AddTrustedUserController();
        addTrustedUserController.addTrustedUser();
    }
}
