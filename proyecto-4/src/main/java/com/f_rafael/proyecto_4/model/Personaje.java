package com.f_rafael.proyecto_4.model;

import jakarta.persistence.*;

@Entity
@Table(name = "personajes")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apodo;

    public Personaje() {
    }

    public Personaje(Long id, String nombre, String apodo) {
        this.id = id;
        this.nombre = nombre;
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
