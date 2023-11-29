/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Classe PerfilController é responsável por controlar as operações relacionadas aos perfis,
 * interagindo com o banco de dados (DbPerfil) e a visualização (PerfilView).
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.model.Perfil;
import com.mycompany.trocadeservicos.db.DbPerfil;
import com.mycompany.trocadeservicos.view.PerfilView;
import java.util.Scanner;

public class PerfilController {

    // Scanner para entrada de dados do usuário.
    Scanner input = new Scanner(System.in);

    // Instâncias do banco de dados e da visualização necessárias para as operações do PerfilController.
    DbPerfil caddb = new DbPerfil();
    PerfilView perfilview = new PerfilView();

    /**
     * Método para cadastrar um novo perfil.
     *
     * @param cadastro Objeto Perfil contendo informações do perfil a ser
     * cadastrado.
     * @throws Exception Exceção geral que pode ser lançada por operações
     * específicas.
     */
    public void cadastrar(Perfil cadastro) throws Exception {
        // Chama o método do DbPerfil para salvar o perfil no banco de dados.
        caddb.salvarCadastro(cadastro);
    }

    /**
     * Método para visualizar as informações de um perfil com base no CPF.
     *
     * @param cpf CPF do perfil a ser visualizado.
     * @throws Exception Exceção geral que pode ser lançada por operações
     * específicas.
     */
    public void visualizar(String cpf) throws Exception {
        // Busca o perfil no banco de dados e exibe suas informações usando a PerfilView.
        Perfil objPerfil = caddb.buscarPerfil(cpf);
        perfilview.mostrarInfosPerfil(objPerfil);
    }

    /**
     * Método para atualizar informações de um perfil com base na opção
     * escolhida pelo usuário.
     *
     * @param opcao Número correspondente à informação que será atualizada.
     * @param cpf CPF do perfil a ser atualizado.
     * @throws Exception Exceção geral que pode ser lançada por operações
     * específicas.
     */
    public void atualizar(int opcao, String cpf) throws Exception {
        // Mapeia a opção escolhida para o campo correspondente no perfil.
        String campo;
        switch (opcao) {
            // Adicione os casos para as opções restantes conforme necessário.
            case 1:
                campo = "nome";
                break;
            case 2:
                campo = "idade";
                break;
            case 3:
                campo = "email";
                break;
            case 4:
                campo = "cpf";
                break;
            case 5:
                campo = "desc_serv";
                break;
            case 6:
                campo = "cidade";
                break;
            case 7:
                campo = "bairro";
                break;
            case 8:
                campo = "areas_interesse";
                break;
            case 9:
                campo = "tempo_ex";
                break;
            case 10:
                campo = "ft_perfil";
                break;
            case 11:
                campo = "habilidades";
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

        // Chama o método do DbPerfil para realizar a atualização e exibe o retorno.
        String retorno = caddb.atualizarPerfil(cpf, campo, atualizacao);
        System.out.println(retorno);
    }

    /**
     * Método para deletar um perfil com base no CPF.
     *
     * @param cpf CPF do perfil a ser deletado.
     * @throws Exception Exceção geral que pode ser lançada por operações
     * específicas.
     */
    public void deletar(String cpf) throws Exception {
        // Chama o método do DbPerfil para deletar o perfil no banco de dados e exibe o retorno.
        String retorno = caddb.deletarPerfil(cpf);
        System.out.println(retorno);
    }
}
