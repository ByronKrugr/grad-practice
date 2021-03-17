package com.designpatterns.dp;

import java.util.HashMap;

public interface UseCaseRequestGroupFactory {
    UseCase makeUseCase();
    Request makeRequest(HashMap<String, String> requestArgs);
}
