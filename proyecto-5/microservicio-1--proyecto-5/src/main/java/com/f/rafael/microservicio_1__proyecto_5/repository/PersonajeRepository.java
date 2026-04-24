package com.f.rafael.microservicio_1__proyecto_5.repository;

import com.f.rafael.microservicio_1__proyecto_5.model.Personaje;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class PersonajeRepository {

    private List<Personaje> personajes;

    public PersonajeRepository() {
        personajes = new LinkedList<>();

        personajes.add(new Personaje(1,"mario",null));
        personajes.add(new Personaje(2,"link",null));
        personajes.add(new Personaje(3,"john 117","master chief"));
        personajes.add(new Personaje(4, "samus aran", null));
        personajes.add(new Personaje(5,"cloud strife",null));
    }

    public List<Personaje> buscasrTodos(){
        return this.personajes;
    }

    public Personaje buscarPorId(Integer id){
        Personaje personajeARetornar = new Personaje();
        for(Personaje p : this.personajes){
            if(p.getId().equals(id)){
                personajeARetornar = p;
            }
        }
        System.gc();
        return personajeARetornar;
    }

    public void guardar(Personaje personaje){
        personajes.add(personaje);
    }
}
