package com.practica.ibm.spring.test.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class Admin {

    @GetMapping()
    public String getAdmin(){
        return "Admin page";
    }
    // maybe admin login ?
    // ALL ADMIN LOGIC GOES HERE
}

//              http://localhost:8080/
//               /         |         \
//           /admin     Default()   /users
//              |                    /   \
//              ()                  /x    /all
