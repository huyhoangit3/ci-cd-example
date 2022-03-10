package com.hoangit3.firstspringbootapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1/hello")
public class HelloController {
    @GetMapping
    public ResponseEntity<Map<Integer, String>> hello() {
        Map<Integer, String> dictionary = new HashMap<>();
        dictionary.put(1, "One");
        dictionary.put(2, "Two");
        return new ResponseEntity<>(dictionary, HttpStatus.OK);
    }
}
