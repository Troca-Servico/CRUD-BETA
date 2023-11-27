/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.db.DbServico;
import com.mycompany.trocadeservicos.model.Servico;
import com.mycompany.trocadeservicos.view.ServicoView;
import java.util.List;
import java.util.Scanner;

public class ServicoController {

    Scanner input = new Scanner(System.in);
    DbServico caddb = new DbServico();
    ServicoView servicoview = new ServicoView();

    public void cadastrar(Servico cadastro) throws Exception {
        caddb.salvarCadastro(cadastro);
    }

    public void visualizar(String area) throws Exception {
        List<Servico> objServico = caddb.buscarServicos(area);
        servicoview.mostrarServicos(objServico);
    }
}
