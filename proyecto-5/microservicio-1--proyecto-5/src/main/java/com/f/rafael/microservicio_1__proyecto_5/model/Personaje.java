package com.f.rafael.microservicio_1__proyecto_5.model;

public class Personaje {
    private Integer id;
    private String nombre;
    private String apodo;
    private Integer microservicio;

    public Personaje() {
        this.microservicio = 1;
    }

    public Personaje(Integer id, String nombre, String apodo) {
        this.id = id;
        this.nombre = nombre;
        this.apodo = apodo;
        this.microservicio = 1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getMicroservicio() {
        return microservicio;
    }

}
