package com.f_rafael.microservicio_alimentos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alimentos")
public class Alimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Column(name = "clasificacion_id")
    private Integer clasificacionId;
    @Column(name = "marca_id")
    private Integer marcaId;

    public Alimento() {
    }

    public Alimento(Integer id, Integer clasificacionId, String nombre, Integer marcaId) {
        this.id = id;
        this.clasificacionId = clasificacionId;
        this.nombre = nombre;
        this.marcaId = marcaId;
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

    public Integer getClasificacionId() {
        return clasificacionId;
    }

    public void setClasificacionId(Integer clasificacionId) {
        this.clasificacionId = clasificacionId;
    }

    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }
}
