/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.model;

public class Perfil {

    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String descSer;
    private String cidade;
    private String bairro;
    private String areasInteresse;
    private String tempoEx;
    private String ftPerfil;
    private String habilidades;

    public Perfil(String nome, int idade, String email, String cpf, String descSer, String cidade, String bairro,
            String areasInteresse, String tempoEx, String ftPerfil, String habilidades) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
        this.descSer = descSer;
        this.cidade = cidade;
        this.bairro = bairro;
        this.areasInteresse = areasInteresse;
        this.tempoEx = tempoEx;
        this.ftPerfil = ftPerfil;
        this.habilidades = habilidades;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getAreasInteresse() {
        return areasInteresse;
    }

    public void setAreasInteresse(String areasInteresse) {
        this.areasInteresse = areasInteresse;
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

    public String getFtPerfil() {
        return ftPerfil;
    }

    public void setFtPerfil(String ftPerfil) {
        this.ftPerfil = ftPerfil;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}