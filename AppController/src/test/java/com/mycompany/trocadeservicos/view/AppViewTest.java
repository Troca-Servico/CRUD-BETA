/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trocadeservicos.view;

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
public class AppViewTest {
    
    public AppViewTest() {
    }
    
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
     * Test of menuInicial method, of class AppView.
     */
    @Test
    public void testMenuInicial() throws Exception {
        System.out.println("menuInicial");
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        AppView instance = new AppView();
        instance.menuInicial();
        
    }

    /**
     * Test of mostraMsgInvalida method, of class AppView.
     */
    @Test
    public void testMostraMsgInvalida() {
        System.out.println("mostraMsgInvalida");
        AppView.mostraMsgInvalida();
        
    }

    /**
     * Test of mensagemAlertaCadastro method, of class AppView.
     */
    @Test
    public void testMensagemAlertaCadastro() {
        System.out.println("mensagemAlertaCadastro");
        int expResult =1;
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int result = AppView.mensagemAlertaCadastro();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of naoProcederCadastro method, of class AppView.
     */
    @Test
    public void testNaoProcederCadastro() {
        System.out.println("naoProcederCadastro");
        AppView.naoProcederCadastro();
       
    }
    
}
