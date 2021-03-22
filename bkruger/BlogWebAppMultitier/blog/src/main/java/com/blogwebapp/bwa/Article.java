package com.blogwebapp.bwa;

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
}
