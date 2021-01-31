package com.teste.wk.Models.responses;

import com.google.common.base.Objects;

public class Receivers {
    String tipo;
    Long quantidade;

    public Receivers() {
    }

    public Receivers(String tipo, Long quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receivers receivers = (Receivers) o;
        return Objects.equal(tipo, receivers.tipo) && Objects.equal(quantidade, receivers.quantidade);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipo, quantidade);
    }
}
