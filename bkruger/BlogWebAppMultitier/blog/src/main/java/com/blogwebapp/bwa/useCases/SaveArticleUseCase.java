package com.blogwebapp.bwa.useCases;

public class SaveArticleUseCase implements UseCase{
    private SaveArticleRequest request;

    public SaveArticleUseCase(SaveArticleRequest request){
        this.request = request;
    }
}
