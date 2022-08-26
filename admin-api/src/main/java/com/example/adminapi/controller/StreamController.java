package com.example.adminapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stream")
public class StreamController {

    @GetMapping("/get")
    public String get(){
        return "Stream get from Admin-Api service";
    }
}
