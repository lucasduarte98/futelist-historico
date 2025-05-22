package com.futelegends.futelist.services;

import com.futelegends.futelist.dto.CamisaDTO;
import com.futelegends.futelist.entities.Camisa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.futelegends.futelist.repositories.CamisaRepository;

import java.util.List;

@Component
public class CamisaService {

    @Autowired
    private CamisaRepository camisaRepository;

    public List<CamisaDTO> findAll() {
        List<Camisa> result = camisaRepository.findAll();
        return result.stream().map(x -> new CamisaDTO(x)).toList();


    }
}
