package com.blogwebapp.bwa.controllers.readArticle;

import com.blogwebapp.bwa.repositories.Article;
import com.blogwebapp.bwa.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ArticleReadController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/read/{id}")
    public ResponseEntity<Article> readArticle(@PathVariable String id){
        Article article = articleService.getArticle(id);
        return new ResponseEntity<>(article, HttpStatus.FOUND);
    }
}