package com.lista11.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @GetMapping("/login/{user}")
    public boolean Logar(@PathVariable String user){
        if(user.equals("admin")){
            return true;
        }
        return false;
    }
    
}
