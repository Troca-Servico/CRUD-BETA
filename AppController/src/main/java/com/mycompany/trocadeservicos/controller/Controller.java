/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.model.Perfil;
import com.mycompany.trocadeservicos.view.AppView;
import com.mycompany.trocadeservicos.view.PerfilView;
import com.mycompany.trocadeservicos.controller.PerfilController;

public class Controller {

    PerfilView perfilview = new PerfilView();
    PerfilController perfilcon = new PerfilController();

    public void menu(int escolha) throws Exception {
        switch (escolha) {
            case 1:
                cadastrarPerfil();
                break;
            case 2:
                visualizarPerfil();
                break;

            /*
            
            case 3:
                opcao3();
                break;
            case 4:
                opcao4();
                break;
            case 5:
                opcao5();
                break;
            case 6:
                opcao6();
                break;
            case 7:
                opcao7();
                break;
            case 8:
                opcao8();
                break;
            case 9:
                opcao9();
                break;
            case 10:
                opcao10();
                break;

             */
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
            //PerfilView.sucessoCadastro();
        } catch (Exception ex) {
            PerfilView.falhaCadastro();
        }
    }
    /*
    public void opcao2() {
        PerfilController perfil = new PerfilController();
        boolean resp = perfil.visualizarPerfil();
        if (resp == false) {
            perfilView.falhaVisuPerfil();
        } else {
            perfilView.mostrarInfosPerfil();
        }
    }

    public void opcao3() {
        PerfilController perfil = new PerfilController();
        boolean resp = perfil.atualizarPerfil();
        if (resp == false) {
            perfilView.falhaAtualizacao();
        } else {
            perfilView.sucessoAtualizacao();
        }
    }

    public void opcao4() {
        PerfilController perfil = new PerfilController();
        boolean resp = perfil.deletarPerfil();
        if (resp == false) {
            perfilView.falhaDeletarPerfil();
        } else {
            perfilView.deletarPerfil();
        }
    }

    public void opcao5() {

    }

    public void opcao6() {

    }

    public void opcao7() {

    }

    public void opcao8() {

    }

    public void opcao9() {

    }

    public void opcao10() {

    }
     */
}
