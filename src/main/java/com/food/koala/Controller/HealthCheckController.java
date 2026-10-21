package com.food.koala.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/health")
@Slf4j
public class HealthCheckController {
    @GetMapping("/info")
    public ResponseEntity<String> healthCheck(){
      log.info("Calling the Health endpoint");
     return ResponseEntity.status(HttpStatus.OK).body("Application is up and running");
    }

}
