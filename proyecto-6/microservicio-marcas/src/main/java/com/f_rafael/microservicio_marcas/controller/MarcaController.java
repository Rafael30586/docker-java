package com.f_rafael.microservicio_marcas.controller;

import com.f_rafael.microservicio_marcas.model.Marca;
import com.f_rafael.microservicio_marcas.service.MarcaService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    private MarcaService service;

    public MarcaController(MarcaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Marca>> buscarTodas(){
        return ResponseEntity.ok(service.buscarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Marca> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Marca> guardar(@RequestBody Marca marca){
        return new ResponseEntity<>(service.guardar(marca), HttpStatusCode.valueOf(201));
    }
}
