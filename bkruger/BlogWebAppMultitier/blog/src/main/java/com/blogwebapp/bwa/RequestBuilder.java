package com.blogwebapp.bwa;

import com.blogwebapp.bwa.services.Request;

import java.util.HashMap;

public interface RequestBuilder {
    Request buildRequest(String useCase, HashMap<String,String> request);
}
