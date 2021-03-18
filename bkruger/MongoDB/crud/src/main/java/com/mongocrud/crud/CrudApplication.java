package com.mongocrud.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		AddPlaceService addPlaceService = new AddPlaceService();
		addPlaceService.setUp();
		addPlaceService.addPlace("Dodgy Roger", "Parkhurst");
		addPlaceService.addPlace("Hudson's Burgers", "Parkhurst");
		addPlaceService.addPlace("Lock, Stock, Beer", "Fourways");
	}

}
