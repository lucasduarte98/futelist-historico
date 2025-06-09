package com.futelegends.futelist.controllers;

import com.futelegends.futelist.dto.CamisaDTO;
import com.futelegends.futelist.dto.CamisaFullDTO;
import com.futelegends.futelist.entities.Camisa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.futelegends.futelist.services.CamisaService;

import java.util.List;

@RestController
@RequestMapping(value = "/camisas")
public class CamisaController {

    @Autowired
    private CamisaService camisaService;


    @GetMapping(value = "/{id}")
    public CamisaFullDTO findById(@PathVariable Long id){
       CamisaFullDTO result = camisaService.findById(id);
        return result;

    }

    @GetMapping
    public List<CamisaDTO> findAll() {
        List<CamisaDTO> result = camisaService.findAll();
        return result;

    }

}
