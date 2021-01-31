package com.teste.wk.Models.responses;

import com.google.common.base.Objects;

public class AgeByBloodResponse {
    String tipo_sanguineo;
    Double media_idade;

    public AgeByBloodResponse() {
    }

    public AgeByBloodResponse(String tipo_sanguineo, Double media_idade) {
        this.tipo_sanguineo = tipo_sanguineo;
        this.media_idade = media_idade;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public Double getMedia_idade() {
        return media_idade;
    }

    public void setMedia_idade(Double media_idade) {
        this.media_idade = media_idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgeByBloodResponse that = (AgeByBloodResponse) o;
        return Objects.equal(tipo_sanguineo, that.tipo_sanguineo) && Objects.equal(media_idade, that.media_idade);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipo_sanguineo, media_idade);
    }
}
