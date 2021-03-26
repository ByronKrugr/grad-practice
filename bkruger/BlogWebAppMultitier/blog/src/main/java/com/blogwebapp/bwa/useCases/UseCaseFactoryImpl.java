package com.blogwebapp.bwa.useCases;

public class UseCaseFactoryImpl implements UseCaseFactory{

    @Override
    public UseCase makeUseCase(String useCase) {
        if (useCase.equals("SAVE_ARTICLE"))
            return new SaveArticleUseCase();
        else if (useCase.equals("READ_ARTICLE"))
            return new ReadArticleUseCase();
        else
            throw new IllegalArgumentException("Invalid use case specified");
    }
}
