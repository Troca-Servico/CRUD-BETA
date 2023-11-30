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

    /**
     * Configuração inicial para cada teste da classe Perfil. Cria uma instância
     * de Perfil (instance) antes de cada teste, com dados padrão.
     */
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
     * Testa o método getCpf da classe Perfil.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        // Configuração do valor esperado
        String expResult = "12345678901";
        // Chama o método setCpf e, em seguida, o método getCpf para verificar o resultado
        instance.setCpf(expResult);
        String result = instance.getCpf();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

    /**
     * Testa o método getDescSer da classe Perfil.
     */
    @Test
    public void testGetDescSer() {
        System.out.println("getDescSer");
        String expResult = "Descrição de teste";
        // Chama o método setDescSer e, em seguida, o método getDescSer para verificar o resultado
        instance.setDescSer(expResult);
        String result = instance.getDescSer();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

    /**
     * Testa o método getCidade da classe Perfil.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        String expResult = "Cidade Teste";
        // Chama o método setCidade e, em seguida, o método getCidade para verificar o resultado 
        instance.setCidade(expResult);
        String result = instance.getCidade();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

    /**
     * Testa o método getAreasInteresse da classe Perfil.
     */
    @Test
    public void testGetAreasInteresse() {
        System.out.println("getAreasInteresse");
        String expResult = "Interesse1, Interesse2";
        // Chama o método setAreasInteresse e, em seguida, o método getAreasInteresse para verificar o resultado
        instance.setAreasInteresse(expResult);
        String result = instance.getAreasInteresse();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

    /**
     * Testa o método getBairro da classe Perfil.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        String expResult = "Bairro Teste";
        // Chama o método setBairro e, em seguida, o método getBairro para verificar o resultado
        instance.setBairro(expResult);
        String result = instance.getBairro();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

    /**
     * Testa o método getTempoEx da classe Perfil.
     */
    @Test
    public void testGetTempoEx() {
        System.out.println("getTempoEx");
        String expResult = "Experiência Teste";
        // Chama o método setTempoEx e, em seguida, o método getTempoEx para verificar o resultado
        instance.setTempoEx(expResult);
        String result = instance.getTempoEx();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

    /**
     * Testa o método getFtPerfil da classe Perfil.
     */
    @Test
    public void testGetFtPerfil() {
        System.out.println("getFtPerfil");
        String expResult = "foto_teste.jpg";
        // Chama o método setFtPerfil e, em seguida, o método getFtPerfil para verificar o resultado
        instance.setFtPerfil(expResult);
        String result = instance.getFtPerfil();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

    /**
     * Testa o método getHabilidades da classe Perfil.
     */
    @Test
    public void testGetHabilidades() {
        System.out.println("getHabilidades");
        String expResult = "Habilidade1, Habilidade2";
        // Chama o método setHabilidades e, em seguida, o método getHabilidades para verificar o resultado
        instance.setHabilidades(expResult);
        String result = instance.getHabilidades();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

    /**
     * Testa o método getNome da classe Perfil.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = "Nome Teste";
        // Chama o método setNome e, em seguida, o método getNome para verificar o resultado
        instance.setNome(expResult);
        String result = instance.getNome();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

    /**
     * Testa o método getIdade da classe Perfil.
     */
    @Test
    public void testGetIdade() {
        System.out.println("getIdade");
        int expResult = 30;
        instance.setIdade(expResult);
        // Chama o método setIdade e, em seguida, o método getIdade para verificar o resultado
        int result = instance.getIdade();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

    /**
     * Testa o método getEmail da classe Perfil.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "teste@gmail.com";
        // Chama o método setEmail e, em seguida, o método getEmail para verificar o resultado
        instance.setEmail(expResult);
        instance.setEmail(expResult);
        String result = instance.getEmail();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);
    }

}
