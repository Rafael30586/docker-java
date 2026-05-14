package com.f_rafael.proyecto_7_docker_java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable String nombre){
        return "Hola "+nombre;
    }
}
