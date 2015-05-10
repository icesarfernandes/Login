package com.italocesarfernandes.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Consulta implements Serializable {
    private int id;
    private String descricao;
    private Date dataMarcacao;
    private Date dataConsulta;
    private CartaoSUS cartaoSus;
    private Medico medico;
    private US us;
    
    public Consulta(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataMarcacao() {
        return dataMarcacao;
    }

    public void setDataMarcacao(Date dataMarcacao) {
        this.dataMarcacao = dataMarcacao;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public CartaoSUS getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(CartaoSUS cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public US getUs() {
        return us;
    }

    public void setUs(US us) {
        this.us = us;
    }
    
    
    
}
