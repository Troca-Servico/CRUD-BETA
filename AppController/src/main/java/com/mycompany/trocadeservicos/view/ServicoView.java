/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * A classe ServicoView é responsável por interagir com o usuário na camada de apresentação
 * relacionada ao cadastro e exibição de informações de serviços.
 */
package com.mycompany.trocadeservicos.view;

import com.mycompany.trocadeservicos.model.Perfil;
import java.util.Scanner;
import com.mycompany.trocadeservicos.model.Servico;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.lang.InterruptedException;
import java.lang.Thread;

/**
 *
 * @author Yasmin / Laryssa
 */
public class ServicoView {

    /**
     * Método que solicita e recebe informações do usuário para criar um objeto
     * Servico.
     *
     * @return Objeto Servico criado com as informações fornecidas pelo usuário.
     * @throws Exception Se ocorrer uma exceção durante a execução.
     */
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

    /**
     * Método que solicita a área de serviço ao usuário.
     *
     * @return Área de serviço fornecida pelo usuário.
     */
    public String pesquisarServico() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a area do servico:");
        String area = input.nextLine();
        return area;
    }

    /**
     * Método que exibe a lista de serviços.
     *
     * @param servicos Lista de objetos Servico a serem exibidos.
     */
    public static void mostrarServicos(List<Servico> servicos) {
        if (servicos.isEmpty()) {
            System.out.println("Nenhum serviço encontrado para a área especificada.");
        } else {
            System.out.println("Lista de Serviços:");
            for (Servico servico : servicos) {
                System.out.println("----------------------------------------");
                System.out.println("Área: " + servico.getArea());
                System.out.println("Descrição do Serviço: " + servico.getDescSer());
                System.out.println("Cidade: " + servico.getCidade());
                System.out.println("Bairro: " + servico.getBairro());
                System.out.println("Tempo de Experiência: " + servico.getTempoEx());
                System.out.println("CPF: " + servico.getCpf());
                System.out.println("----------------------------------------");
            }
        }
    }

    /**
     * Método que lista os serviços e retorna o ID do serviço a ser deletado.
     *
     * @param infos Lista de mapas contendo informações dos serviços.
     * @return ID do serviço a ser deletado.
     */
    public String listarServicos(List<Map<String, String>> infos) {
        if (infos.isEmpty()) {
            System.out.println("Nenhum serviço encontrado para o cpf especificado.");
        } else {
            System.out.println("Lista de Serviços:");
            for (Map<String, String> info : infos) {
                System.out.println("----------------------------------------");
                System.out.println("*Id*: " + info.get("id"));
                System.out.println("Área: " + info.get("area"));
                System.out.println("Descrição do Serviço: " + info.get("descricao"));
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Agora digite o ID do servico que deseja deletar");
            String id = input.nextLine();
            return id;
        }
        return null;
    }

    /**
     * Método que solicita ao usuário a opção que deseja atualizar no serviço.
     *
     * @return Número da opção escolhida pelo usuário.
     */
    public int selecionarOpcao() {
        Scanner input = new Scanner(System.in);
        int opcao;
        System.out.println("Por gentileza digite o numero da opção que deseja atualizar:");
        System.out.println("[1] Atualizar area");
        System.out.println("[2] Atualizar descricao do serviço");
        System.out.println("[3] Atualizar cidade");
        System.out.println("[4] Atualizar bairro");
        System.out.println("[9] Atualizar tempo de experiencia");
        opcao = input.nextInt();
        return opcao;
    }

    /**
     * Método que solicita ao usuário o CPF.
     *
     * @return CPF fornecido pelo usuário.
     */
    public String solicitarCpf() {
        Scanner input = new Scanner(System.in);
        System.out.println("digite seu cpf por gentileza:");
        String cpf = input.nextLine();
        return cpf;
    }

    /**
     * Método que simula um processo de deslogar, exibindo mensagens e
     * aguardando 5 segundos.
     */
    public void deslogar() {
        System.out.println("Saindo...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
        System.out.println("*tela principal*...");
    }

    /**
     * Método que exibe as informações do perfil.
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
     * Método que lista os perfis e retorna o ID do perfil a ser avaliado.
     *
     * @param infos Lista de mapas contendo informações dos perfis.
     * @return ID do perfil a ser avaliado.
     */
    public String listarPerfis(List<Map<String, String>> infos) {
        if (infos.isEmpty()) {
            System.out.println("Nenhum serviço encontrado para o cpf especificado.");
        } else {
            System.out.println("Lista de perfis:");
            for (Map<String, String> info : infos) {
                System.out.println("----------------------------------------");
                System.out.println("*Id*: " + info.get("id"));
                System.out.println("Nome: " + info.get("nome"));
                System.out.println("Cidade: " + info.get("cidade"));
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Agora digite o ID do perfil que deseja avaliar");
            String id = input.nextLine();
            return id;
        }
        return null;
    }
}
