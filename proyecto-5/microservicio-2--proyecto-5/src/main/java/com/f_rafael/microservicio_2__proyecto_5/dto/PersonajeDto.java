package com.f_rafael.microservicio_2__proyecto_5.dto;

public class PersonajeDto {

    private Integer id;
    private String nombre;
    private String apodo;

    public PersonajeDto() {
    }

    public PersonajeDto(Integer id, String nombre, String apodo) {
        this.id = id;
        this.nombre = nombre;
        this.apodo = apodo;
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

}
