package com.practica.ibm.spring.test.client.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Log4j2
public class Controller {

    // www.ibm.ro : -> error
    // www.ibm.ro/users -> hit on this controller
    // www.ibm.ro/users/x
    @GetMapping()
    public String get(){
        return "Hello user!";
    }

    @GetMapping("/x")
    public String getResponse(){
        return "Welcome!";
    }
    // www.ibm.ro/users/all
    @GetMapping("/all")
    public String getAll(){
        return "Everyone's welcome!";
    }

}
