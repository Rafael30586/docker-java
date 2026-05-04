package com.f_rafael.microservicio_alimentos.mapper;

import com.f_rafael.microservicio_alimentos.dto.AlimentoDto;
import com.f_rafael.microservicio_alimentos.model.Alimento;
import com.f_rafael.microservicio_alimentos.repository.IAlimentoRepository;
import com.f_rafael.microservicio_alimentos.repository.IClasificacionClient;
import com.f_rafael.microservicio_alimentos.repository.IMarcaClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Component
public class AlimentoMapper {

    private IAlimentoRepository repository;
    private IClasificacionClient clasificacionClient;
    private IMarcaClient marcaClient;

    public AlimentoMapper(IAlimentoRepository repository, IClasificacionClient clasificacionClient, IMarcaClient marcaClient) {
        this.repository = repository;
        this.clasificacionClient = clasificacionClient;
        this.marcaClient = marcaClient;
    }

    public AlimentoDto obtenerDto(Alimento informacionAlimento){
        AlimentoDto dtoARetornar = new AlimentoDto(informacionAlimento.getId(),
                informacionAlimento.getNombre(),
                marcaClient.buscarPorId(informacionAlimento.getMarcaId()),
                clasificacionClient.buscarPorId(informacionAlimento.getClasificacionId()));

        return dtoARetornar;
    }
    
    public List<AlimentoDto> obtenerListaDeDtos(Collection<Alimento> informacionAlimentos){
        List<AlimentoDto> listaParaRetornar = new LinkedList<>();

        for(Alimento a : informacionAlimentos){
            listaParaRetornar.add(obtenerDto(a));
        }

        return listaParaRetornar;
    }
}
