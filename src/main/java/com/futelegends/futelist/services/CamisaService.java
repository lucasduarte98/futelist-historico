package com.futelegends.futelist.services;

import com.futelegends.futelist.dto.CamisaDTO;
import com.futelegends.futelist.dto.CamisaFullDTO;
import com.futelegends.futelist.entities.Camisa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.futelegends.futelist.repositories.CamisaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CamisaService {

    @Autowired
    private CamisaRepository camisaRepository;

    @Transactional (readOnly = true)
    public CamisaFullDTO findById(Long id){
        Camisa result = camisaRepository.findById(id).get();
        CamisaFullDTO dto = new CamisaFullDTO(result);
        return dto;

    }

    @Transactional (readOnly = true)
    public List<CamisaDTO> findAll() {
        List<Camisa> result = camisaRepository.findAll();
        return result.stream().map(x -> new CamisaDTO(x)).toList();


    }
}
