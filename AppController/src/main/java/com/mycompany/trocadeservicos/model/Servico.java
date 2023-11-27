/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.model;

/**
 *
 * @author Yasmin
 */
public class Servico {

    private String area;
    private String descSer;
    private String cidade;
    private String bairro;
    private String tempoEx;
    private String cpf;

    public Servico(String area, String descSer, String cidade, String bairro, String tempoEx, String cpf) {
        this.area = area;
        this.descSer = descSer;
        this.cidade = cidade;
        this.bairro = bairro;
        this.tempoEx = tempoEx;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescSer() {
        return descSer;
    }

    public void setDescSer(String descSer) {
        this.descSer = descSer;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTempoEx() {
        return tempoEx;
    }

    public void setTempoEx(String tempoEx) {
        this.tempoEx = tempoEx;
    }
}
