package com.f_rafael.microservicio_alimentos.repository;

import com.f_rafael.microservicio_alimentos.model.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlimentoRepository extends JpaRepository<Alimento, Integer> {
}
