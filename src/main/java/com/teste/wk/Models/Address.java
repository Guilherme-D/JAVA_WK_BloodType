package com.teste.wk.Models;

import com.google.common.base.Objects;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @NotNull(message = "Campo endereco não pode ser nulo")
    @NotEmpty(message = "Campo endereco não pode ser vazio")
    private String endereco;
    @NotNull(message = "Campo numero não pode ser vazio")
    private Integer numero;
    @NotNull(message = "Campo bairro não pode ser nulo")
    @NotEmpty(message = "Campo bairro não pode ser vazio")
    private String bairro;
    @NotNull(message = "Campo cidade não pode ser nulo")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cidade_id")
    private Cities cidade;
    @NotNull(message = "Campo estado não pode ser nulo")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "estado_id")
    private States estado;

    public Address(){}

    public Address(
            String endereco,
            @NotNull(message = "Campo numero não pode ser nulo")
            Integer numero,
            @NotNull(message = "Campo bairro não pode ser nulo")
            @NotEmpty(message = "Campo bairro não pode ser vazio")
            String bairro,
            @NotNull(message = "Campo cidade não pode ser nulo")
            @NotEmpty(message = "Campo cidade não pode ser vazio")
            Cities cidade,
            @NotNull(message = "Campo estado não pode ser nulo")
            @NotEmpty(message = "Campo estado não pode ser vazio")
            States estado) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cities getCidade() {
        return this.cidade;
    }

    public void setCidade(Cities cidade) {
        this.cidade = cidade;
    }

    public States getEstado() {
        return estado;
    }

    public void setEstado(States estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equal(id, address.id) && Objects.equal(endereco, address.endereco) && Objects.equal(numero, address.numero) && Objects.equal(bairro, address.bairro) && Objects.equal(cidade, address.cidade) && Objects.equal(estado, address.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, endereco, numero, bairro, cidade, estado);
    }
}
