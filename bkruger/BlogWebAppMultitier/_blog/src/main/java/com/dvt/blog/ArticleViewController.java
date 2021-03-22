package com.dvt.blog;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ArticleViewController {
    private ArticleRepository articleRepository;
    private Builder articleBuilder;

    public ArticleViewController(){
        articleBuilder = new ArticleRepositoryBuilderImpl();
        articleRepository = articleBuilder.build("MONGO");
    }

    @GetMapping("/article/{id}")
    public ResponseEntity<Article> getArticle(@PathVariable String id){
        Article article = articleRepository.findById(id);
        return new ResponseEntity<Article>(article, HttpStatus.OK);
    }
}