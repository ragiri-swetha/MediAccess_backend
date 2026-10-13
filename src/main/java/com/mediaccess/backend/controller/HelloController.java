package com.mediaccess.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to MediAccess Backend!";
    }

    @GetMapping("/api/health")
    public String health() {
        return "MediAccess backend is running!";
    }
}