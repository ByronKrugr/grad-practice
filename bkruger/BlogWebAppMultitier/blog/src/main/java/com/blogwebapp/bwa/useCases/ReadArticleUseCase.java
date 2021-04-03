package com.blogwebapp.bwa.useCases;

public class ReadArticleUseCase implements UseCase{
    private ReadArticleRequest request;

    public ReadArticleUseCase(ReadArticleRequest request){
        this.request = request;
    }
}
