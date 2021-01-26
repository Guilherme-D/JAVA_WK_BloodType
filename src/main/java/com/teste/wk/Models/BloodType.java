package com.teste.wk.Models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "blood_type")
public class BloodType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull(message = "Campo tipo não pode ser nulo")
    @NotEmpty(message = "Campo tipo não pode ser vazio")
    private String tipo;

    @NotNull(message = "Campo doaPara não pode ser nulo")
    @NotEmpty(message = "Campo doaPara não pode ser vazio")
    private String doaPara;

    @NotNull(message = "Campo recebeDe não pode ser nulo")
    @NotEmpty(message = "Campo recebeDe não pode ser vazio")
    private String recebeDe;

    public BloodType(){}

    public BloodType(
            @NotNull(message = "Campo doaPara não pode ser nulo")
            @NotEmpty(message = "Campo doaPara não pode ser vazio")
            String tipo,
            @NotNull(message = "Campo doaPara não pode ser nulo")
            @NotEmpty(message = "Campo doaPara não pode ser vazio")
            String doaPara,
            @NotNull(message = "Campo recebeDe não pode ser nulo")
            @NotEmpty(message = "Campo recebeDe não pode ser vazio")
            String recebeDe) {
        this.tipo = tipo;
        this.doaPara = doaPara;
        this.recebeDe = recebeDe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDoaPara() {
        return doaPara;
    }

    public void setDoaPara(String doaPara) {
        this.doaPara = doaPara;
    }

    public String getRecebeDe() {
        return recebeDe;
    }

    public void setRecebeDe(String recebeDe) {
        this.recebeDe = recebeDe;
    }
}
