package com.f_rafael.microservicio_2__proyecto_5.controller;

import com.f_rafael.microservicio_2__proyecto_5.model.Personaje;
import com.f_rafael.microservicio_2__proyecto_5.service.PersonajeService;
import org.apache.catalina.LifecycleState;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personajes")
public class PersonajeController {

    private PersonajeService service;

    public PersonajeController(PersonajeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Personaje>> buscarTodos(){
        return ResponseEntity.ok(service.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personaje> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }
}
