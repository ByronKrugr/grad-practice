package com.blogwebapp.bwa.useCases;

import java.util.HashMap;

public class UseCaseFactoryImpl implements UseCaseFactory{

    @Override
    public UseCase makeUseCase(String useCase, HashMap<String, String> requestParameters) {
        if (useCase.equals("SAVE_ARTICLE"))
            return new SaveArticleUseCase(new SaveArticleRequest(requestParameters));
        else if (useCase.equals("READ_ARTICLE"))
            return new ReadArticleUseCase(new ReadArticleRequest(requestParameters));
        else
            throw new IllegalArgumentException("Invalid use case specified");
    }
}
