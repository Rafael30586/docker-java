package com.f_rafael.microservicio_alimentos.repository;

import com.f_rafael.microservicio_alimentos.dto.ClasificacionDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservicio-clasificaciones", url = "http//:microservicio-clasificacion-p-6:8080")
public interface IClasificacionClient {

    @GetMapping("/clasificaciones/{id}")
    public ClasificacionDto buscarPorId(@PathVariable Integer id);
}
