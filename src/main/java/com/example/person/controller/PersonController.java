package com.example.person.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PersonController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}


