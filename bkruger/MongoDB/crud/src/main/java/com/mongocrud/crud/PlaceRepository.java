package com.mongocrud.crud;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;

import java.time.Instant;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;

import com.mongodb.client.result.UpdateResult;
import org.bson.types.ObjectId;

public class PlaceRepository {
    private MongoCollection<Document> collection;

    public void setUp(){
        MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
        MongoDatabase database = mongoClient.getDatabase("testDb");
        this.collection = database.getCollection("place");
    }

    public InsertOneResult addPlace(Place place){
        Document placeDocument = new Document("name", place.getName())
                        .append("suburbName", place.getSuburbName())
                        .append("guessVisitCount", 0)
                        .append("guaranteedVisitCount", 0)
                        .append("rating", 0.0)
                        .append("amountRatings", 0)
                        .append("dateCreated", Instant.now())
                        .append("googleMapsPlaceId", place.getGoogleMapsPlaceId());
        return this.collection.insertOne(placeDocument);
    }

    public DeleteResult removePlace(String id){
        return this.collection.deleteOne(eq("_id", new ObjectId(id)));
    }

    public Document getPlace(String id){
        return collection.find(eq("_id", new ObjectId(id))).first();
    }

    public UpdateResult updatePlace(String id, Place place){

        return collection.updateOne(eq("_id",
                new ObjectId(id)), combine(
                set("suburbName", place.getSuburbName()),
                set("guessVisitCount", place.getGuessVisitCount()),
                set("guaranteedVisitCount", place.getGuaranteedVisitCount()),
                set("rating", place.getRating()),
                set("amountRatings", place.getAmountRatings())));
    }
}
