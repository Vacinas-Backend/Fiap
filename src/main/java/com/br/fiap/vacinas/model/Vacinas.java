package com.br.fiap.vacinas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Vacinas {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private Long cpf;
    private LocalDateTime data_nasc;
    private LocalDateTime data_vac;
    private String dose;
    private String endereco;
    private String grupo_prioridade;
    private String nome;
    private String nome_mae;
    private String nome_pai;
    private String raca_cor;
    private String sexo;
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(LocalDateTime data_nasc) {
        this.data_nasc = data_nasc;
    }

    public LocalDateTime getData_vac() {
        return data_vac;
    }

    public void setData_vac(LocalDateTime data_vac) {
        this.data_vac = data_vac;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGrupo_prioridade() {
        return grupo_prioridade;
    }

    public void setGrupo_prioridade(String grupo_prioridade) {
        this.grupo_prioridade = grupo_prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getRaca_cor() {
        return raca_cor;
    }

    public void setRaca_cor(String raca_cor) {
        this.raca_cor = raca_cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
