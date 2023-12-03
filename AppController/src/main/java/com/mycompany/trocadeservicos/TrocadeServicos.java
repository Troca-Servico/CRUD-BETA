/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.trocadeservicos;

import com.mycompany.trocadeservicos.view.AppView;

/**
 * Classe principal TrocadeServicos é responsável por iniciar a aplicação,
 * criando uma instância da classe AppView e chamando o método menuInicial().
 */
public class TrocadeServicos {

    /**
     * Método principal que inicia a execução da aplicação.
     *
     * 
     * @throws Exception Exceção geral que pode ser lançada por operações
     * específicas.
     */
    public static void main(String[] args) throws Exception {
        // Cria uma instância da classe AppView para interação com o usuário.
        AppView aV = new AppView();
        
        // Chama o método menuInicial() para iniciar o fluxo de interação do usuário.
        aV.menuInicial();
    }
}
