/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trocadeservicos.db;

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
public class DbCadastroTest {
    

    /**
     * Test of salvarCadastro method, of class DbPerfil.
     */
    @Test
    public void testSalvarCadastro() throws Exception {
        System.out.println("salvarCadastro");
        String nome = "Cida";
        int idade = 40;
        String email = "cida@gmail.com";
        String cpf = "";
        DbPerfil instance = new DbPerfil();
        instance.salvarCadastro(nome, idade, email, cpf);
       
    }
    
}
