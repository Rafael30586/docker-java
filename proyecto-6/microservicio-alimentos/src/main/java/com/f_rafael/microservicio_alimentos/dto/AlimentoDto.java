package com.f_rafael.microservicio_alimentos.dto;

public class AlimentoDto {
    private Integer Id;
    private String nombre;
    private ClasificacionDto clasificacion;
    private MarcaDto marca;

    public AlimentoDto() {
    }

    public AlimentoDto(Integer id, String nombre, MarcaDto marca, ClasificacionDto clasificacion) {
        Id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.clasificacion = clasificacion;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ClasificacionDto getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(ClasificacionDto clasificacion) {
        this.clasificacion = clasificacion;
    }

    public MarcaDto getMarca() {
        return marca;
    }

    public void setMarca(MarcaDto marca) {
        this.marca = marca;
    }
}
