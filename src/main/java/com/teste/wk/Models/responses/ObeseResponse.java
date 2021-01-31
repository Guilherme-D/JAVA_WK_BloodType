package com.teste.wk.Models.responses;

import com.google.common.base.Objects;

public class ObeseResponse {
    Character sexo;
    Double porcentagem;

    public ObeseResponse() {
    }

    public ObeseResponse(Character sexo, Double porcentagem) {
        this.sexo = sexo;
        this.porcentagem = porcentagem;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObeseResponse that = (ObeseResponse) o;
        return Objects.equal(sexo, that.sexo) && Objects.equal(porcentagem, that.porcentagem);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sexo, porcentagem);
    }
}
