/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.model.Cadastro;
import com.mycompany.trocadeservicos.view.AppView;
import com.mycompany.trocadeservicos.view.CadastroView;

public class ServicoController {

    CadastroView cadview = new CadastroView();
    Cadastro cad = new Cadastro();

    public void menu(int escolha) throws Exception {
        switch (escolha) {
            case 1:
                opcao1();
                break;
                
            /*
            case 2:
                opcao2();
                break;
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

    public void opcao1() throws Exception {
        int iniciarcadastro;
        iniciarcadastro = AppView.mensagemAlertaCadastro();
        switch (iniciarcadastro) {
            case 1:
                cadview.View();
                break;

            case 2:
                AppView.naoProcederCadastro();
                break;
            default:
                //AppView.mostraMsgInvalida();
                break;
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
