package com.example.Restfulweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @GetMapping
    String sayHello(){
        return "hello and welcome";
    }

    @GetMapping("/add")
    String add(){
        return "the sum is";
    }

    @GetMapping("/weather")
    String getWeather(){
        return  "the  weather is good";
    }
}
