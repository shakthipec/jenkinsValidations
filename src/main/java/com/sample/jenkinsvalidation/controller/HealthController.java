package com.sample.jenkinsvalidation.controller;

import com.sample.jenkinsvalidation.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final HealthService healthService;

    @Autowired
    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getHealth() {
        String val = healthService.getHealth();
        return new ResponseEntity<>(val, HttpStatus.OK);
    }
}
