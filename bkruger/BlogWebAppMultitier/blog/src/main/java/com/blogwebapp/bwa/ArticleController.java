package com.blogwebapp.bwa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/saveArticle")
    public ResponseEntity<Article> saveArticle(@RequestBody Article article){
        Article savedArticle = articleService.saveArticle(article);
        return new ResponseEntity<>(savedArticle, HttpStatus.CREATED);
    }

    @GetMapping("/getArticle/{id}")
    public ResponseEntity<Article> getArticle(@PathVariable String id){
        Article article = articleService.getArticle(id);
        return new ResponseEntity<>(article, HttpStatus.FOUND);
    }
}