/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.model;

import com.mycompany.trocadeservicos.controller.CadastroController;
import com.mycompany.trocadeservicos.db.DbCadastro;


public class Cadastro {
  private String nome;
    private int idade;
    private String cpf;
    private String email;
    
    CadastroController cadcont = new CadastroController();

    public void cadastro(String nome, int idade, String email, String cpf) throws Exception {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
        
        cadcont.cadastrar(nome, idade, email, cpf);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

