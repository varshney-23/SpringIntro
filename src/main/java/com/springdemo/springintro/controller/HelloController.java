package com.springdemo.springintro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping(value = "/home")
    public String sayHello(){
        return "Hello From BridgeLabz";
    }

    @GetMapping(value = "/query")
    public String query(@RequestParam String name){
        return "Hello " + name + " from bridgelabz";
    }
}