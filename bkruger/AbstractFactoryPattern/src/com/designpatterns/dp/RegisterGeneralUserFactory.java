package com.designpatterns.dp;

import java.util.HashMap;

public class RegisterGeneralUserFactory implements UseCaseRequestGroupFactory {
    @Override
    public UseCase makeUseCase() {
        return new RegisterGeneralUserUseCase();
    }

    @Override
    public Request makeRequest(HashMap<String, String> requestArgs) {
        return new RegisterGeneralUserRequest(requestArgs);
    }
}
