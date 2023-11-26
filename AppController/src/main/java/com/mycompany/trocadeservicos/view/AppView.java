/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.view;

import com.mycompany.trocadeservicos.controller.Controller;

import java.util.Scanner;

public class AppView {

    Controller servcont = new Controller();

    public void menuInicial() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Escolha uma opcao: ");
        System.out.println("[1] Cadastrar Perfil");
        System.out.println("[2] Visualizar Perfil");
        System.out.println("[3] Atualizar Perfil");
        System.out.println("[4] Deletar Perfil");
        System.out.println("[5] Pesquisar Servicos");
        System.out.println("[6] Publicar Servicos");
        System.out.println("[7] Solicitar Servicos");
        System.out.println("[8] Cancelar Servico");
        System.out.println("[9] Listar Servicos nao aceitos");
        System.out.println("[10] Listar Servicos em andamento");
        System.out.println("-------------------");
        int escolha = input.nextInt();
        servcont.menu(escolha);
    }

    public static void mostraMsgInvalida() {
        System.out.println("\"OPCAO INVALIDA!!!!\" é necessario reiniciar seu cadastro! :(");
        System.out.println("-------------------------------");
    }

    public static int mensagemAlertaCadastro() {
        Scanner input = new Scanner(System.in);
        System.out
                .println("Voce está com documentos em mãos para realizar o cadastro? Digite 1 para sim e 2 para nao:");
        return input.nextInt();
    }

    public static void naoProcederCadastro() {
        System.out.println("Precisamos do seus dados para realizar o cadastro... Volte mais tarde!!");
        System.out.println("------------ Interação Finalizada -------------------");
    }

}
