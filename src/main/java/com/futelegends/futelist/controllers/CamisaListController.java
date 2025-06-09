package com.futelegends.futelist.controllers;

import com.futelegends.futelist.dto.CamisaDTO;
import com.futelegends.futelist.dto.CamisaFullDTO;
import com.futelegends.futelist.dto.CamisaListDTO;
import com.futelegends.futelist.services.CamisaListService;
import com.futelegends.futelist.services.CamisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class CamisaListController {

    @Autowired
    private CamisaListService camisaListService;


    @GetMapping
    public List<CamisaListDTO> findAll() {
        List<CamisaListDTO> result = camisaListService.findAll();
        return result;

    }

}
