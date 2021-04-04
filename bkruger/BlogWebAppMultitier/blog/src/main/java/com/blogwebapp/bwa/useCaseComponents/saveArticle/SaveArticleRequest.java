package com.blogwebapp.bwa.useCaseComponents.saveArticle;

import com.blogwebapp.bwa.abstractUseCaseComponents.Request;

import java.util.HashMap;

public class SaveArticleRequest implements Request {
    private String title;
    private String tldr;
    private String content;

    public SaveArticleRequest(HashMap<String,String> requestParameters){
        this.title = requestParameters.get("title");
        this.tldr = requestParameters.get("tldr");
        this.content = requestParameters.get("content");
    }

    public String getTitle(){
        return this.title;
    }

    public String getTldr(){
        return this.tldr;
    }

    public String getContent(){
        return this.content;
    }

}
