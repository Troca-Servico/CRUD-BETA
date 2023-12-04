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
 * Controlador para operações relacionadas à troca de serviços. Gerencia
 * interações entre a camada de visão (ServicoView) e a camada de dados
 * (DbServico). Utiliza um Scanner para entrada do usuário.
 */
public class TrocaController {

    Scanner input = new Scanner(System.in);
    DbServico caddb = new DbServico();
    ServicoView servicoview = new ServicoView();

    /**
     * Deleta um serviço associado a um perfil com base no CPF fornecido.
     *
     * @param cpf O CPF do perfil associado aos serviços.
     * @throws Exception Se ocorrer um erro durante o processo de deleção.
     */
    public void deletar(String cpf) throws Exception {
        // Lista os serviços associados ao perfil com o CPF fornecido.
        List<Map<String, String>> objServico = caddb.listarServicos(cpf);
        // Solicita ao usuário selecionar o serviço a ser deletado.
        String id = servicoview.listarServicos(objServico);
        // Deleta o serviço com o ID fornecido.
        String retorno = caddb.deletarServico(id);
        // Exibe o resultado da deleção.
        System.out.println(retorno);
    }
}
