package br.usp.suen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

	@GetMapping("/database")
	public ResponseEntity<String> getDataBaseUrl() {
		return new ResponseEntity<>(System.getenv("DATABASE_URL"), HttpStatus.ACCEPTED);
	}
}
