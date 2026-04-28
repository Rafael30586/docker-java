package com.f_rafael.microservicio_marcas.repository;

import com.f_rafael.microservicio_marcas.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
