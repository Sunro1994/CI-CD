package com.practiceCICD.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> hello() {

        String hello = "Hello";

        return ResponseEntity.status(HttpStatus.OK).body(hello);
    }
}
