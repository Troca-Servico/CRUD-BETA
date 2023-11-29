/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Classe ServicoController é responsável por controlar as operações relacionadas aos serviços,
 * interagindo com o banco de dados (DbServico) e a visualização (ServicoView).
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.db.DbServico;
import com.mycompany.trocadeservicos.model.Servico;
import com.mycompany.trocadeservicos.view.ServicoView;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

public class ServicoController {

    // Scanner para entrada de dados do usuário.
    Scanner input = new Scanner(System.in);

    // Instâncias do banco de dados e da visualização necessárias para as operações do ServicoController.
    DbServico caddb = new DbServico();
    ServicoView servicoview = new ServicoView();

    /**
     * Método para cadastrar um novo serviço.
     *
     * @param cadastro Objeto Servico contendo informações do serviço a ser
     * cadastrado.
     * @throws Exception Exceção geral que pode ser lançada por operações
     * específicas.
     */
    public void cadastrar(Servico cadastro) throws Exception {

        // Chama o método do DbServico para salvar o serviço no banco de dados.
        caddb.salvarCadastro(cadastro);
    }

    /**
     * Método para visualizar os serviços disponíveis em uma área específica.
     *
     * @param area Área para a qual os serviços serão visualizados.
     * @throws Exception Exceção geral que pode ser lançada por operações
     * específicas.
     */
    public void visualizar(String area) throws Exception {

        // Busca os serviços no banco de dados e exibe suas informações usando a ServicoView.
        List<Servico> objServico = caddb.buscarServicos(area);
        servicoview.mostrarServicos(objServico);
    }

    /**
     * Método para deletar um serviço com base no CPF do prestador.
     *
     * @param cpf CPF do prestador do serviço a ser deletado.
     * @throws Exception Exceção geral que pode ser lançada por operações
     * específicas.
     */
    public void deletar(String cpf) throws Exception {

        // Lista os serviços do prestador, permite ao usuário escolher um para deletar e realiza a operação.
        List<Map<String, String>> objServico = caddb.listarServicos(cpf);
        String id = servicoview.listarServicos(objServico);
        String retorno = caddb.deletarServico(id);
        System.out.println(retorno);
    }

    /**
     * Método para avaliar um serviço com base no CPF do prestador.
     *
     * @param cpf CPF do prestador do serviço a ser avaliado.
     * @throws Exception Exceção geral que pode ser lançada por operações
     * específicas.
     */
    public void avaliar(String cpf) throws Exception {

        // Lista os serviços do prestador, permite ao usuário escolher um para avaliar e realiza a operação.
        List<Map<String, String>> objServico = caddb.listarPerfis(cpf);
        String id = servicoview.listarPerfis(objServico);
        System.out.println("OK, de 0 a 10 qual é a sua avaliacao?:");
        int atualizacao = input.nextInt();
        String retorno = caddb.avaliarPerfil(id, atualizacao);
        System.out.println(retorno);
    }

    /**
     * Método para atualizar informações de um serviço com base na opção
     * escolhida pelo usuário.
     *
     * @param opcao Número correspondente à informação que será atualizada.
     * @param cpf CPF do prestador do serviço a ser atualizado.
     * @throws Exception Exceção geral que pode ser lançada por operações
     * específicas.
     */
    public void atualizar(int opcao, String cpf) throws Exception {

        // Lista os serviços do prestador, permite ao usuário escolher um para atualizar e realiza a operação.
        List<Map<String, String>> objServico = caddb.listarServicos(cpf);
        String id = servicoview.listarServicos(objServico);

        // Mapeia a opção escolhida para o campo correspondente no serviço.
        String campo;
        switch (opcao) {
            // Adicione os casos para as opções restantes conforme necessário.
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

        // Solicita ao usuário a atualização para o campo escolhido.
        System.out.println("OK, em seguida digite sua atualização por gentileza:");
        String atualizacao = input.nextLine();

        // Chama o método do DbServico para realizar a atualização e exibe o retorno.
        String retorno = caddb.atualizarServico(id, campo, atualizacao);
        System.out.println(retorno);
    }
}
