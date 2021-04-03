package com.blogwebapp.bwa.useCases;

import java.util.HashMap;

public class ReadArticleRequest implements Request{
    private HashMap<String, String> requestParameters;

    public ReadArticleRequest(HashMap<String,String> requestParameters){
        this.requestParameters = requestParameters;
    }
}
