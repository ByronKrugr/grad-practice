package com.designpatterns.dp;

public class SaveArticleUseCase implements UseCase{
    private SaveArticleRequest request;

    public SaveArticleUseCase(SaveArticleRequest request){
        this.request = request;
    }

    public String execute() {
        return "SaveArticleUseCase: " + this.request.getArticleTitle() + "\n" +
                "SaveArticleUseCase: " + this.request.getArticleContent() + "\n";
    }
}
