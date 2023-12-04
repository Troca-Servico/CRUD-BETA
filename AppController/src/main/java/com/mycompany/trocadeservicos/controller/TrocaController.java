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
import java.util.Map;

/**
 *
 * @author Yasmin
 */
public class TrocaController {

    Scanner input = new Scanner(System.in);
    DbServico caddb = new DbServico();
    ServicoView servicoview = new ServicoView();

    public void deletar(String cpf) throws Exception {
        List<Map<String, String>> objServico = caddb.listarServicos(cpf);
        String id = servicoview.listarServicos(objServico);
        String retorno = caddb.deletarServico(id);
        System.out.println(retorno);
    }
}
