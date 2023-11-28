/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.Assert.*;

/**
 *
 * @author gatin
 */
public class ControllerTest {

    private final InputStream originalSystemIn = System.in;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // Salva a entrada padrão do sistema
        System.setIn(originalSystemIn);
    }

    @After
    public void tearDown() {
        // Restaura a entrada padrão do sistema após cada teste
        System.setIn(originalSystemIn);
    }

    /**
     * Test of menu method, of class Controller.
     */
    @Test
    public void testMenu() throws Exception {
        System.out.println("menu");
        int escolha = 0;
        Controller instance = new Controller();
        instance.menu(escolha);

    }

    /**
     * Test of avaliarPerfis method, of class Controller.
     */
    @Test
    public void testAvaliarPerfis() {
        System.out.println("avaliarPerfis");
        String input = "12345678998";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Controller instance = new Controller();
        instance.avaliarPerfis();

    }

    /**
     * Test of sair method, of class Controller.
     */
    @Test
    public void testSair() {
        System.out.println("sair");
        Controller instance = new Controller();
        instance.sair();

    }

    /**
     * Test of deletarServico method, of class Controller.
     */
    @Test
    public void testDeletarServico() {
        System.out.println("deletarServico");
        String input = "12345678998";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Controller instance = new Controller();
        instance.deletarServico();

    }

    /**
     * Test of atualizarServico method, of class Controller.
     */
    @Test
    public void testAtualizarServico() {
        System.out.println("atualizarServico");
        String input = "12345678998";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Controller instance = new Controller();
        instance.atualizarServico();

    }

    /**
     * Test of publicarServico method, of class Controller.
     */
    @Test
    public void testPublicarServico() {
        System.out.println("publicarServico");
        Controller instance = new Controller();
        String input = "12345678998";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        instance.publicarServico();

    }

    /**
     * Test of pesquisarServico method, of class Controller.
     */
    @Test
    public void testPesquisarServico() {
        System.out.println("pesquisarServico");
        String input = "12345678998";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Controller instance = new Controller();
        instance.pesquisarServico();

    }

    /**
     * Test of cadastrarPerfil method, of class Controller.
     */
     @Test
    public void testCadastrarPerfil() {
        System.out.println("cadastrarPerfil");

        // Configura uma entrada simulada para o método cadastrarPerfil
        String input = "Nome do Perfil\n22\nperfil@teste.com\n12345678998\nteste descr\nteste cidade\nteste bairro\nareas de interesse\ntempo ex\nft perfil\nhabilidades";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Controller instance = new Controller();
        instance.cadastrarPerfil();
    }

    /**
     * Test of visualizarPerfil method, of class Controller.
     */
    @Test
    public void testVisualizarPerfil() {
        System.out.println("visualizarPerfil");
        String input = "12345678998";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Controller instance = new Controller();
        instance.visualizarPerfil();
    }

    /**
     * Test of atualizarPerfil method, of class Controller.
     */
    @Test
    public void testAtualizarPerfil() {
        System.out.println("atualizarPerfil");
        String input = "12345678998";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Controller instance = new Controller();
        instance.atualizarPerfil();
    }

    /**
     * Test of deletarPerfil method, of class Controller.
     */
    @Test
    public void testDeletarPerfil() {
        System.out.println("deletarPerfil");
        String input = "12345678998";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Controller instance = new Controller();
        instance.deletarPerfil();
    }

}
