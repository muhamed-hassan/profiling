package com.poc.interfaces.rest.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/resources")
public class Controller {

	@Value("${spring.profiles.active}")
	private String activeProfile;

	@Value("${sample.db.url}")
	private String sampleDbUrl;
	
	@GetMapping
	public ResponseEntity<Map<String, String>> get() {
		var response = Map.of("activeProfile", activeProfile,
								"activeDbUrl", sampleDbUrl);
		return ResponseEntity.ok(response);
	}
	
}
