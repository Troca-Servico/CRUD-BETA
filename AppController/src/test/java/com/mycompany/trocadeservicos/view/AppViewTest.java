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
     * Testa o método menuInicial da classe AppView.
     *
     * Este teste simula a entrada do usuário escolhendo a opção "1" no menu
     * inicial. A saída do método não é verificada neste exemplo, mas o teste
     * garante que o método pode ser executado sem lançar exceções.
     *
     * @throws Exception Se ocorrer uma exceção durante a execução do teste.
     */
    @Test
    public void testMenuInicial() throws Exception {
        System.out.println("menuInicial");
        // Configura a entrada do sistema com uma opção simulada ("1")
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        // Cria uma instância de AppView e chama o método menuInicial
        AppView instance = new AppView();
        instance.menuInicial();

    }

    /**
     * Testa o método mostraMsgInvalida da classe AppView.
     *
     * Este teste chama o método mostraMsgInvalida, que imprime uma mensagem na
     * saída padrão. A saída do método não é verificada neste exemplo, mas o
     * teste garante que o método pode ser executado sem lançar exceções.
     */
    @Test
    public void testMostraMsgInvalida() {
        System.out.println("mostraMsgInvalida");
        // Chama o método mostraMsgInvalida da classe AppView
        AppView.mostraMsgInvalida();

    }

    /**
     * Testa o método mensagemAlertaCadastro da classe AppView.
     *
     * Este teste simula a entrada do usuário fornecendo uma opção "1" e
     * verifica se o valor retornado pelo método é o esperado (1 neste caso).
     */
    @Test
    public void testMensagemAlertaCadastro() {
        System.out.println("mensagemAlertaCadastro");
        // Configura a entrada do sistema com uma opção simulada ("1")
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        // Chama o método mensagemAlertaCadastro da classe AppView
        System.setIn(in);
        int expResult = 1;
        int result = AppView.mensagemAlertaCadastro();
        // Verifica se o resultado é o esperado
        assertEquals(expResult, result);

    }

    /**
     * Testa o método naoProcederCadastro da classe AppView.
     *
     * Este teste chama o método naoProcederCadastro, que imprime uma mensagem
     * na saída padrão. A saída do método não é verificada neste exemplo, mas o
     * teste garante que o método pode ser executado sem lançar exceções.
     */
    @Test
    public void testNaoProcederCadastro() {
        System.out.println("naoProcederCadastro");
        // Chama o método naoProcederCadastro da classe AppView
        AppView.naoProcederCadastro();

    }

}
