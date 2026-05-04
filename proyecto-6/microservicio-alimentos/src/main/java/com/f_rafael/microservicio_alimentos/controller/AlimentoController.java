package com.f_rafael.microservicio_alimentos.controller;

import com.f_rafael.microservicio_alimentos.dto.AlimentoDto;
import com.f_rafael.microservicio_alimentos.model.Alimento;
import com.f_rafael.microservicio_alimentos.service.AlimentoService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alimentos")
public class AlimentoController {

    private AlimentoService service;

    public AlimentoController(AlimentoService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlimentoDto> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<AlimentoDto>> buscarTodos(){
        return ResponseEntity.ok(service.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<AlimentoDto> guardar(@RequestBody Alimento alimento){
        return new ResponseEntity<>(service.guardar(alimento), HttpStatusCode.valueOf(201));
    }
}
