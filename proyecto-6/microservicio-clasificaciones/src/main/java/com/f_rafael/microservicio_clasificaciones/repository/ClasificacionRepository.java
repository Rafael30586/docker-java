package com.f_rafael.microservicio_clasificaciones.repository;

import com.f_rafael.microservicio_clasificaciones.model.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionRepository extends JpaRepository<Clasificacion, Integer> {
}
