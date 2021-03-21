package com.mongocrud.crud;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MongoCrudController {

    private PlaceRepository placeRepository;

    public MongoCrudController(){
        placeRepository = new PlaceRepository();
        placeRepository.setUp();
    }

    @PostMapping("/create")
    public ResponseEntity<Document> createPlace(@RequestBody Place place){
        InsertOneResult result = placeRepository.addPlace(place);
        return new ResponseEntity<>(placeRepository.getPlace(result.getInsertedId().asObjectId().getValue().toString()), HttpStatus.CREATED);
    }

    @GetMapping("/retrieve/{id}")
    public ResponseEntity<Document> findPlace(@PathVariable String id){
        return new ResponseEntity<>(placeRepository.getPlace(id), HttpStatus.FOUND);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Document> updatePlace(@PathVariable String id, @RequestBody Place place){
        placeRepository.updatePlace(id, place);
        return new ResponseEntity<>(placeRepository.getPlace(id), HttpStatus.OK);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<DeleteResult> removePlace(@PathVariable String id){
        DeleteResult result = placeRepository.removePlace(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
