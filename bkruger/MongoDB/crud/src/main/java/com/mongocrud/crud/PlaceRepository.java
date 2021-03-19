package com.mongocrud.crud;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.*;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import org.bson.types.ObjectId;

public class PlaceRepository {
    
    private MongoCollection<Document> collection;

    public void setUp(){
        MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
        MongoDatabase database = mongoClient.getDatabase("test_db");
        this.collection = database.getCollection("user");
    }

    public void addPlace(String name, String suburbName){
        Document d = new Document("name", name)
                .append("suburbName", suburbName)
                .append("guessVisitCount", 0)
                .append("guaranteedVisitCount", 0)
                .append("rating", 0.0)
                .append("amountRatings", 0)
                .append("dateCreated", Instant.now())
                .append("googleMapsPlaceId", "1Yyhsju7wb&ebsuCchegYs");
        this.collection.insertOne(d);
    }

    public void removePlace(String id){
        this.collection.deleteOne(eq("id", new ObjectId(id)));
    }

    public Document getPlace(String id){
        return collection.find(eq("_id", new ObjectId(id))).first();
    }

//    public Document updatePlace(String id, HashMap<String, String> updateValues){
//        Document document = getPlace(id);
//        Set<String> allKeys = document.keySet();
//        Set<String> updateKeys = updateValues.keySet();
//        for (String allKeysKey : allKeys){
//            for (String updateKeysKey : updateKeys){
//                if (allKeysKey == updateKeysKey)
//                    document.append(updateKeysKey, updateValues.get(updateKeysKey));
//            }
//        }
//        collection.updateOne(eq("_id", new ObjectId(id)), set(""))
//    }
}
