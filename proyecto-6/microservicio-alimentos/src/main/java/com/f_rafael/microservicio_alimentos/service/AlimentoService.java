package com.f_rafael.microservicio_alimentos.service;

import com.f_rafael.microservicio_alimentos.dto.AlimentoDto;
import com.f_rafael.microservicio_alimentos.mapper.AlimentoMapper;
import com.f_rafael.microservicio_alimentos.model.Alimento;
import com.f_rafael.microservicio_alimentos.repository.IAlimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentoService {

    private IAlimentoRepository repository;
    private AlimentoMapper mapper;

    public AlimentoService(IAlimentoRepository repository, AlimentoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public AlimentoDto buscarPorId(Integer id){
        return mapper.obtenerDto(repository.findById(id).get());
    }

    public List<AlimentoDto> buscarTodos(){
        return mapper.obtenerListaDeDtos(repository.findAll());
    }

    public AlimentoDto guardar(Alimento alimento){
        return mapper.obtenerDto(repository.save(alimento));
    }


}
