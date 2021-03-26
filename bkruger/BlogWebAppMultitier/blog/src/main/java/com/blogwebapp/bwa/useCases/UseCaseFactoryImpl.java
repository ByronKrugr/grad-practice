package com.blogwebapp.bwa.useCases;

public class UseCaseFactoryImpl implements UseCaseFactory{

    @Override
    public SaveArticleUseCase makeUseCase(String useCase) {
        if (!useCase.equals("SAVE_ARTICLE"))
            throw new IllegalArgumentException("Invalid use case specified");
        else if (useCase.equals("SAVE_ARTICLE"))
            return new SaveArticleUseCase();
        return null;
    }
}
