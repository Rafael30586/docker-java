package com.f_rafael.proyecto_4.repository;

import com.f_rafael.proyecto_4.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
}
