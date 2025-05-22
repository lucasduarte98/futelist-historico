package com.futelegends.futelist.controllers;

import com.futelegends.futelist.dto.CamisaDTO;
import com.futelegends.futelist.entities.Camisa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.futelegends.futelist.services.CamisaService;

import java.util.List;

@RestController
@RequestMapping(value = "/camisas")
public class CamisaController {

    @Autowired
    private CamisaService camisaService;

    @GetMapping
    public List<CamisaDTO> findAll() {
        List<CamisaDTO> result = camisaService.findAll();
        return result;

    }

}
