package com.sample.jenkinsvalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sample.*"})
public class JenkinsValidationApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsValidationApplication.class, args);
    }

}
