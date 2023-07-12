package com.lista11.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Potenciacao {

    @GetMapping("/eleva-ao-quadrado/{numero}")
    public int ElevaAoQuadrado(@PathVariable int numero) {
        return numero * numero;
    }

}
