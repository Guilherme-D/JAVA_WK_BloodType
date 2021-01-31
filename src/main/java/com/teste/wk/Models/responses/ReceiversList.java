package com.teste.wk.Models.responses;

import com.google.common.base.Objects;
import com.teste.wk.Models.BloodType;

import java.util.List;

public class ReceiversList {
    String tipo;
    Long total_doadores;
    List<Receivers> receptores;

    public ReceiversList() {
    }

    public ReceiversList(String tipo, Long total_doadores, List<Receivers> receptores) {
        this.tipo = tipo;
        this.total_doadores = total_doadores;
        this.receptores = receptores;
    }

    public Long getTotal_doadores() {
        return total_doadores;
    }

    public void setTotal_doadores(Long total_doadores) {
        this.total_doadores = total_doadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Receivers> getReceptores() {
        return receptores;
    }

    public void setReceptores(List<Receivers> receptores) {
        this.receptores = receptores;
    }

    public static ReceiversList toReceiversList(BloodType bloodType, Receivers receiver){
        System.out.println("asd");
        return new ReceiversList();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceiversList that = (ReceiversList) o;
        return Objects.equal(tipo, that.tipo) && Objects.equal(receptores, that.receptores);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipo, receptores);
    }
}
