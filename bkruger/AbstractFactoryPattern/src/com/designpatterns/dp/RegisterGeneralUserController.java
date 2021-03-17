package com.designpatterns.dp;

import java.util.HashMap;

public class RegisterGeneralUserController {
    private UseCaseRequestGroupFactoryMaker useCaseRequestGroupFactoryFactory;

    public RegisterGeneralUserController(){
        this.useCaseRequestGroupFactoryFactory = new UseCaseRequestGroupFactoryMaker();
    }

    public void registerGeneralUser(){
        UseCaseRequestGroupFactory useCaseRequestGroupFactory = this.useCaseRequestGroupFactoryFactory.makeFactory(UseCaseRequestGroup.REGISTER_GENERAL_USER_GROUP);
        UseCase useCase = useCaseRequestGroupFactory.makeUseCase();
        Request request = useCaseRequestGroupFactory.makeRequest(new HashMap<String, String>() {{ put("email", "myEmail"); put("password", "myPassword"); }});
        System.out.println(useCase.description());
        System.out.println(request.description());
    }
}
