package com.mongocrud.crud;

import java.time.Instant;

public final class Place {
    private final String name;
    private final String suburbName;
    private final int guessVisitCount;
    private final int guaranteedVisitCount;
    private final float rating;
    private final int amountRatings;
    private final Instant dateCreated;
    private final String googleMapsPlaceId;

    public Place(String name, String suburbName, String googleMapsPlaceId){
        this.name=name;
        this.suburbName=suburbName;
        this.googleMapsPlaceId=googleMapsPlaceId;
        this.amountRatings=0;
        this.rating=0.0f;
        this.dateCreated=Instant.now();
        this.guessVisitCount=0;
        this.guaranteedVisitCount=0;
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