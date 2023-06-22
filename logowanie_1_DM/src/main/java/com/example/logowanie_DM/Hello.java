package com.example.logowanie_DM;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello")
    public String sayHello() {
    return "Hello World!";
    }

    @GetMapping("/hello2")
    public String sayHello2() {
        return "Hello World2!";
    }
}
