package com.blogwebapp.bwa.useCaseComponents.saveArticle;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.abstractUseCaseComponents.Response;

public class SaveArticleResponse implements Response {
    private Article savedArticle;

    public SaveArticleResponse(Article savedArticle){
        this.savedArticle = savedArticle;
    }

    public Article getSavedArticle(){
        return this.savedArticle;
    }
}
