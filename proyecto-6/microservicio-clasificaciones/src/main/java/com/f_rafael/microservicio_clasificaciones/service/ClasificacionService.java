package com.f_rafael.microservicio_clasificaciones.service;

import com.f_rafael.microservicio_clasificaciones.model.Clasificacion;
import com.f_rafael.microservicio_clasificaciones.repository.ClasificacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasificacionService {

    private ClasificacionRepository repository;

    public ClasificacionService(ClasificacionRepository repository) {
        this.repository = repository;
    }

    public List<Clasificacion> buscarTodas(){
        return repository.findAll();
    }

    public Clasificacion buscarPorId(Integer id){
        return repository.findById(id).get();
    }

    public Clasificacion guardar(Clasificacion clasificacion){
        return repository.save(clasificacion);
    }
}
