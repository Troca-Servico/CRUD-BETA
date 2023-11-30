/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trocadeservicos.db;

import com.mycompany.trocadeservicos.model.Servico;
import java.util.List;
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
public class DbServicoTest {

    public DbServicoTest() {
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
     * Test of salvarCadastro method, of class DbServico.
     */
    @Test
    public void testSalvarCadastro() throws Exception {
        System.out.println("salvarCadastro");
        Servico cadastro = new Servico("AreaTeste", "DescTeste", "CidadeTeste", "BairroTeste", "TempoTeste", "12345678901");
        DbServico instance = new DbServico();
        instance.salvarCadastro(cadastro);

        // Adicione asserções conforme necessário para verificar o resultado do método
        // Por exemplo, você pode buscar o serviço do banco de dados e verificar se os dados correspondem
        List<Servico> result = instance.buscarServicos("AreaTeste");
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals("AreaTeste", result.get(0).getArea());
        assertEquals("DescTeste", result.get(0).getDescSer());
        assertEquals("CidadeTeste", result.get(0).getCidade());
        assertEquals("BairroTeste", result.get(0).getBairro());
        assertEquals("TempoTeste", result.get(0).getTempoEx());
        assertEquals("12345678901", result.get(0).getCpf());
    }

    /**
     * Testa o método buscarServicos da classe DbServico.
     *
     * Este teste realiza as seguintes etapas: 1. Configura a área desejada para
     * busca. 2. Adiciona dados ao banco de dados de teste usando o método
     * salvarCadastro. 3. Chama o método buscarServicos para obter uma lista de
     * serviços na área especificada. 4. Verifica se o resultado não é nulo, não
     * está vazio e contém os dados esperados.
     *
     * @throws Exception Se ocorrer uma exceção durante a execução do teste.
     */
    @Test
    public void testBuscarServicos() throws Exception {
        System.out.println("buscarServicos");
        // Passo 1: Configuração da área desejada para busca
        String areasel = "AreaTeste";  // Área que você espera encontrar
        DbServico instance = new DbServico();

        // Passo 2: Adição de alguns dados ao banco de dados para teste
        Servico cadastro = new Servico(areasel, "DescTeste", "CidadeTeste", "BairroTeste", "TempoTeste", "12345678901");
        instance.salvarCadastro(cadastro);

        // Passo 3: Chama o método buscarServicos para obter a lista de serviços na área especificada
        List<Servico> result = instance.buscarServicos(areasel);

       // Passo 4: Verificações para garantir que o resultado do método é conforme o esperado
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(areasel, result.get(0).getArea());
        assertEquals("DescTeste", result.get(0).getDescSer());
        assertEquals("CidadeTeste", result.get(0).getCidade());
        assertEquals("BairroTeste", result.get(0).getBairro());
        assertEquals("TempoTeste", result.get(0).getTempoEx());
        assertEquals("12345678901", result.get(0).getCpf());
    }

}
