/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.view;

import com.mycompany.trocadeservicos.model.Perfil;
import java.util.Scanner;
import com.mycompany.trocadeservicos.model.Servico;

/**
 *
 * @author Yasmin
 */
public class ServicoView {

    public static Servico View() throws Exception {
        Scanner input = new Scanner(System.in);
        String area, desc_serv, cidade, bairro, tempEx, cpf;
        System.out.println("Vamos iniciar!");
        System.out.println("Digite seu cpf:");
        cpf = input.nextLine();
        System.out.println("Digite a area do seu servico:");
        area = input.nextLine();
        System.out.println("Digite uma breve descrição do seu serviço:");
        desc_serv = input.nextLine();
        System.out.println("Digite a cidade onde seu servço reside:");
        cidade = input.nextLine();
        System.out.println("Digite o bairro onde seu servço reside:");
        bairro = input.nextLine();
        System.out.println("Digite seu tempo de experiencia:");
        tempEx = input.nextLine();
        System.out.println("Processando...");
        return new Servico(area, desc_serv, cidade, bairro, tempEx, cpf);
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
