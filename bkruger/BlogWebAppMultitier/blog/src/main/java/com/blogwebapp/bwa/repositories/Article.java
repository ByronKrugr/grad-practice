package com.blogwebapp.bwa.repositories;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Article {
    @BsonProperty(value = "_id")
    private String id;
    private String title;
    private String tldr;
    private String content;

    public Article() {
    }

    public Article(String title, String tldr, String content){
        this.title = title;
        this.tldr = tldr;
        this.content = content;
    }

    public Article(ArticleBuilder articleBuilder) {
        this.id=articleBuilder.getId();
        this.title=articleBuilder.getTitle();
        this.tldr=articleBuilder.getTldr();
        this.content=articleBuilder.getContent();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTldr() {
        return tldr;
    }

    public void setTldr(String tldr) {
        this.tldr = tldr;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
