/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.model;

/**
 *
 * @author Yasmin / Laryssa
 */
/**
 * A classe Servico representa um objeto que armazena informações sobre um
 * serviço na aplicação. Este objeto contém dados como área de atuação,
 * descrição do serviço, cidade, bairro, tempo de experiência necessário e CPF
 * do prestador do serviço.
 */
public class Servico {

    private String area;
    private String descSer;
    private String cidade;
    private String bairro;
    private String tempoEx;
    private String cpf;
    private int id;
    private String whatsapp;
    private String linkedin;
    private String instagram;
    private String facebook;

    /**
     * Construtor da classe Servico.
     *
     * @param area Área de atuação do serviço.
     * @param descSer Descrição detalhada do serviço.
     * @param cidade Cidade onde o serviço será prestado.
     * @param bairro Bairro onde o serviço será prestado.
     * @param tempoEx Tempo de experiência necessário para realizar o serviço.
     * @param cpf CPF do prestador do serviço.
     * @param instagram Perfil do prestador no Instagram.
     * @param facebook Perfil do prestador no Facebook.
     * @param linkedin Perfil do prestador no LinkedIn.
     * @param whatsapp Número de WhatsApp do prestador.
     */
    public Servico(String area, String descSer, String cidade, String bairro, String tempoEx, String cpf, String instagram, String facebook, String linkedin, String whatsapp) {
        // Inicialização dos atributos com os valores passados como parâmetros.
        this.area = area;
        this.descSer = descSer;
        this.cidade = cidade;
        this.bairro = bairro;
        this.tempoEx = tempoEx;
        this.cpf = cpf;
        this.instagram = instagram;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.whatsapp = whatsapp;
    }

    // Métodos de acesso (getters e setters) para os atributos da classe
    /**
     * Obtém o ID do serviço.
     *
     * @return O ID do serviço.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o CPF do prestador do serviço.
     *
     * @return O CPF do prestador do serviço.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do prestador do serviço.
     *
     * @param cpf O novo CPF do prestador do serviço.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém a área de atuação do serviço.
     *
     * @return A área de atuação do serviço.
     */
    public String getArea() {
        return area;
    }

    /**
     * Define a área de atuação do serviço.
     *
     * @param area A nova área de atuação do serviço.
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Obtém a descrição detalhada do serviço.
     *
     * @return A descrição detalhada do serviço.
     */
    public String getDescSer() {
        return descSer;
    }

    /**
     * Define a descrição detalhada do serviço.
     *
     * @param descSer A nova descrição detalhada do serviço.
     */
    public void setDescSer(String descSer) {
        this.descSer = descSer;
    }

    /**
     * Obtém a cidade onde o serviço será prestado.
     *
     * @return A cidade onde o serviço será prestado.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define a cidade onde o serviço será prestado.
     *
     * @param cidade A nova cidade onde o serviço será prestado.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Obtém o bairro onde o serviço será prestado.
     *
     * @return O bairro onde o serviço será prestado.
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o bairro onde o serviço será prestado.
     *
     * @param bairro O novo bairro onde o serviço será prestado.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Obtém o tempo de experiência necessário para realizar o serviço.
     *
     * @return O tempo de experiência necessário para realizar o serviço.
     */
    public String getTempoEx() {
        return tempoEx;
    }

    /**
     * Define o tempo de experiência necessário para realizar o serviço.
     *
     * @param tempoEx O novo tempo de experiência necessário para realizar o
     * serviço.
     */
    public void setTempoEx(String tempoEx) {
        this.tempoEx = tempoEx;
    }

    /**
     * Define o link do perfil do Instagram do prestador de serviço.
     *
     * @param link Link do perfil do Instagram.
     */
    public void setInstagram(String link) {
        this.instagram = link;
    }

    /**
     * Obtém o link do perfil do Instagram do prestador de serviço.
     *
     * @return Link do perfil do Instagram.
     */
    public String getInstagram() {
        return instagram;
    }

    /**
     * Define o link do perfil do Facebook do prestador de serviço.
     *
     * @param link Link do perfil do Facebook.
     */
    public void setFacebook(String link) {
        this.facebook = link;
    }

    /**
     * Obtém o link do perfil do Facebook do prestador de serviço.
     *
     * @return Link do perfil do Facebook.
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * Define o link do perfil do LinkedIn do prestador de serviço.
     *
     * @param link Link do perfil do LinkedIn.
     */
    public void setLinkedin(String link) {
        this.linkedin = link;
    }

    /**
     * Obtém o link do perfil do LinkedIn do prestador de serviço.
     *
     * @return Link do perfil do LinkedIn.
     */
    public String getLinkedin() {
        return linkedin;
    }

    /**
     * Define o número de WhatsApp do prestador de serviço.
     *
     * @param link Número de WhatsApp.
     */
    public void setWhatsapp(String link) {
        this.whatsapp = link;
    }

    /**
     * Obtém o número de WhatsApp do prestador de serviço.
     *
     * @return Número de WhatsApp.
     */
    public String getWhatsapp() {
        return whatsapp;
    }
}
