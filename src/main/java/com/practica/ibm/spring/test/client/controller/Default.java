package com.practica.ibm.spring.test.client.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Default {

    @GetMapping()
    public String get(){
        return "Empty page.";
    }

}
