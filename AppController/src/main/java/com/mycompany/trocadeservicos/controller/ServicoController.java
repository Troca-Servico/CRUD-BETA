/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.db.DbServico;
import com.mycompany.trocadeservicos.model.Servico;
import com.mycompany.trocadeservicos.view.PerfilView;
import java.util.Scanner;

public class ServicoController {

    Scanner input = new Scanner(System.in);
    DbServico caddb = new DbServico();

    public void cadastrar(Servico cadastro) throws Exception {
        caddb.salvarCadastro(cadastro);
    }
}
