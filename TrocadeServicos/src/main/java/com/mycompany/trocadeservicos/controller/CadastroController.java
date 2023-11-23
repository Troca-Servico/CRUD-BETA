/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.db.DbCadastro;

public class CadastroController {
     DbCadastro caddb = new DbCadastro();

    public void cadastrar(String nome, int idade, String email, String cpf) throws Exception {
        caddb.salvarCadastro(nome, idade, email, cpf);

        /*
        boolean status = false;
        this.cadastro = (Cadastro) cadastroView.inputData();
        if (this.cadastro != null) {
            DbCadastro.salvarCadastro(this.cadastro);
            status = true;
        }
        return status;
        */
    }

       
}
