package com.qa.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Return some data when a user hits "localhost:8080" + the param ("/")
    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
}
