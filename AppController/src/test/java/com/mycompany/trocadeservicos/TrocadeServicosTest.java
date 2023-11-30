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
 *
 * @author gatin
 */
public class TrocadeServicosTest {

    public TrocadeServicosTest() {
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
     * Testa o método main da classe TrocadeServicos.
     *
     * Este teste simula a execução do programa fornecendo a entrada do usuário
     * como "7", que pode corresponder a uma opção específica no menu principal.
     * A saída do método não é verificada neste exemplo, mas o teste garante que
     * o método pode ser executado sem lançar exceções.
     *
     * @throws Exception Se ocorrer uma exceção durante a execução do teste.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        // Configura a entrada do sistema com uma opção simulada ("7")
        String[] args = null;
        String input = "7";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        // Chama o método main da classe TrocadeServicos
        TrocadeServicos.main(args);

    }

}
