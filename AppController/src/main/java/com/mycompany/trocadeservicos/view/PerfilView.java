/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.view;

import com.mycompany.trocadeservicos.model.Perfil;
import java.util.Scanner;

public class PerfilView {

    public static Perfil View() throws Exception {
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
        return new Perfil(nome, idade, email, cpf, descServ, cidade, bairro, areaInteresse, tempEx, foto, habilidades);
    }

    public static void sucessoCadastro() {
        System.out.println("Cadastrado com sucesso");
    }

    public static void falhaCadastro() {
        System.out.println("Falha ao cadastrar");
    }

    public String solicitarCpf() {
        Scanner input = new Scanner(System.in);
        String cpf;
        System.out.println("digite seu cpf por gentileza:");
        cpf = input.nextLine();
        return cpf;
    }

    public void mostrarInfosPerfil(Perfil perfil) {
        System.out.println("Segue informações cadastradas no seu perfil");
        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Idade: " + perfil.getIdade());
        System.out.println("CPF: " + perfil.getCpf());
        System.out.println("Email: " + perfil.getEmail());
        System.out.println("Descrição do serviço: " + perfil.getDescSer());
        System.out.println("Cidade do estabelecimento: " + perfil.getCidade());
        System.out.println("Bairro do estabelecimento:: " + perfil.getBairro());
        System.out.println("Areas de interresse: " + perfil.getAreasInteresse());
        System.out.println("Tempo de experiência: " + perfil.getTempoEx());
        System.out.println("Foto de perfil: " + perfil.getFtPerfil());
        System.out.println("Habilidades: " + perfil.getHabilidades());
    }
}