package com.example.springlearning.controller.uc3;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/")
    public String hello(){
        return "Hello from BridgeLabz!";
    }
}