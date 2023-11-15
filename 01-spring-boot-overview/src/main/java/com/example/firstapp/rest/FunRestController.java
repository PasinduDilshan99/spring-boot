package com.example.firstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}

