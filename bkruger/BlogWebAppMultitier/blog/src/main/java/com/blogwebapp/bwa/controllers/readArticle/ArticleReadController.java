package com.blogwebapp.bwa.controllers.readArticle;

import com.blogwebapp.bwa.abstractUseCaseComponents.Request;
import com.blogwebapp.bwa.factoriesAndBuilders.RequestBuilderImpl;
import com.blogwebapp.bwa.factoriesAndBuilders.UseCaseFactoryImpl;
import com.blogwebapp.bwa.abstractUseCaseComponents.Response;
import com.blogwebapp.bwa.abstractUseCaseComponents.UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@Controller
public class ArticleReadController {
    @Autowired
    private UseCaseFactoryImpl useCaseFactory;
    private RequestBuilderImpl requestBuilder;
    private UseCase readArticleUseCase;

    public ArticleReadController(){
        this.requestBuilder = new RequestBuilderImpl();
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Response> readArticle(@PathVariable String id){
        this.readArticleUseCase = useCaseFactory.makeUseCase("READ_ARTICLE");
        Request readArticleRequest = requestBuilder.buildRequest("READ_ARTICLE",
                new HashMap<>(){{ put("id", id); }});
        this.readArticleUseCase = useCaseFactory.makeUseCase("READ_ARTICLE");
        Response readArticleResponse = this.readArticleUseCase.execute(readArticleRequest);
        return new ResponseEntity<>(readArticleResponse, HttpStatus.FOUND);
    }
}