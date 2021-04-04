package com.blogwebapp.bwa.useCaseComponents.readArticle;

import com.blogwebapp.bwa.abstractUseCaseComponents.Request;

import java.util.HashMap;

public class ReadArticleRequest implements Request {

    private String id;

    private HashMap<String, String> requestParameters;

    public ReadArticleRequest(HashMap<String,String> requestParameters){
        this.id = requestParameters.get("id");
    }

    public String getId(){
        return this.id;
    }
}
