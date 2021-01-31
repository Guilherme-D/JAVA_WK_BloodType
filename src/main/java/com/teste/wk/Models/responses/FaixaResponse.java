package com.teste.wk.Models.responses;

import com.google.common.base.Objects;

public class FaixaResponse {
    String faixa;
    Double media_imc;

    public FaixaResponse() {
    }

    public FaixaResponse(String faixa, Double media_imc) {
        this.faixa = faixa;
        this.media_imc = media_imc;
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }

    public Double getmedia_imc() {
        return media_imc;
    }

    public void setmedia_imc(Double media_imc) {
        this.media_imc = media_imc;
    }

    public static FaixaResponse objectToFaixaResponse(Object object){
        return null;// new FaixaResponse(object.get(0)[0], Double.parseInt(object[1]));
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FaixaResponse that = (FaixaResponse) o;
        return Objects.equal(faixa, that.faixa) && Objects.equal(media_imc, that.media_imc);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(faixa, media_imc);
    }
}
