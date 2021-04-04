package com.blogwebapp.bwa.controllers.readArticle;

import com.blogwebapp.bwa.RequestBuilderImpl;
import com.blogwebapp.bwa.UseCaseFactoryImpl;
import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.ArticleService;
import com.blogwebapp.bwa.services.Request;
import com.blogwebapp.bwa.services.Response;
import com.blogwebapp.bwa.services.UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@Controller
public class ArticleReadController {
    private UseCaseFactoryImpl useCaseFactory;
    private RequestBuilderImpl requestBuilder;
    private UseCase readArticleUseCase;

    public ArticleReadController(){
        this.useCaseFactory = new UseCaseFactoryImpl();
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