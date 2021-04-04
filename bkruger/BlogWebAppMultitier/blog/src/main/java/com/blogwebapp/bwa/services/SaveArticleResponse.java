package com.blogwebapp.bwa.services;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.services.Response;

public class SaveArticleResponse implements Response {
    private Article savedArticle;
    public SaveArticleResponse(Article savedArticle){
        this.savedArticle = savedArticle;
    }
}
