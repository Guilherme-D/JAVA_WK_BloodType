package com.teste.wk.Models.requests;

import com.google.common.base.Objects;

public class OrderByStateRequest {
    Long total;
    String estado;

    public OrderByStateRequest() {
    }

    public OrderByStateRequest(Long total, String estado) {
        this.total = total;
        this.estado = estado;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderByStateRequest that = (OrderByStateRequest) o;
        return Objects.equal(total, that.total) && Objects.equal(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(total, estado);
    }
}
