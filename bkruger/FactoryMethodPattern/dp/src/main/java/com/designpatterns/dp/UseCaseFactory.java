package com.designpatterns.dp;

import java.util.HashMap;

public interface UseCaseFactory {
    UseCase makeUseCase(String useCase, HashMap<String, String> request);
}
