package com.designpatterns.dp;

import java.util.HashMap;

public class UseCaseFactoryImpl implements UseCaseFactory{

    public UseCase makeUseCase(String useCase, HashMap<String, String> request) {
        if (useCase.equals("SAVE_ARTICLE"))
            return new SaveArticleUseCase(new SaveArticleRequest(request.get("title"), request.get("content")));
        else if (useCase.equals("READ_ARTICLE"))
            return new ReadArticleUseCase(new ReadArticleRequest(request.get("id")));
        else
            throw new IllegalArgumentException("Specified use case does not exist.");
    }
}
