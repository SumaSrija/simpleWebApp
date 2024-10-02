package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome Here!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "we don't teach, we learn!!!";
    }

}
