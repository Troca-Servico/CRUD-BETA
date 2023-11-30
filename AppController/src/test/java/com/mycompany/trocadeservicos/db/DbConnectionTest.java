/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trocadeservicos.db;

import java.sql.Connection;
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
public class DbConnectionTest {

    public DbConnectionTest() {
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
     * Testa o método getConnection da classe DbConnection.
     *
     * Este teste cria uma instância de DbConnection e chama o método
     * getConnection para obter uma conexão com o banco de dados. Em seguida,
     * verifica se a conexão não é nula, indicando que a conexão foi
     * estabelecida com sucesso.
     *
     * @throws Exception Se ocorrer uma exceção durante a execução do teste.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
        DbConnection instance = new DbConnection();
        Connection result = instance.getConnection();
        assertNotNull(result);
    }

}
