/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.model;

/**
 * A classe Perfil representa um objeto que armazena informações sobre um
 * usuário na aplicação. Este objeto contém dados como nome, idade, CPF, email,
 * descrição de serviços, cidade, bairro, áreas de interesse, tempo de
 * experiência, foto do perfil e habilidades.
 */
public class Perfil {

    // Atributos da classe
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

    /**
     * Construtor da classe Perfil.
     *
     * @param nome Nome do usuário.
     * @param idade Idade do usuário.
     * @param email Endereço de email do usuário.
     * @param cpf Número de CPF do usuário.
     * @param descSer Descrição dos serviços oferecidos pelo usuário.
     * @param cidade Cidade de residência do usuário.
     * @param bairro Bairro de residência do usuário.
     * @param areasInteresse Áreas de interesse do usuário.
     * @param tempoEx Tempo de experiência do usuário.
     * @param ftPerfil Caminho ou identificador da foto de perfil do usuário.
     * @param habilidades Habilidades ou competências do usuário.
     */
    public Perfil(String nome, int idade, String email, String cpf, String descSer, String cidade, String bairro,
            String areasInteresse, String tempoEx, String ftPerfil, String habilidades) {
        // Inicialização dos atributos com os valores passados como parâmetros.
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

    // Métodos de acesso (getters e setters) para os atributos da classe
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
