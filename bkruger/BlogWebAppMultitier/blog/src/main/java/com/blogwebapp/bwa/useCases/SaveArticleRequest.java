package com.blogwebapp.bwa.useCases;

import java.util.HashMap;

public class SaveArticleRequest implements Request{
    private HashMap<String, String> requestParameters;

    public SaveArticleRequest(HashMap<String,String> requestParameters){
        this.requestParameters = requestParameters;
    }
}
