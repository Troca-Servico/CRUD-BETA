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

public class Controller {

    PerfilView perfilview = new PerfilView();
    ServicoView servicoview = new ServicoView();
    PerfilController perfilcon = new PerfilController();
    ServicoController servicocon = new ServicoController();

    public void menu(int escolha) throws Exception {
        switch (escolha) {
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
                sair();
                break;
        }
    }

    public void avaliarPerfis() {
        try {
            String cpf = servicoview.solicitarCpf();
            servicocon.avaliar(cpf);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public void sair() {
        servicoview.deslogar();
    }

    public void deletarServico() {
        try {
            String cpf = servicoview.solicitarCpf();
            servicocon.deletar(cpf);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public void atualizarServico() {
        try {
            String cpf = servicoview.solicitarCpf();
            int opcao = servicoview.selecionarOpcao();
            servicocon.atualizar(opcao, cpf);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public void publicarServico() {
        try {
            Servico cad = servicoview.View();
            servicocon.cadastrar(cad);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public void pesquisarServico() {
        try {
            String area = servicoview.pesquisarServico();
            servicocon.visualizar(area);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public void cadastrarPerfil() {
        try {
            Perfil cad = perfilview.View();
            perfilcon.cadastrar(cad);
            PerfilView.sucessoCadastro();
        } catch (Exception ex) {
            PerfilView.falhaCadastro();
        }
    }

    public void visualizarPerfil() {
        try {
            String cpf = perfilview.solicitarCpf();
            perfilcon.visualizar(cpf);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public void atualizarPerfil() {
        try {
            String cpf = perfilview.solicitarCpf();
            int opcao = perfilview.selecionarOpcao();
            perfilcon.atualizar(opcao, cpf);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public void deletarPerfil() {
        try {
            String cpf = perfilview.solicitarCpf();
            perfilcon.deletar(cpf);
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
