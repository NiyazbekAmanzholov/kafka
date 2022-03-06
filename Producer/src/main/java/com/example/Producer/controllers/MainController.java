package com.example.Producer.controllers;

import com.example.Producer.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MainController {

    @Autowired
    private ProducerService services;

    @GetMapping("/generate")
    public String generate(@RequestParam String message) {
        services.produce(new String(message + new Random().nextInt()));
        return "ok";
    }
}










