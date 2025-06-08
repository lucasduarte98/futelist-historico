package com.futelegends.futelist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class CamisaEntryPK {

    @ManyToOne
    @JoinColumn(name = "camisa_id")
    private Camisa camisa;

    @ManyToOne
    @JoinColumn(name = "lista_id")
    private CamisaList list;

    public CamisaEntryPK() {

    }

    public CamisaEntryPK(Camisa camisa, CamisaList list) {
        this.camisa = camisa;
        this.list = list;
    }

    public Camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    public CamisaList getList() {
        return list;
    }

    public void setList(CamisaList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CamisaEntryPK that = (CamisaEntryPK) o;
        return Objects.equals(camisa, that.camisa) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(camisa, list);
    }
}
