package com.f_rafael.microservicio_marcas.service;

import com.f_rafael.microservicio_marcas.model.Marca;
import com.f_rafael.microservicio_marcas.repository.MarcaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {

    private MarcaRepository repository;

    public MarcaService(MarcaRepository repository) {
        this.repository = repository;
    }

    public List<Marca> buscarTodas(){
        return repository.findAll();
    }

    public Marca buscarPorId(Integer id){
        return repository.findById(id).get();
    }

    public Marca guardar(Marca marca){
        return repository.save(marca);
    }
}
