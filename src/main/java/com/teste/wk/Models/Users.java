package com.teste.wk.Models;

import com.google.common.base.Objects;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @NotNull(message = "Campo nome não pode ser nulo")
    @NotEmpty(message = "Campo nome não pode ser vazio")
    private  String nome;

    @NotNull(message = "Campo cpf não pode ser nulo")
    @NotEmpty(message = "Campo cpf não pode ser vazio")
    private  String cpf;

    @NotNull(message = "Campo rg não pode ser nulo")
    @NotEmpty(message = "Campo rg não pode ser vazio")
    private  String rg;

    @NotNull(message = "Campo dataNascimento não pode ser nulo")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @NotNull(message = "Campo sexo não pode ser nulo")
    private  Character sexo;

    @NotNull(message = "Campo mae não pode ser nulo")
    @NotEmpty(message = "Campo mae não pode ser vazio")
    private  String mae;

    @NotNull(message = "Campo pai não pode ser nulo")
    @NotEmpty(message = "Campo pai não pode ser vazio")
    private  String pai;

    @NotNull(message = "Campo email não pode ser nulo")
    @NotEmpty(message = "Campo email não pode ser vazio")
    private  String email;

    @NotNull(message = "Campo cep não pode ser nulo")
    @NotEmpty(message = "Campo cep não pode ser vazio")
    private  String cep;

    @NotNull(message = "Campo celular não pode ser nulo")
    @NotEmpty(message = "Campo celular não pode ser vazio")
    private  String celular;

    @NotNull(message = "Campo celular não pode ser nulo")
    @NotEmpty(message = "Campo celular não pode ser vazio")
    private  String telefoneFixo;

    @NotNull(message = "Campo altura não pode ser nulo")
    @NotEmpty(message = "Campo altura não pode ser vazio")
    private  String altura;

    @NotNull(message = "Campo peso não pode ser nulo")
    @NotEmpty(message = "Campo peso não pode ser vazio")
    private  String peso;

    @NotNull(message = "Campo tipoSanguineo não pode ser nulo")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "tipo_sanguineo_id")
    private  BloodType tipoSanguineo;

    @NotNull(message = "Campo endereco não pode ser nulo")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Address endereco;

    public Users(){};

    public Users(
    @NotNull(message = "Campo nome não pode ser nulo")
    @NotEmpty(message = "Campo nome não pode ser vazio")
    String nome,
    @NotNull(message = "Campo cpf não pode ser nulo")
    @NotEmpty(message = "Campo cpf não pode ser vazio")
    String cpf,
    @NotNull(message = "Campo rg não pode ser nulo")
    @NotEmpty(message = "Campo rg não pode ser vazio")
    String rg,
    @NotNull(message = "Campo dataNascimento não pode ser nulo")
    @NotEmpty(message = "Campo dataNascimento não pode ser vazio")
    LocalDate dataNascimento,
    @NotNull(message = "Campo sexo não pode ser nulo")
    @NotEmpty(message = "Campo sexo não pode ser vazio")
    Character sexo,
    @NotNull(message = "Campo mae não pode ser nulo")
    @NotEmpty(message = "Campo mae não pode ser vazio")
    String mae,
    @NotNull(message = "Campo pai não pode ser nulo")
    @NotEmpty(message = "Campo pai não pode ser vazio")
    String pai,
    @NotNull(message = "Campo email não pode ser nulo")
    @NotEmpty(message = "Campo email não pode ser vazio")
    String email,
    @NotNull(message = "Campo cep não pode ser nulo")
    @NotEmpty(message = "Campo cep não pode ser vazio")
    String cep,
    @NotNull(message = "Campo celular não pode ser nulo")
    @NotEmpty(message = "Campo celular não pode ser vazio")
    String telefoneFixo,
    @NotNull(message = "Campo celular não pode ser nulo")
    @NotEmpty(message = "Campo celular não pode ser vazio")
    String celular,
    @NotNull(message = "Campo altura não pode ser nulo")
    @NotEmpty(message = "Campo altura não pode ser vazio")
    String altura,
    @NotNull(message = "Campo peso não pode ser nulo")
    @NotEmpty(message = "Campo peso não pode ser vazio")
    String peso,
    @NotNull(message = "Campo tipoSanguineo não pode ser nulo")
    BloodType tipoSanguineo,
    @NotNull(message = "Campo endereco não pode ser nulo")
    Address endereco
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.mae = mae;
        this.pai = pai;
        this.email = email;
        this.cep = cep;
        this.telefoneFixo = telefoneFixo;
        this.celular = celular;
        this.altura = altura;
        this.peso = peso;
        this.tipoSanguineo = tipoSanguineo;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
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

    public BloodType getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(BloodType tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Address getEndereco() {
        return endereco;
    }

    public void setEndereco(Address endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equal(id, users.id) && Objects.equal(nome, users.nome) && Objects.equal(cpf, users.cpf) && Objects.equal(rg, users.rg) && Objects.equal(dataNascimento, users.dataNascimento) && Objects.equal(sexo, users.sexo) && Objects.equal(mae, users.mae) && Objects.equal(pai, users.pai) && Objects.equal(email, users.email) && Objects.equal(cep, users.cep) && Objects.equal(celular, users.celular) && Objects.equal(telefoneFixo, users.telefoneFixo) && Objects.equal(altura, users.altura) && Objects.equal(peso, users.peso) && Objects.equal(tipoSanguineo, users.tipoSanguineo) && Objects.equal(endereco, users.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, nome, cpf, rg, dataNascimento, sexo, mae, pai, email, cep, celular, telefoneFixo, altura, peso, tipoSanguineo, endereco);
    }
}
