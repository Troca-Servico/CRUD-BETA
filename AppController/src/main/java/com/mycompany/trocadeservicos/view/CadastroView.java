/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.view;

import com.mycompany.trocadeservicos.model.Cadastro;
import java.util.Scanner;

public class CadastroView {

    public static Cadastro View() throws Exception {
        Scanner input = new Scanner(System.in);
        String cpf, nome, email, descServ, tempEx, areaInteresse, cidade, bairro, foto, habilidades;
        int idade;

        System.out.println("Vamos iniciar!");
        System.out.println("Digite seu primeiro e segundo nome:");
        nome = input.nextLine();
        System.out.println("Digite seu endereço de e-mail:");
        email = input.nextLine();
        System.out.println("Digite sua idade:");
        idade = input.nextInt();
        input.nextLine();  // Consumir a quebra de linha após a leitura da idade
        System.out.println("Digite a descrição do seu serviço oferecido:");
        descServ = input.nextLine();
        System.out.println("Digite seu tempo de experiencia:");
        tempEx = input.nextLine();
        System.out.println("Digite sua área de interesse separando por vírgulas:");
        areaInteresse = input.nextLine();
        System.out.println("Digite a cidade do estabelecimento:");
        cidade = input.nextLine();
        System.out.println("Digite o bairro do estabelecimento:");
        bairro = input.nextLine();
        System.out.println("Insira foto de perfil:");
        foto = input.nextLine();
        System.out.println("Digite suas habilidades:");
        habilidades = input.nextLine();
        System.out.println("Digite seu CPF:");
        cpf = input.nextLine();
        System.out.println("Processando...");
        return new Cadastro(nome, idade, email, cpf, descServ, cidade, bairro, areaInteresse, tempEx, foto, habilidades);
    }

    public static void sucessoCadastro() {
        System.out.println("Cadastrado com sucesso");
    }

    public static void falhaCadastro() {
        System.out.println("Falha ao cadastrar");
    }
}
