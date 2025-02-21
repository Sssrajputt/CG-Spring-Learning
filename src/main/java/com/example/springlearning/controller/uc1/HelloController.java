package com.example.springlearning.controller.uc1;


import org.springframework.web.bind.annotation.*;
import com.example.springlearning.model.User;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping({"","/hello"})
    public String sayHello(){
        return "Hello From BirdgeLabz";
    }
}