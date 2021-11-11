package com.sample.jenkinsvalidation.controller;

import com.sample.jenkinsvalidation.service.HealthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

class HealthControllerTest {

    @BeforeEach
    public void setupBaseTest() {
        MockitoAnnotations.initMocks(this);
//        Logger root = (Logger) LoggerFactory.getLogger("uk.co.jemos.podam.api");
//        root.setLevel(Level.OFF);
    }

    @Mock
    HealthService healthService;

    @InjectMocks
    HealthController healthController;

    @Test
    void validateHealth() {
        doReturn("val").when(healthService).getHealth();
        ResponseEntity<String> response = healthController.getHealth();
        assertEquals(response.getStatusCode(), HttpStatus.OK);
    }


}