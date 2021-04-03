package com.blogwebapp.bwa.controllers.saveArticle;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ArticleSaveController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/save")
    public ResponseEntity<Article> saveArticle(@RequestBody Article article){
        Article savedArticle = articleService.saveArticle(article);
        return new ResponseEntity<>(savedArticle, HttpStatus.CREATED);
    }
}
