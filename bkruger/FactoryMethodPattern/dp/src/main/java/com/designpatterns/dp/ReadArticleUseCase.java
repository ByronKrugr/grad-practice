package com.designpatterns.dp;

public class ReadArticleUseCase implements UseCase {
  private ReadArticleRequest request;

  public ReadArticleUseCase(ReadArticleRequest request) {
    this.request = request;
  }

  public String execute() {
    return "ReadArticleUseCase: " + request.getArticleId() + "\n";
  }
}
