package com.designpatterns.dp;

public class ReadArticleRequest implements Request {
  private String articleId;

  public ReadArticleRequest(String articleId) {
    this.articleId = articleId;
  }

  public String getArticleId() {
    return this.articleId;
  }
}
