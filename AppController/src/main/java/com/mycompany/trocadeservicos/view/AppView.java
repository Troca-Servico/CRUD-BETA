/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * A classe AppView é responsável pela interação com o usuário na camada de apresentação do sistema.
 * Ela exibe menus, recebe entradas do usuário e chama métodos do controlador para realizar as operações desejadas.
 */
package com.mycompany.trocadeservicos.view;

import com.mycompany.trocadeservicos.controller.Controller;

import java.util.Scanner;

public class AppView {
// Instância do controlador para acesso aos métodos de lógica de negócios

    Controller servcont = new Controller();

    /**
     * Método que exibe o menu inicial do sistema e solicita a escolha do
     * usuário. Chama o método correspondente do controlador com base na
     * escolha.
     *
     * @throws Exception Se ocorrer uma exceção durante a execução.
     */
    public void menuInicial() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Escolha uma opcao: ");
        System.out.println("[1] Cadastrar Perfil");
        System.out.println("[2] Visualizar Perfil");
        System.out.println("[3] Atualizar Perfil");
        System.out.println("[4] Deletar Perfil");
        System.out.println("[5] Publicar Servicos");
        System.out.println("[6] Pesquisar Servicos");
        System.out.println("[7] Atualizar Servico");
        System.out.println("[8] Deletar Servico");
        System.out.println("[9] Avaliar Perfil");
        System.out.println("[10] Sair");
        System.out.println("-------------------");
        int escolha = input.nextInt();
        servcont.menu(escolha);
    }

    /**
     * Método que exibe mensagem de opção inválida.
     */
    public static void mostraMsgInvalida() {
        System.out.println("\"OPCAO INVALIDA!!!!\" é necessario reiniciar seu cadastro! :(");
        System.out.println("-------------------------------");
    }

    /**
     * Método que solicita ao usuário se possui documentos para realizar o
     * cadastro.
     *
     * @return 1 se sim, 2 se não.
     */
    public static int mensagemAlertaCadastro() {
        Scanner input = new Scanner(System.in);
        System.out
                .println("Voce está com documentos em mãos para realizar o cadastro? Digite 1 para sim e 2 para nao:");
        return input.nextInt();
    }

    /**
     * Método que exibe mensagem indicando que o cadastro não será realizado por
     * falta de documentos.
     */
    public static void naoProcederCadastro() {
        System.out.println("Precisamos do seus dados para realizar o cadastro... Volte mais tarde!!");
        System.out.println("------------ Interação Finalizada -------------------");
    }

}
