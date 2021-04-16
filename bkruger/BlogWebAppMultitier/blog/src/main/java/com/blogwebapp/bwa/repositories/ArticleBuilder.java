package com.blogwebapp.bwa.repositories;

import java.security.cert.CertPathBuilder;

public class ArticleBuilder {
    private String id;

    public Article build() {
        Article article = new Article();
        article.setId("id");
        return article;
    }

    public ArticleBuilder withId(String id) {
        this.id=id;
        return this;
    }
}
