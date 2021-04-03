package com.blogwebapp.bwa.services.readArticle;

import com.blogwebapp.bwa.services.UseCase;

public class ReadArticleUseCase implements UseCase {
    private ReadArticleRequest request;

    public ReadArticleUseCase(ReadArticleRequest request){
        this.request = request;
    }
}
