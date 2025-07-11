package com.futelegends.futelist.dto;

import com.futelegends.futelist.CamisaProjection;
import com.futelegends.futelist.entities.Camisa;
import jakarta.persistence.Column;

public class CamisaDTO {

    private Long id;
    private String title;
    private Integer year;
    private String club;
    private String imgUrl;
    private String shortDescription;

    public CamisaDTO(){

    }

    public CamisaDTO(Camisa entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        club = entity.getClub();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public CamisaDTO(CamisaProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getClub() {
        return club;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
