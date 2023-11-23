/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.view;

import com.mycompany.trocadeservicos.model.Cadastro;
import java.util.Scanner;

public class CadastroView {

    Cadastro cad = new Cadastro();

    public void View() throws Exception {
        Scanner input = new Scanner(System.in);
        String nome, email, cpf;
        int idade;

        System.out.println("Vamos iniciar!");
        System.out.println("Digite seu primeiro e segundo nome:");
        nome = input.nextLine();
        System.out.println("Digite seu endereço de e-mail:");
        email = input.nextLine();
        System.out.println("Digite sua idade:");
        idade = input.nextInt();
        input.nextLine(); // Consome o caractere de nova linha
        System.out.println("Digite seu CPF:");
        cpf = input.nextLine();
        System.out.println("Processando...");

        try {
            cad.cadastro(nome, idade, email, cpf);
            CadastroView.sucessoCadastro();
        } catch (Exception ex) {
            CadastroView.falhaCadastro();
        }

    }

    public static void sucessoCadastro() {
        System.out.println("Cadastrado com sucesso");
    }

    public static void falhaCadastro() {
        System.out.println("Falha ao cadastrar");
    }
}
