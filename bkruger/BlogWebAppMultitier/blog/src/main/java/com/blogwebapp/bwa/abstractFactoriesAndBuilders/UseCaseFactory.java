package com.blogwebapp.bwa.abstractFactoriesAndBuilders;

import com.blogwebapp.bwa.abstractUseCaseComponents.UseCase;

public interface UseCaseFactory {
    UseCase makeUseCase(String useCase);
}
