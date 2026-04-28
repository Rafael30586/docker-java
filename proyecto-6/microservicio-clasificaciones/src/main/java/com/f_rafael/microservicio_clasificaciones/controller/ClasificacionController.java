package com.f_rafael.microservicio_clasificaciones.controller;

import com.f_rafael.microservicio_clasificaciones.model.Clasificacion;
import com.f_rafael.microservicio_clasificaciones.service.ClasificacionService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clasificaciones")
public class ClasificacionController {

    private ClasificacionService service;

    public ClasificacionController(ClasificacionService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Clasificacion>> buscarTodas(){
        return ResponseEntity.ok(service.buscarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clasificacion> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Clasificacion> guardar(@RequestBody Clasificacion clasificacion){
        return new ResponseEntity<>(service.guardar(clasificacion),HttpStatusCode.valueOf(201));
    }
}
