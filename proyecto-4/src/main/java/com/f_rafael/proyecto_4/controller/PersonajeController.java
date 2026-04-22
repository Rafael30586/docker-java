package com.f_rafael.proyecto_4.controller;

import com.f_rafael.proyecto_4.model.Personaje;
import com.f_rafael.proyecto_4.service.PersonajeService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonajeController {

    private PersonajeService service;

    public PersonajeController(PersonajeService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personaje> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<Personaje>> buscarTodos(){
        return ResponseEntity.ok(service.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Personaje> guardar(@RequestBody Personaje personaje){
        service.guardar(personaje);
        return new ResponseEntity<>(HttpStatusCode.valueOf(201));
    }
}
