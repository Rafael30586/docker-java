package com.f_rafael.microservicio_2__proyecto_5.repository;

import com.f_rafael.microservicio_2__proyecto_5.dto.PersonajeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "microservicio-1", url="http://localhost:8080")
public interface Microservicio1Client {

    @GetMapping("/personajes")
    public List<PersonajeDto> buscarTodos();

    @GetMapping("/personajes/{id}")
    public PersonajeDto buscarPorId(@PathVariable Integer id);
}
