package com.example.jenkinsmaven.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String SayHello(){
        return "Hello Maven modified";
    }

}
