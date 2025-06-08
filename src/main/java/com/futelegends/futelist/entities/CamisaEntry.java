package com.futelegends.futelist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table (name = "tb_camisaentry")
public class CamisaEntry {

   @EmbeddedId
   private CamisaEntryPK id = new CamisaEntryPK();

    private Integer position;

    public CamisaEntry(){

    }

    public CamisaEntry(Camisa camisa, CamisaList list, Integer position) {
        id.setCamisa(camisa);
        id.setList(list);
        this.position = position;
    }

    public CamisaEntryPK getId() {
        return id;
    }

    public void setId(CamisaEntryPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CamisaEntry that = (CamisaEntry) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

