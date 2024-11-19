package com.farmapp.buyer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Buyer Application!";
    }

    @GetMapping("/test")
    public String testEndpoint() {
        return "This is a test endpoint!";
    }
}

