package com.designpatterns.dp;

public class UseCaseRequestGroupFactoryMaker {

    public static UseCaseRequestGroupFactory makeFactory(UseCaseRequestGroup useCaseRequestGroup){
        if (useCaseRequestGroup == UseCaseRequestGroup.REGISTER_GENERAL_USER_GROUP){
            return new RegisterGeneralUserFactory();
        } else if (useCaseRequestGroup == UseCaseRequestGroup.ADD_TRUSTED_USER_GROUP){
            return new AddTrustedUserFactory();
        } else {
            throw new IllegalArgumentException("Unknown UseCaseRequestGroup.");
        }
    }
}
