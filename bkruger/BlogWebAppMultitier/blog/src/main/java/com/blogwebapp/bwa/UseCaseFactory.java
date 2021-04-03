package com.blogwebapp.bwa;

import com.blogwebapp.bwa.services.UseCase;

import java.util.HashMap;

public interface UseCaseFactory {
    UseCase makeUseCase(String useCase, HashMap<String,String> requestParameters);
}
