package com.blogwebapp.bwa.repositories;

import java.security.cert.CertPathBuilder;

public class ArticleBuilder {
    private String id;
    private String title;

    public Article build() {
        Article article = new Article();
        article.setId("id");
        article.setTitle("title");
        return article;
    }

    public ArticleBuilder withId(String id) {
        this.id=id;
        return this;
    }

    public ArticleBuilder withTitle(String title) {
        this.title=title;
        return this;
    }
}
