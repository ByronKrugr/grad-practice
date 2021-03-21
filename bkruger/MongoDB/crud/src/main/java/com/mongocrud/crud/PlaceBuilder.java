package com.mongocrud.crud;

import java.time.Instant;

public class PlaceBuilder {


    private String name;
    private String suburbName;
    private int guessVisitCount;
    private int guaranteedVisitCount;
    private float rating;
    private int amountRatings;
    private Instant dateCreated;
    private String googleMapsPlaceId;

    public PlaceBuilder(String name, String suburbName){
        if (name.isEmpty() || suburbName.isEmpty())
            throw new IllegalArgumentException("Place must have at least a name and suburb");
        this.name = name;
        this.suburbName = suburbName;
    }

    public PlaceBuilder withGuessVisitCount(int guessVisitCount){
        this.guessVisitCount = guessVisitCount;
        return this;
    }

    public PlaceBuilder withGuaranteedVisitCount(int guaranteedVisitCount){
        this.guaranteedVisitCount = guaranteedVisitCount;
        return this;
    }

    public PlaceBuilder withRating(float rating){
        this.rating = rating;
        return this;
    }

    public PlaceBuilder withAmountRating(int amountRatings){
        this.amountRatings = amountRatings;
        return this;
    }

    public PlaceBuilder withDataCreated(Instant dateCreated){
        this.dateCreated = dateCreated;
        return this;
    }

    public PlaceBuilder withGoogleMapsPlaceId(String googleMapsPlaceId){
        this.googleMapsPlaceId = googleMapsPlaceId;
        return this;
    }

    public Place build(){
        return new Place(this);
    }

    public String getName() {
        return name;
    }

    public String getSuburbName() {
        return suburbName;
    }

    public int getGuessVisitCount() {
        return guessVisitCount;
    }

    public int getGuaranteedVisitCount() {
        return guaranteedVisitCount;
    }

    public float getRating() {
        return rating;
    }

    public int getAmountRatings() {
        return amountRatings;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public String getGoogleMapsPlaceId() {
        return googleMapsPlaceId;
    }
}
