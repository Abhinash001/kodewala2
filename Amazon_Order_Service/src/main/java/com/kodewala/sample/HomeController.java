package com.kodewala.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Amazon Order Service is Running Successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}