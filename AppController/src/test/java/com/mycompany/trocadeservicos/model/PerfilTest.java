/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trocadeservicos.model;

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
public class PerfilTest {
    
    public PerfilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
   private Perfil instance;

    @Before
    public void setUp() {
        // Inicialize a instância antes de cada teste
        instance = new Perfil("Joao Marques", 22, "joao.marques@gmail.com", "74185296374",
                "Cozinheiro", "Contagem", "Linda Vista", "Moda", "2 anos", "foto.img", "Pratos saborosos");
    }
    @After
    public void tearDown() {
    }

    /**
     * Test of getCpf method, of class Perfil.
     */
     @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        String expResult = "12345678901";
        instance.setCpf(expResult);
        String result = instance.getCpf();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDescSer() {
        System.out.println("getDescSer");
        String expResult = "Descrição de teste";
        instance.setDescSer(expResult);
        String result = instance.getDescSer();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        String expResult = "Cidade Teste";
        instance.setCidade(expResult);
        String result = instance.getCidade();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAreasInteresse() {
        System.out.println("getAreasInteresse");
        String expResult = "Interesse1, Interesse2";
        instance.setAreasInteresse(expResult);
        String result = instance.getAreasInteresse();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        String expResult = "Bairro Teste";
        instance.setBairro(expResult);
        String result = instance.getBairro();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTempoEx() {
        System.out.println("getTempoEx");
        String expResult = "Experiência Teste";
        instance.setTempoEx(expResult);
        String result = instance.getTempoEx();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFtPerfil() {
        System.out.println("getFtPerfil");
        String expResult = "foto_teste.jpg";
        instance.setFtPerfil(expResult);
        String result = instance.getFtPerfil();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHabilidades() {
        System.out.println("getHabilidades");
        String expResult = "Habilidade1, Habilidade2";
        instance.setHabilidades(expResult);
        String result = instance.getHabilidades();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = "Nome Teste";
        instance.setNome(expResult);
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        int expResult = 30;
        instance.setIdade(expResult);
        int result = instance.getIdade();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "teste@gmail.com";
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }
    
}
