package com.blogwebapp.bwa.repositories;

public class ArticleBuilder {
    private String id;
    private String title;
    private String tldr;
    private String content;

    public Article build() {
        return new Article(this);
    }

    public ArticleBuilder withId(String id) {
        this.id=id;
        return this;
    }

    public ArticleBuilder withTitle(String title) {
        this.title=title;
        return this;
    }

    public ArticleBuilder withTldr(String tldr) {
        this.tldr=tldr;
        return this;
    }

    public ArticleBuilder withContent(String content) {
        this.content=content;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTldr() {
        return this.tldr;
    }

    public String getContent() {
        return this.content;
    }
}
