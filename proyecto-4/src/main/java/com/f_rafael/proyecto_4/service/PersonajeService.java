package com.f_rafael.proyecto_4.service;

import com.f_rafael.proyecto_4.model.Personaje;
import com.f_rafael.proyecto_4.repository.PersonajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {

    private PersonajeRepository repository;

    public PersonajeService(PersonajeRepository repository) {
        this.repository = repository;
    }

    public Personaje buscarPorId(Long id){
        return repository.findById(id).get();
    }

    public List<Personaje> buscarTodos(){
        return repository.findAll();
    }

    public Personaje guardar(Personaje personaje){
        return repository.save(personaje);
    }
}
