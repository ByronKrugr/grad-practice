package com.blogwebapp.bwa.controllers.saveArticle;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.abstractUseCaseComponents.Request;
import com.blogwebapp.bwa.factoriesAndBuilders.RequestBuilderImpl;
import com.blogwebapp.bwa.factoriesAndBuilders.UseCaseFactoryImpl;
import com.blogwebapp.bwa.abstractUseCaseComponents.Response;
import com.blogwebapp.bwa.abstractUseCaseComponents.UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;


@Controller
public class ArticleSaveController {
    @Autowired
    private UseCaseFactoryImpl useCaseFactory;
    private RequestBuilderImpl requestBuilder;
    private UseCase saveArticleUseCase;

    public ArticleSaveController(){
        this.requestBuilder = new RequestBuilderImpl();
    }

    @PostMapping("/save")
    public ResponseEntity<Response> saveArticle(@RequestBody Article article){
        this.saveArticleUseCase = this.useCaseFactory.makeUseCase("SAVE_ARTICLE");
        Request saveArticleRequest = requestBuilder.buildRequest("SAVE_ARTICLE",
                new HashMap<>(){{ put("title", article.getTitle());
                    put("tldr", article.getTldr());
                    put("content", article.getContent()); }});
        Response saveArticleResponse = this.saveArticleUseCase.execute(saveArticleRequest);
        return new ResponseEntity<>(saveArticleResponse, HttpStatus.CREATED);
    }
}