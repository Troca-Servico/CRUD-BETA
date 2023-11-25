/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.model.Cadastro;
import com.mycompany.trocadeservicos.db.DbCadastro;

public class CadastroController {

    DbCadastro caddb = new DbCadastro();

    public void cadastrar(Cadastro cadastro) throws Exception {
        caddb.salvarCadastro(cadastro);
    }

}
