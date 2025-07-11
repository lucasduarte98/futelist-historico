package com.futelegends.futelist.controllers;

import com.futelegends.futelist.dto.CamisaDTO;
import com.futelegends.futelist.dto.CamisaFullDTO;
import com.futelegends.futelist.dto.CamisaListDTO;
import com.futelegends.futelist.dto.MovDTO;
import com.futelegends.futelist.services.CamisaListService;
import com.futelegends.futelist.services.CamisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class CamisaListController {

    @Autowired
    private CamisaListService camisaListService;

    @Autowired
    private CamisaService camisaService;


    @GetMapping
    public List<CamisaListDTO> findAll() {
        List<CamisaListDTO> result = camisaListService.findAll();
        return result;

    }

    @GetMapping(value = "/{listId}/games")
    public List<CamisaDTO> findByList(@PathVariable Long listId) {
        List<CamisaDTO> result = camisaService.findByList(listId);
        return result;

    }

    @PostMapping(value = "/{listId}/mov")
    public void move(@PathVariable Long listId, @RequestBody MovDTO body) {
        camisaListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());

    }


}
