package com.nitish.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   
public class MyClass {

    @GetMapping("/123")
    public String hello() {
        return "Hello, Class!";
    }
} 