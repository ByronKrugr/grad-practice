package com.mongocrud.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		PlaceRepository placeRepository = new PlaceRepository();
		placeRepository.setUp();
		placeRepository.addPlace("Dodgy Roger", "Parkhurst");
		placeRepository.addPlace("Hudson's Burgers", "Parkhurst");
		placeRepository.addPlace("Lock, Stock, Beer", "Fourways");
		placeRepository.addPlace("New Place 1", "Suburb 1");
		placeRepository.addPlace("New Place 2", "Suburb 2");

		System.out.println(placeRepository.getPlace("60520ed5dd31ec10f1f10c8d"));
	}

}
