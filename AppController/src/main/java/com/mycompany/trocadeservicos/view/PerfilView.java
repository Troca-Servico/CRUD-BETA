/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * A classe PerfilView é responsável por interagir com o usuário na camada de apresentação
 * relacionada ao cadastro e exibição de informações de perfil.
 */
package com.mycompany.trocadeservicos.view;

import com.mycompany.trocadeservicos.model.Perfil;
import java.util.Scanner;

public class PerfilView {

    /**
     * Método que solicita e recebe informações do usuário para criar um objeto
     * Perfil.
     *
     * @return Objeto Perfil criado com as informações fornecidas pelo usuário.
     * @throws Exception Se ocorrer uma exceção durante a execução.
     */
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

    /**
     * Método que exibe mensagem de sucesso ao cadastrar um perfil.
     */
    public static void sucessoCadastro() {
        System.out.println("Cadastrado com sucesso");
    }

    /**
     * Método que exibe mensagem de falha ao cadastrar um perfil.
     */
    public static void falhaCadastro() {
        System.out.println("Falha ao cadastrar");
    }

    /**
     * Método que solicita o CPF ao usuário.
     *
     * @return CPF fornecido pelo usuário.
     */
    public String solicitarCpf() {
        Scanner input = new Scanner(System.in);
        String cpf;
        System.out.println("digite seu cpf por gentileza:");
        cpf = input.nextLine();
        return cpf;
    }

    /**
     * Método que exibe as informações de um perfil.
     *
     * @param perfil Objeto Perfil contendo as informações a serem exibidas.
     */
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

    /**
     * Método que solicita ao usuário a opção que deseja atualizar no perfil.
     *
     * @return Número da opção escolhida pelo usuário.
     */
    public int selecionarOpcao() {
        Scanner input = new Scanner(System.in);
        int opcao;
        System.out.println("Por gentileza digite o numero da opção que deseja atualizar:");
        System.out.println("[1] Atualizar nome");
        System.out.println("[2] Atualizar idade");
        System.out.println("[3] Atualizar email");
        System.out.println("[4] Atualizar cpf");
        System.out.println("[5] Atualizar descrição do serviço oferecido");
        System.out.println("[6] Atualizar cidade do estabelecimento");
        System.out.println("[7] Atualizar bairro do estabelecimento");
        System.out.println("[8] Atualizar areas de interesse");
        System.out.println("[9] Atualizar tempo de experiencia");
        System.out.println("[10] Atualizar foto do perfil");
        System.out.println("[10] Atualizar habilidades");
        opcao = input.nextInt();
        return opcao;
    }
}
