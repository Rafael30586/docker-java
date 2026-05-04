package com.f_rafael.microservicio_alimentos.repository;

import com.f_rafael.microservicio_alimentos.dto.MarcaDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservicio-marcas", url = "http//:microservicio-marca-p-6:8080")
public interface IMarcaClient {

    @GetMapping("/marcas/{id}")
    public MarcaDto buscarPorId(@PathVariable Integer id);
}

