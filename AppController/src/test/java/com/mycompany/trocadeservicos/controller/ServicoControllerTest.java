/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.model.Servico;
import java.io.ByteArrayInputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 *
 * @author gatin
 */
public class ServicoControllerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    /**
     * Test of cadastrar method, of class ServicoController.
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        Servico cadastro = new Servico("Área", "Descrição", "Cidade", "Bairro", "Tempo", "CPF");
        ServicoController instance = new ServicoController();
        instance.cadastrar(cadastro);
    }

    /**
     * Test of visualizar method, of class ServicoController.
     */
    @Test
    public void testVisualizar() throws Exception {
        System.out.println("testVisualizar");

        // Dados de exemplo para inserir no banco de dados de teste
        Servico cadastro1 = new Servico("Área1", "Descrição1", "Cidade1", "Bairro1", "Tempo1", "CPF1");
        Servico cadastro2 = new Servico("Área1", "Descrição2", "Cidade2", "Bairro2", "Tempo2", "CPF2");

        // Cadastrar os dados de exemplo no banco de dados de teste
        ServicoController controller = new ServicoController();
        controller.cadastrar(cadastro1);
        controller.cadastrar(cadastro2);

        // Redefinir a saída padrão para capturar a saída do método visualizar
        System.setOut(new PrintStream(outContent));

        // Testar o método visualizar com a área correta
        String area = "Área1";
        controller.visualizar(area);

    }

    /**
     * Test of deletar method, of class ServicoController.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("testDeletar");

        // Dados de exemplo para inserir no banco de dados de teste
        Servico cadastro = new Servico("Área", "Descrição", "Cidade", "Bairro", "Tempo", "CPF");
        ServicoController controller = new ServicoController();
        controller.cadastrar(cadastro);

        // Simular a entrada do usuário para o teste de deletar
        System.setIn(new ByteArrayInputStream("ID_DO_SERVICO\n".getBytes()));

        // Testar o método deletar
        controller.deletar("CPF");

        // Restaurar a entrada padrão
        System.setIn(System.in);
    }

    /**
     * Test of atualizar method, of class ServicoController.
     */
    @Test
    public void testAtualizar() throws Exception {
        System.out.println("testAtualizar");

        // Dados de exemplo para inserir no banco de dados de teste
        Servico cadastro = new Servico("Área", "Descrição", "Cidade", "Bairro", "Tempo", "CPF");
        ServicoController controller = new ServicoController();
        controller.cadastrar(cadastro);

        // Simular a entrada do usuário para o teste de atualizar
        System.setIn(new ByteArrayInputStream("ID_DO_SERVICO\nNOVA_ATUALIZACAO\n".getBytes()));

        // Testar o método atualizar
        controller.atualizar(1, "CPF");

        // Restaurar a entrada padrão
        System.setIn(System.in);
    }

}
