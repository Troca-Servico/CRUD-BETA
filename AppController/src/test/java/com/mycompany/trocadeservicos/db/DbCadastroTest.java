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
<<<<<<< HEAD:AppController/src/test/java/com/mycompany/trocadeservicos/db/DbCadastroTest.java
     * Test of salvarCadastro method, of class DbPerfil.
=======
     * Test of salvarCadastro method, of class DbCadastro.
>>>>>>> 737c46096e75f90090be592341e81a9479c9d2ba:TrocadeServicos/src/test/java/com/mycompany/trocadeservicos/db/DbCadastroTest.java
     */
    @Test
    public void testSalvarCadastro() throws Exception {
        System.out.println("salvarCadastro");
        String nome = "Cida";
        int idade = 40;
        String email = "cida@gmail.com";
        String cpf = "";
<<<<<<< HEAD:AppController/src/test/java/com/mycompany/trocadeservicos/db/DbCadastroTest.java
        DbPerfil instance = new DbPerfil();
=======
        DbCadastro instance = new DbCadastro();
>>>>>>> 737c46096e75f90090be592341e81a9479c9d2ba:TrocadeServicos/src/test/java/com/mycompany/trocadeservicos/db/DbCadastroTest.java
        instance.salvarCadastro(nome, idade, email, cpf);
       
    }
    
}
