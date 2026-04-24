package com.f_rafael.microservicio_2__proyecto_5.service;

import com.f_rafael.microservicio_2__proyecto_5.dto.PersonajeDto;
import com.f_rafael.microservicio_2__proyecto_5.model.Personaje;
import com.f_rafael.microservicio_2__proyecto_5.repository.Microservicio1Client;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class PersonajeService {

    private Microservicio1Client microservicio1Client;

    public PersonajeService(Microservicio1Client microservicio1Client) {
        this.microservicio1Client = microservicio1Client;
    }

    public List<Personaje> buscarTodos(){
        List<PersonajeDto> informacionPersonajes = microservicio1Client.buscarTodos();
        List<Personaje> personajesARetornar = new LinkedList<>();

        for(PersonajeDto pd : informacionPersonajes){
            personajesARetornar.add(new Personaje(pd.getNombre(),pd.getApodo(),pd.getId()));
        }

        return personajesARetornar;
    }

    public Personaje buscarPorId(Integer id){
        Personaje personajeARetornar;
        PersonajeDto informacionPersonaje = microservicio1Client.buscarPorId(id);

        personajeARetornar = new Personaje(informacionPersonaje.getNombre(),
                informacionPersonaje.getApodo(),
                informacionPersonaje.getId());

        return personajeARetornar;
    }

}
