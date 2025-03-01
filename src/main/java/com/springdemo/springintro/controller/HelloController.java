package com.springdemo.springintro.controller;

import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/hello/param/{name}")
    public String helloParam(@PathVariable String name){
        return "Hello " + name + " from bridgelabz";
    }
}