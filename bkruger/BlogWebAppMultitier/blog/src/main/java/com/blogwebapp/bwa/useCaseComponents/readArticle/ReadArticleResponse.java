package com.blogwebapp.bwa.useCaseComponents.readArticle;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.abstractUseCaseComponents.Response;

public class ReadArticleResponse implements Response {
    private Article article;

    public ReadArticleResponse(Article article){
        this.article = article;
    }

    public Article getArticle(){
        return this.article;
    }
}
