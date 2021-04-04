package com.blogwebapp.bwa.factoriesAndBuilders;

import com.blogwebapp.bwa.abstractUseCaseComponents.Request;
import com.blogwebapp.bwa.abstractFactoriesAndBuilders.RequestBuilder;
import com.blogwebapp.bwa.useCaseComponents.readArticle.ReadArticleRequest;
import com.blogwebapp.bwa.useCaseComponents.saveArticle.SaveArticleRequest;

import java.util.HashMap;

public class RequestBuilderImpl implements RequestBuilder {

    @Override
    public Request buildRequest(String useCase, HashMap<String, String> request) {
        if (useCase.equals("SAVE_ARTICLE"))
            return new SaveArticleRequest(request);
        else if (useCase.equals("READ_ARTICLE"))
            return new ReadArticleRequest(request);
        return null;
    }
}
