package com.poc.interfaces.rest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
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
		
		Map<String, String> responseBody = new HashMap<String, String>(2);
		responseBody.put("activeProfile", activeProfile);
		responseBody.put("activeDbUrl", sampleDbUrl);
		
		return new ResponseEntity<Map<String, String>>(responseBody, HttpStatus.OK);
	}
	
}
