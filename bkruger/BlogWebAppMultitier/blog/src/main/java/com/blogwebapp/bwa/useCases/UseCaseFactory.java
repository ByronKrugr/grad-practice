package com.blogwebapp.bwa.useCases;

import java.util.HashMap;

public interface UseCaseFactory {
    UseCase makeUseCase(String useCase, HashMap<String,String> requestParameters);
}
