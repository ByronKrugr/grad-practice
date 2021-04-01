package com.designpatterns.dp;

public class SaveArticleRequest implements Request {
  private String articleTitle;
  private String articleContent;

  public SaveArticleRequest(String articleTitle, String articleContent) {
    this.articleTitle = articleTitle;
    this.articleContent = articleContent;
  }

  public String getArticleTitle() {
    return this.articleTitle;
  }

  public String getArticleContent() {
    return this.articleContent;
  }
}
