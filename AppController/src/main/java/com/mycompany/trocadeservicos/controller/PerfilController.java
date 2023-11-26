/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.model.Perfil;
import com.mycompany.trocadeservicos.db.DbPerfil;
import com.mycompany.trocadeservicos.view.PerfilView;
import java.util.Scanner;

public class PerfilController {

    Scanner input = new Scanner(System.in);
    DbPerfil caddb = new DbPerfil();
    PerfilView perfilview = new PerfilView();

    public void cadastrar(Perfil cadastro) throws Exception {
        caddb.salvarCadastro(cadastro);
    }

    public void visualizar(String cpf) throws Exception {
        Perfil objPerfil = caddb.buscarPerfil(cpf);
        perfilview.mostrarInfosPerfil(objPerfil);
    }

    public void atualizar(int opcao, String cpf) throws Exception {
        String campo;
        switch (opcao) {
            case 1:
                campo = "nome";
                break;
            case 2:
                campo = "idade";
                break;
            case 3:
                campo = "email";
                break;
            case 4:
                campo = "cpf";
                break;
            case 5:
                campo = "desc_serv";
                break;
            case 6:
                campo = "cidade";
                break;
            case 7:
                campo = "bairro";
                break;
            case 8:
                campo = "areas_interesse";
                break;
            case 9:
                campo = "tempo_ex";
                break;
            case 10:
                campo = "ft_perfil";
                break;
            case 11:
                campo = "habilidades";
                break;
            // Adicione os outros casos conforme necessário
            default:
                campo = "";
                System.out.println("Opcao invalida"); // Ou algum valor padrão, dependendo da lógica do seu programa
                break;
        }
        System.out.println("OK, em seguida digite sua atualização por gentileza:");
        String atualizacao = input.nextLine();
        String retorno = caddb.atualizarPerfil(cpf, campo, atualizacao);
        System.out.println(retorno);
    }

    public void deletar(String cpf) throws Exception {
        String retorno = caddb.deletarPerfil(cpf);
        System.out.println(retorno);
    }
}
