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

    /**
     * Construtor da classe Servico.
     *
     * @param area Área de atuação do serviço.
     * @param descSer Descrição detalhada do serviço.
     * @param cidade Cidade onde o serviço será prestado.
     * @param bairro Bairro onde o serviço será prestado.
     * @param tempoEx Tempo de experiência necessário para realizar o serviço.
     * @param cpf CPF do prestador do serviço.
     */
    public Servico(String area, String descSer, String cidade, String bairro, String tempoEx, String cpf) {
        // Inicialização dos atributos com os valores passados como parâmetros.
        this.area = area;
        this.descSer = descSer;
        this.cidade = cidade;
        this.bairro = bairro;
        this.tempoEx = tempoEx;
        this.cpf = cpf;
    }

    // Métodos de acesso (getters e setters) para os atributos da classe
    public int getId() {
        return id;
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
