package com.futelegends.futelist.dto;

import com.futelegends.futelist.entities.CamisaList;

public class CamisaListDTO {

    private Long id;
    private String name;

    public CamisaListDTO(){

    }

    public CamisaListDTO(CamisaList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
