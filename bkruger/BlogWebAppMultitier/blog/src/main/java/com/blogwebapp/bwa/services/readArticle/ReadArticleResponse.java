package com.blogwebapp.bwa.services.readArticle;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.services.Response;

public class ReadArticleResponse implements Response {
    private Article article;

    public ReadArticleResponse(Article article){
        this.article = article;
    }
}
