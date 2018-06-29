package com.elton.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.elton.app.converter.CategoryConverter;
import com.elton.app.service.CategoryService;

@CrossOrigin
@RestController
public class CategoryController {

	@Autowired
	private CategoryService service;

	@GetMapping("/api/v1/categories/{description}")
	public ResponseEntity<?> findCategorySuggestionByDescription(@PathVariable final String description){
		return new ResponseEntity<>(CategoryConverter.toDTO(service.findCategorySuggestionByDescription(description)), HttpStatus.OK);
	}
}
