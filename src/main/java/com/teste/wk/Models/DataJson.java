package com.teste.wk.Models;

import com.google.common.base.Objects;

public class DataJson {
    private String nome;
    private String cpf;
    private String rg;
    private String data_nasc;
    private String sexo;
    private String mae;
    private String pai;
    private String email;
    private String cep;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone_fixo;
    private String celular;
    private String altura;
    private String peso;
    private String tipo_sanguineo;

    public DataJson(){}

    public DataJson(String nome, 
                    String cpf,
                    String rg,
                    String data_nasc,
                    String sexo,
                    String mae,
                    String pai,
                    String email,
                    String cep,
                    String endereco,
                    String numero,
                    String bairro,
                    String cidade,
                    String estado,
                    String telefone_fixo,
                    String celular,
                    String altura,
                    String peso,
                    String tipo_sanguineo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.mae = mae;
        this.pai = pai;
        this.email = email;
        this.cep = cep;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone_fixo = telefone_fixo;
        this.celular = celular;
        this.altura = altura;
        this.peso = peso;
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone_fixo() {
        return telefone_fixo;
    }

    public void setTelefone_fixo(String telefone_fixo) {
        this.telefone_fixo = telefone_fixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataJson dataJson = (DataJson) o;
        return Objects.equal(nome, dataJson.nome) && Objects.equal(cpf, dataJson.cpf) && Objects.equal(rg, dataJson.rg) && Objects.equal(data_nasc, dataJson.data_nasc) && Objects.equal(sexo, dataJson.sexo) && Objects.equal(mae, dataJson.mae) && Objects.equal(pai, dataJson.pai) && Objects.equal(email, dataJson.email) && Objects.equal(cep, dataJson.cep) && Objects.equal(endereco, dataJson.endereco) && Objects.equal(numero, dataJson.numero) && Objects.equal(bairro, dataJson.bairro) && Objects.equal(cidade, dataJson.cidade) && Objects.equal(estado, dataJson.estado) && Objects.equal(telefone_fixo, dataJson.telefone_fixo) && Objects.equal(celular, dataJson.celular) && Objects.equal(altura, dataJson.altura) && Objects.equal(peso, dataJson.peso) && Objects.equal(tipo_sanguineo, dataJson.tipo_sanguineo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome, cpf, rg, data_nasc, sexo, mae, pai, email, cep, endereco, numero, bairro, cidade, estado, telefone_fixo, celular, altura, peso, tipo_sanguineo);
    }
}
