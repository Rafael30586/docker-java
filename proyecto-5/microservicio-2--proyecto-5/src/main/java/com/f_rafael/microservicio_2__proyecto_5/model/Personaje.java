package com.f_rafael.microservicio_2__proyecto_5.model;

public class Personaje {

    private Integer id;
    private String nombre;
    private String apodo;
    private Integer microservicio;

    public Personaje() {
        this.microservicio = 2;
    }

    public Personaje(String nombre, String apodo, Integer id) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.id = id;
        this.microservicio = 2;
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
