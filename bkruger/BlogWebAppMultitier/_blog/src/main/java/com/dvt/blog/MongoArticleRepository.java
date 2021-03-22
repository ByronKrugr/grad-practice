package com.dvt.blog;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoArticleRepository implements ArticleRepository{

    private MongoCollection<Document> collection;

    public MongoArticleRepository(){
        MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
        MongoDatabase database = mongoClient.getDatabase("test_db");
        this.collection = database.getCollection("article");
    }

    @Override
    public Article findById(String id) {
        return null;
    }
}
