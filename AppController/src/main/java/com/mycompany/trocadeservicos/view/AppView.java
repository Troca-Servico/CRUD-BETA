/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.view;

<<<<<<< HEAD:AppController/src/main/java/com/mycompany/trocadeservicos/view/AppView.java
import com.mycompany.trocadeservicos.controller.Controller;
=======
import com.mycompany.trocadeservicos.controller.ServicoController;
>>>>>>> 737c46096e75f90090be592341e81a9479c9d2ba:TrocadeServicos/src/main/java/com/mycompany/trocadeservicos/view/AppView.java
import java.util.Scanner;

public class AppView {
    
<<<<<<< HEAD:AppController/src/main/java/com/mycompany/trocadeservicos/view/AppView.java
    Controller servcont = new Controller();
=======
    ServicoController servcont = new ServicoController();
>>>>>>> 737c46096e75f90090be592341e81a9479c9d2ba:TrocadeServicos/src/main/java/com/mycompany/trocadeservicos/view/AppView.java
    
    public void menuInicial() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Escolha uma opcao: ");
<<<<<<< HEAD:AppController/src/main/java/com/mycompany/trocadeservicos/view/AppView.java
        System.out.println("[1] Cadastrar Perfil");
=======
        System.out.println("[1] Cadastrar");
>>>>>>> 737c46096e75f90090be592341e81a9479c9d2ba:TrocadeServicos/src/main/java/com/mycompany/trocadeservicos/view/AppView.java
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
