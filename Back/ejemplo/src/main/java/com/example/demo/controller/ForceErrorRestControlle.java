package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class ForceErrorRestControlle {

	@GetMapping(value = "/api/throwException")
    public void throwException() {
        throw new IllegalArgumentException("\"I am the error message from Rest Controller\"");
    }
}