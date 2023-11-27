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

    public void deletar(String cpf) throws Exception {
        List<Map<String, String>> objServico = caddb.listarServicos(cpf);
        String id = servicoview.listarServicos(objServico);
        String retorno = caddb.deletarServico(id);
        System.out.println(retorno);
    }

    public void atualizar(int opcao, String cpf) throws Exception {
        List<Map<String, String>> objServico = caddb.listarServicos(cpf);
        String id = servicoview.listarServicos(objServico);
        String campo;
        switch (opcao) {
            case 1:
                campo = "area";
                break;
            case 2:
                campo = "desc_serv";
                break;
            case 3:
                campo = "cidade";
                break;
            case 4:
                campo = "bairro";
                break;
            case 5:
                campo = "tempo_ex";
                break;
            // Adicione os outros casos conforme necessário
            default:
                campo = "";
                System.out.println("Opcao invalida"); // Ou algum valor padrão, dependendo da lógica do seu programa
                break;
        }
        System.out.println("OK, em seguida digite sua atualização por gentileza:");
        String atualizacao = input.nextLine();
        String retorno = caddb.atualizarServico(id, campo, atualizacao);
        System.out.println(retorno);
    }
}
