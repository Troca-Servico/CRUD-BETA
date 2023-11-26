/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

<<<<<<< HEAD:AppController/src/main/java/com/mycompany/trocadeservicos/controller/Controller.java
import com.mycompany.trocadeservicos.model.Perfil;
import com.mycompany.trocadeservicos.view.AppView;
import com.mycompany.trocadeservicos.view.PerfilView;
import com.mycompany.trocadeservicos.controller.PerfilController;

public class Controller {

    PerfilView perfilview = new PerfilView();
    PerfilController perfilcon = new PerfilController();

=======
import com.mycompany.trocadeservicos.model.Cadastro;
import com.mycompany.trocadeservicos.view.AppView;
import com.mycompany.trocadeservicos.view.CadastroView;
import com.mycompany.trocadeservicos.controller.CadastroController;

public class ServicoController {
    
    CadastroView cadview = new CadastroView();
    CadastroController cadcon = new CadastroController();
    
>>>>>>> 737c46096e75f90090be592341e81a9479c9d2ba:AppController/src/main/java/com/mycompany/trocadeservicos/controller/ServicoController.java
    public void menu(int escolha) throws Exception {
        switch (escolha) {
            case 1:
                cadastrarPerfil();
                break;
<<<<<<< HEAD:AppController/src/main/java/com/mycompany/trocadeservicos/controller/Controller.java
            case 2:
                visualizarPerfil();
                break;

            /*
            
=======

            /*
            case 2:
                opcao2();
                break;
>>>>>>> 737c46096e75f90090be592341e81a9479c9d2ba:AppController/src/main/java/com/mycompany/trocadeservicos/controller/ServicoController.java
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
<<<<<<< HEAD:AppController/src/main/java/com/mycompany/trocadeservicos/controller/Controller.java

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
=======
        
    }
    
    public void cadastrarPerfil() {
        try {
            Cadastro cad = cadview.View();
            cadcon.cadastrar(cad);
            CadastroView.sucessoCadastro();
        } catch (Exception ex) {
            CadastroView.falhaCadastro();
        }
    }
    
    public void opcao1() throws Exception {
        int iniciarcadastro = AppView.mensagemAlertaCadastro();
        switch (iniciarcadastro) {
            case 1:
                cadastrarPerfil();
                break;
            case 2:
                AppView.naoProcederCadastro();
                break;
            default:
                AppView.mostraMsgInvalida();
                break;
        }
    }


>>>>>>> 737c46096e75f90090be592341e81a9479c9d2ba:AppController/src/main/java/com/mycompany/trocadeservicos/controller/ServicoController.java
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
