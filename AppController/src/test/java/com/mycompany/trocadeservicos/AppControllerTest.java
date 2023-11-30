/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trocadeservicos;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de teste para a classe AppController.
 *
 * Os métodos de teste nesta classe são projetados para testar o comportamento
 * da classe AppController em diferentes cenários.
 *
 * @author Laryssa
 */
public class AppControllerTest {

    public AppControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        // Configuração inicial antes da execução dos testes da classe
    }

    @AfterClass
    public static void tearDownClass() {
        // Limpeza após a execução de todos os testes da classe
    }

    @Before
    public void setUp() {
        // Configuração inicial antes da execução de cada teste
    }

    @After
    public void tearDown() {
        // Limpeza após a execução de cada teste
    }

    /**
     * Testa o método main da classe AppController.
     *
     * Este teste simula a saida do usuário, fornecendo "5s" como saida. A
     * 
     * @throws Exception Se ocorrer uma exceção durante a execução do teste.
     */
    @Test
    public void testMain() throws Exception {
        // Exibe uma mensagem indicando que o teste main está sendo executado
        System.out.println("main");
        // Configura a saida do sistema com um valor simulado ("5")
        String[] args = null;
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        // Chama o método main da classe AppController
        AppController.main(args);

    }

}
