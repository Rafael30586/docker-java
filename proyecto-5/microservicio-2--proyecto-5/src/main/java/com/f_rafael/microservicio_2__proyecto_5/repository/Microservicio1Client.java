package com.f_rafael.microservicio_2__proyecto_5.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.f_rafael.microservicio_2__proyecto_5.dto.PersonajeDto;

@FeignClient(name = "microservicio-1", url="http://microservicio-1-p-5:8080")
public interface Microservicio1Client {

    @GetMapping("/personajes")
    public List<PersonajeDto> buscarTodos();

    @GetMapping("/personajes/{id}")
    public PersonajeDto buscarPorId(@PathVariable Integer id);
}
