package com.designpatterns.dp;

import java.util.HashMap;

public class AddTrustedUserController {
    private UseCaseRequestGroupFactoryMaker useCaseRequestGroupFactoryFactory;

    public void addTrustedUser(){
        this.useCaseRequestGroupFactoryFactory = new UseCaseRequestGroupFactoryMaker();
        UseCaseRequestGroupFactory useCaseRequestGroupFactory = this.useCaseRequestGroupFactoryFactory.makeFactory(UseCaseRequestGroup.ADD_TRUSTED_USER_GROUP);
        UseCase useCase = useCaseRequestGroupFactory.makeUseCase();
        Request request = useCaseRequestGroupFactory.makeRequest(new HashMap<String, String>() {{ put("email", "myEmail"); put("isTrusted", "true"); }});
        System.out.println(useCase.description());
        System.out.println(request.description());
    }
}
