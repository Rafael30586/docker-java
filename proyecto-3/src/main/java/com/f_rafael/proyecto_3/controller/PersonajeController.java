package com.f_rafael.proyecto_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class PersonajeController {

    @GetMapping("/")
    public List<String> mostrarPersonajes(){

        List<String> personajes = List.of("Mario","Sonic","Master Chief", "Link", "Samus", "Cloud");

        return personajes;
    }
}
