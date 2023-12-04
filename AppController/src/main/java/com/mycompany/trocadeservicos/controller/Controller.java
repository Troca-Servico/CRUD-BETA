/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.model.Perfil;
import com.mycompany.trocadeservicos.model.Servico;
import com.mycompany.trocadeservicos.view.AppView;
import com.mycompany.trocadeservicos.view.PerfilView;
import com.mycompany.trocadeservicos.view.ServicoView;
import com.mycompany.trocadeservicos.controller.PerfilController;
import com.mycompany.trocadeservicos.controller.ServicoController;
import com.mycompany.trocadeservicos.db.DbPerfil;

/**
 * Classe Controller é responsável por coordenar as interações entre as Views
 * (PerfilView, ServicoView) e Controllers (PerfilController,
 * ServicoController).
 */
public class Controller {

    /* Instâncias das Views e Controllers necessárias para o funcionamento do sistema.
     */
    DbPerfil caddb = new DbPerfil();
    PerfilView perfilview = new PerfilView();
    ServicoView servicoview = new ServicoView();
    PerfilController perfilcon = new PerfilController();
    ServicoController servicocon = new ServicoController();

    /**
     * Método menu() é o ponto de entrada principal para as operações do
     * sistema.
     *
     * @param escolha Número correspondente à operação desejada pelo usuário.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * conexão
     */
    public void menu(int escolha) throws Exception {
        switch (escolha) {
            // Cada caso representa uma operação específica.
            case 1:
                cadastrarPerfil();
                break;
            case 2:
                visualizarPerfil();
                break;
            case 3:
                atualizarPerfil();
                break;
            case 4:
                deletarPerfil();
                break;
            case 5:
                publicarServico();
                break;
            case 6:
                pesquisarServico();
                break;
            case 7:
                atualizarServico();
                break;
            case 8:
                deletarServico();
                break;
            case 9:
                avaliarPerfis();
                break;
            case 10:
                visualizarMeusServicos();
                break;
            case 11:
                sair();
                break;
        }
    }

    /**
     * Método para avaliar perfis.
     */
    public void avaliarPerfis() {
        try {
            // Solicita CPF ao usuário e chama método de avaliação do ServicoController.
            String cpf = servicoview.solicitarCpf();
            caddb.buscarPerfil(cpf);
            servicocon.avaliar(cpf);
        } catch (Exception e) {
            // Trata exceção, exibindo uma mensagem amigável para o usuário.
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public void visualizarMeusServicos() {
        try {
            String cpf = perfilview.solicitarCpf();
            this.verificaExistenciaPerfil(cpf);
            servicocon.visualizar(cpf);
        } catch (Exception e) {
            // Trata exceção, exibindo uma mensagem amigável para o usuário.
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    /**
     * Método para encerrar a aplicação.
     */
    public void sair() {
        // Chama método de deslogar da ServicoView.
        servicoview.deslogar();
    }

    // Métodos para operações específicas (cadastrar, visualizar, atualizar, deletar, etc.).
    /**
     * Método para deletar um serviço.
     */
    public void deletarServico() {

        try {
            // Solicita CPF ao usuário e chama método de deleção do ServicoController.
            String cpf = servicoview.solicitarCpf();
            this.verificaExistenciaPerfil(cpf);
            servicocon.deletar(cpf);
        } catch (Exception e) {
            // Trata exceção, exibindo uma mensagem amigável para o usuário.
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    /**
     * Método para atualizar um serviço.
     */
    public void atualizarServico() {
        try {
            // Solicita CPF e opção ao usuário e chama método de atualização do ServicoController.
            String cpf = servicoview.solicitarCpf();
            this.verificaExistenciaPerfil(cpf);
            int opcao = servicoview.selecionarOpcao();
            servicocon.atualizar(opcao, cpf);
        } catch (Exception e) {
            // Trata exceção, exibindo uma mensagem amigável para o usuário.
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    /**
     * Método para publicar um serviço.
     */
    public void publicarServico() {
        try {
            // Solicita dados ao usuário através da ServicoView e chama método de cadastro do ServicoController.
            String cpf = perfilview.solicitarCpf();
            this.verificaExistenciaPerfil(cpf);
            Servico cad = servicoview.View(cpf);
            servicocon.cadastrar(cad);
        } catch (Exception e) {
            // Trata exceção, exibindo uma mensagem amigável para o usuário.
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    /**
     * Método para pesquisar serviços.
     */
    public void pesquisarServico() {
        try {
            // Solicita área ao usuário através da ServicoView e chama método de visualização do ServicoController.
            String cpf = perfilview.solicitarCpf();
            this.verificaExistenciaPerfil(cpf);
            String area = servicoview.pesquisarServico();
            servicocon.listarServicos(area, cpf);
        } catch (Exception e) {
            // Trata exceção, exibindo uma mensagem amigável para o usuário.
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    /**
     * Método para cadastrar um perfil.
     */
    public void cadastrarPerfil() {
        try {
            // Solicita dados ao usuário através da PerfilView e chama método de cadastro do PerfilController.
            Perfil cad = perfilview.View();
            perfilcon.cadastrar(cad);
            // Exibe mensagem de sucesso no cadastro através de um método estático na PerfilView.
            PerfilView.sucessoCadastro();
        } catch (Exception ex) {
            // Em caso de falha no cadastro, exibe mensagem de falha através de um método estático na PerfilView.
            PerfilView.falhaCadastro();
        }
    }

    /**
     * Método para visualizar um perfil.
     */
    public void visualizarPerfil() {
        try {
            // Solicita CPF ao usuário através da PerfilView e chama método de visualização do PerfilController.
            String cpf = perfilview.solicitarCpf();
            perfilcon.visualizar(cpf);
        } catch (Exception e) {
            // Trata exceção, exibindo uma mensagem amigável para o usuário.
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    /**
     * Método para atualizar um perfil.
     */
    public void atualizarPerfil() {
        try {
            // Solicita CPF e opção ao usuário e chama método de atualização do PerfilController.
            String cpf = perfilview.solicitarCpf();
            this.verificaExistenciaPerfil(cpf);
            int opcao = perfilview.selecionarOpcao();
            perfilcon.atualizar(opcao, cpf);
        } catch (Exception e) {
            // Trata exceção, exibindo uma mensagem amigável para o usuário.
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    /**
     * Método para deletar um perfil.
     */
    public void deletarPerfil() {
        try {
            // Solicita CPF ao usuário através da PerfilView e chama método de deleção do PerfilController.
            String cpf = perfilview.solicitarCpf();
            perfilcon.deletar(cpf);
        } catch (Exception e) {
            // Trata exceção, exibindo uma mensagem amigável para o usuário.
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public void verificaExistenciaPerfil(String cpf) {
        try {
            caddb.buscarPerfil(cpf);
        } catch (Exception e) {
            // Trata exceção, exibindo uma mensagem amigável para o usuário.
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
