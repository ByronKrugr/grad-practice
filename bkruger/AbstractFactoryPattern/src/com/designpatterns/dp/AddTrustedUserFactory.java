package com.designpatterns.dp;

import java.util.HashMap;

public class AddTrustedUserFactory implements UseCaseRequestGroupFactory{
    @Override
    public UseCase makeUseCase() {
        return new AddTrustedUserUseCase();
    }

    @Override
    public Request makeRequest(HashMap<String, String> requestArgs) {
        return new AddTrustedUserRequest(requestArgs);
    }
}
