package com.futelegends.futelist.services;

import com.futelegends.futelist.dto.CamisaDTO;
import com.futelegends.futelist.dto.CamisaFullDTO;
import com.futelegends.futelist.dto.CamisaListDTO;
import com.futelegends.futelist.entities.Camisa;
import com.futelegends.futelist.entities.CamisaList;
import com.futelegends.futelist.repositories.CamisaListRepository;
import com.futelegends.futelist.repositories.CamisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class CamisaListService {

    @Autowired
    private CamisaListRepository camisaListRepository;


    @Transactional (readOnly = true)
    public List<CamisaListDTO> findAll() {
        List<CamisaList> result = camisaListRepository.findAll();
        return result.stream().map(x -> new CamisaListDTO(x)).toList();


    }
}
