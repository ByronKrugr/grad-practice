package com.blogwebapp.bwa.services.saveArticle;

import com.blogwebapp.bwa.services.UseCase;

public class SaveArticleUseCase implements UseCase {
    private SaveArticleRequest request;

    public SaveArticleUseCase(SaveArticleRequest request){
        this.request = request;
    }
}
