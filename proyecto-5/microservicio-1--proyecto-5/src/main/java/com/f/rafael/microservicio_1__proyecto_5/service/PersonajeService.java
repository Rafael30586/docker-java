package com.f.rafael.microservicio_1__proyecto_5.service;

import com.f.rafael.microservicio_1__proyecto_5.model.Personaje;
import com.f.rafael.microservicio_1__proyecto_5.repository.PersonajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {

    private PersonajeRepository repository;

    public PersonajeService(PersonajeRepository repository) {
        this.repository = repository;
    }

    public List<Personaje> buscarTodos(){
        return repository.buscasrTodos();
    }

    public Personaje buscarPorId(Integer id){
        return repository.buscarPorId(id);
    }

    public void guardar(Personaje personaje){
        repository.guardar(personaje);
    }
}
