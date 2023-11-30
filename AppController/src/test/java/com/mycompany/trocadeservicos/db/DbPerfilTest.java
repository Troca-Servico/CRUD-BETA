/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trocadeservicos.db;

import com.mycompany.trocadeservicos.model.Perfil;
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
public class DbPerfilTest {

    public DbPerfilTest() {
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
     * Testa o ciclo completo de salvar, buscar, atualizar e deletar um perfil
     * usando a classe DbPerfil.
     *
     * Este teste realiza as seguintes etapas: 1. Salva um novo perfil no banco
     * de dados. 2. Busca o perfil recém-salvo usando o método buscarPerfil e
     * verifica se os dados correspondem ao perfil original. 3. Atualiza um
     * campo específico do perfil recém-salvo usando o método atualizarPerfil e
     * verifica se a atualização foi bem-sucedida. 4. Deleta o perfil
     * recém-salvo usando o método deletarPerfil e verifica se o perfil foi
     * removido corretamente.
     *
     * @throws Exception Se ocorrer uma exceção durante a execução do teste.
     */
    @Test
    public void testSalvarBuscarAtualizarDeletarPerfil() throws Exception {
        System.out.println("testSalvarBuscarAtualizarDeletarPerfil");

        //Passo 1: Testar o método salvarCadastro
        Perfil perfilCadastro = new Perfil("Teste", 30, "teste@gmail.com", "12345678901", "Descrição Teste", "Cidade Teste", "Bairro Teste", "Interesse1, Interesse2", "5", "foto_teste.jpg", "Habilidade1, Habilidade2");
        DbPerfil dbPerfil = new DbPerfil();
        dbPerfil.salvarCadastro(perfilCadastro);

        //Passo 2:  Testar o método buscarPerfil
        String cpf = "12345678901";
        Perfil perfilBuscado = dbPerfil.buscarPerfil(cpf);
        assertNotNull(perfilBuscado);
        assertEquals(perfilCadastro.getNome(), perfilBuscado.getNome());
        assertEquals(perfilCadastro.getIdade(), perfilBuscado.getIdade());
        assertEquals(perfilCadastro.getEmail(), perfilBuscado.getEmail());
        assertEquals(perfilCadastro.getCpf(), perfilBuscado.getCpf());
        assertEquals(perfilCadastro.getDescSer(), perfilBuscado.getDescSer());
        assertEquals(perfilCadastro.getCidade(), perfilBuscado.getCidade());
        assertEquals(perfilCadastro.getBairro(), perfilBuscado.getBairro());
        assertEquals(perfilCadastro.getAreasInteresse(), perfilBuscado.getAreasInteresse());
        assertEquals(perfilCadastro.getTempoEx(), perfilBuscado.getTempoEx());
        assertEquals(perfilCadastro.getFtPerfil(), perfilBuscado.getFtPerfil());
        assertEquals(perfilCadastro.getHabilidades(), perfilBuscado.getHabilidades());

        //Passo 3: Testar o método atualizarPerfil
        String novoNome = "Novo Nome";
        String campoAtualizacao = "nome";
        String mensagemAtualizar = dbPerfil.atualizarPerfil(cpf, campoAtualizacao, novoNome);
        assertEquals("Atualização realizada com sucesso!", mensagemAtualizar);

        // Verificar se o perfil foi atualizado corretamente
        perfilBuscado = dbPerfil.buscarPerfil(cpf);
        assertNotNull(perfilBuscado);
        assertEquals(novoNome, perfilBuscado.getNome());

        //Passo 4: Testar o método deletarPerfil
        String mensagemDeletar = dbPerfil.deletarPerfil(cpf);
        assertEquals("Exclusão realizada com sucesso!", mensagemDeletar);

        // Verificar se o perfil foi removido corretamente
        perfilBuscado = dbPerfil.buscarPerfil(cpf);
        assertNull(perfilBuscado);
    }
}
