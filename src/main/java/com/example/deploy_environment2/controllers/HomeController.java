package com.example.deploy_environment2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private Environment env;

    @GetMapping("")
    public String getGreetingTest() {
        return env.getProperty("welcomeMsg");
    }
}