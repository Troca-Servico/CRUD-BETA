/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trocadeservicos.controller;

import com.mycompany.trocadeservicos.model.Perfil;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gatin
 */
public class PerfilControllerTest {

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrar method, of class PerfilController.
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");

        // Criar uma instância de Perfil para passar como argumento
        Perfil cadastro = new Perfil("Nome", 25, "email@teste.com", "12345678901",
                "Descrição", "Cidade", "Bairro", "Interesse1, Interesse2",
                "2", "foto.img", "Habilidade1, Habilidade2");

        PerfilController instance = new PerfilController();
        instance.cadastrar(cadastro);

    }


    /**
     * Teste do método atualizar, da classe PerfilController.
     */
    @Test
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        int opcao = 3;
        String cpf = "12345678901";
        String input = "12345678998";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PerfilController instance = new PerfilController();
        instance.atualizar(opcao, cpf);
    }

    /**
     * Teste do método deletar, da classe PerfilController.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("deletar");
        String cpf = "12345678901";
        PerfilController instance = new PerfilController();
        instance.deletar(cpf);

    }

}