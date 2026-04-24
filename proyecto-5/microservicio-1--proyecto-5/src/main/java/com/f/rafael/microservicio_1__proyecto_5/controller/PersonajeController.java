package com.f.rafael.microservicio_1__proyecto_5.controller;

import com.f.rafael.microservicio_1__proyecto_5.model.Personaje;
import com.f.rafael.microservicio_1__proyecto_5.service.PersonajeService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    public ResponseEntity<Personaje> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<String> guardar(@RequestBody Personaje personaje){
        service.guardar(personaje);
        return new ResponseEntity<>(HttpStatusCode.valueOf(201));
    }
}
