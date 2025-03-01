package com.springdemo.springintro.controller;

import com.springdemo.springintro.controller.dtu.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping(value = "/home")
    public String sayHello(){
        return "Hello From BridgeLabz";
    }

    //http://localhost:8080/query?name= ayushi
    @GetMapping(value = "/query")
    public String query(@RequestParam String name){
        return "Hello " + name + " from bridgelabz";
    }

    //http://localhost:8080/hello/param/ayushi
    @GetMapping("/hello/param/{name}")
    public String helloParam(@PathVariable String name){
        return "Hello " + name + " from bridgelabz";
    }

    //http://localhost:8080/post
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello"+user.getFirstName() +" "+ user.getLastName()+" !";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable  String firstName,
                           @RequestParam(value = "lastName") String lastName){
        return "Hello "+firstName+" "+lastName+" !";
    }

}