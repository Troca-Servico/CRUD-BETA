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
    private String instagram;
    private String facebook;
    private String linkedin;
    private String whatsapp;
    private String sexo;

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
    public Perfil(String nome, String sexo, int idade, String email, String cpf,
            String areasInteresse, String ftPerfil, String habilidades) {
        // Inicialização dos atributos com os valores passados como parâmetros.
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
        this.areasInteresse = areasInteresse;
        this.ftPerfil = ftPerfil;
        this.habilidades = habilidades;
        this.sexo = sexo;
    }

    // Métodos de acesso (getters e setters) para os atributos da classe
    /**
     * Obtém o CPF do usuário.
     *
     * @return O CPF do usuário.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do usuário.
     *
     * @param cpf O novo CPF do usuário.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    

    /**
     * Obtém a descrição dos serviços oferecidos pelo usuário.
     *
     * @return A descrição dos serviços.
     */
    public String getDescSer() {
        return descSer;
    }

    /**
     * Define a descrição dos serviços oferecidos pelo usuário.
     *
     * @param descSer A nova descrição dos serviços.
     */
    public void setDescSer(String descSer) {
        this.descSer = descSer;
    }

    /**
     * Obtém a cidade de residência do usuário.
     *
     * @return A cidade de residência do usuário.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define a cidade de residência do usuário.
     *
     * @param cidade A nova cidade de residência do usuário.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Obtém as áreas de interesse do usuário.
     *
     * @return As áreas de interesse do usuário.
     */
    public String getAreasInteresse() {
        return areasInteresse;
    }

    /**
     * Define as áreas de interesse do usuário.
     *
     * @param areasInteresse As novas áreas de interesse do usuário.
     */
    public void setAreasInteresse(String areasInteresse) {
        this.areasInteresse = areasInteresse;
    }

    /**
     * Obtém o bairro de residência do usuário.
     *
     * @return O bairro de residência do usuário.
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o bairro de residência do usuário.
     *
     * @param bairro O novo bairro de residência do usuário.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Obtém o tempo de experiência do usuário.
     *
     * @return O tempo de experiência do usuário.
     */
    public String getTempoEx() {
        return tempoEx;
    }

    /**
     * Define o tempo de experiência do usuário.
     *
     * @param tempoEx O novo tempo de experiência do usuário.
     */
    public void setTempoEx(String tempoEx) {
        this.tempoEx = tempoEx;
    }

    /**
     * Obtém o caminho ou identificador da foto de perfil do usuário.
     *
     * @return O caminho ou identificador da foto de perfil do usuário.
     */
    public String getFtPerfil() {
        return ftPerfil;
    }

    /**
     * Define o caminho ou identificador da foto de perfil do usuário.
     *
     * @param ftPerfil O novo caminho ou identificador da foto de perfil do
     * usuário.
     */
    public void setFtPerfil(String ftPerfil) {
        this.ftPerfil = ftPerfil;
    }

    /**
     * Obtém as habilidades do usuário.
     *
     * @return As habilidades do usuário.
     */
    public String getHabilidades() {
        return habilidades;
    }

    /**
     * Define as habilidades do usuário.
     *
     * @param habilidades As novas habilidades do usuário.
     */
    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    /**
     * Obtém o nome do usuário.
     *
     * @return O nome do usuário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do usuário.
     *
     * @param nome O novo nome do usuário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a idade do usuário.
     *
     * @return A idade do usuário.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do usuário.
     *
     * @param idade A nova idade do usuário.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Obtém o endereço de email do usuário.
     *
     * @return O endereço de email do usuário.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o endereço de email do usuário.
     *
     * @param email O novo endereço de email do usuário.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
