package com.blogwebapp.bwa.abstractFactoriesAndBuilders;

import com.blogwebapp.bwa.abstractUseCaseComponents.Request;

import java.util.HashMap;

public interface RequestBuilder {
    Request buildRequest(String useCase, HashMap<String,String> request);
}
