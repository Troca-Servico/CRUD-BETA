/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.model.Perfil;
import com.mycompany.trocadeservicos.db.DbPerfil;
import com.mycompany.trocadeservicos.view.PerfilView;

public class PerfilController {

    DbPerfil caddb = new DbPerfil();
    PerfilView perfilview = new PerfilView();

    public void cadastrar(Perfil cadastro) throws Exception {
        caddb.salvarCadastro(cadastro);
    }

    public void visualizar(String cpf) throws Exception {
        Perfil objPerfil = caddb.buscarPerfil(cpf);
        perfilview.mostrarInfosPerfil(objPerfil);
    }
}