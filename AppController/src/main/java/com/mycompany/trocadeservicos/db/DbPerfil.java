/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mycompany.trocadeservicos.model.Perfil;
import com.mycompany.trocadeservicos.view.PerfilView;

/**
 * Classe DbPerfil é responsável por interagir com o banco de dados para
 * operações relacionadas a perfis.
 */
public class DbPerfil {

    /**
     * Método para salvar um novo perfil no banco de dados.
     *
     * @param cadastro Objeto Perfil contendo as informações do perfil a ser
     * cadastrado.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public void salvarCadastro(Perfil cadastro) throws Exception {

        try {
            String sql = "insert into perfil (nome, sexo,idade, cpf, email, areas_interesse,ft_perfil, habilidades) values (?, ?, ?, ?,?,?,?,?)";
            Connection connect = new DbConnection().getConnection();
            try (PreparedStatement ps = connect.prepareStatement(sql)) {
                // Define os parâmetros na declaração SQL com base nas informações do perfil.
                ps.setString(1, cadastro.getNome());
                ps.setString(2, cadastro.getSexo());
                ps.setInt(3, cadastro.getIdade());
                ps.setString(4, cadastro.getCpf());
                ps.setString(5, cadastro.getEmail());
                ps.setString(6, cadastro.getAreasInteresse());
                ps.setString(7, cadastro.getFtPerfil());
                ps.setString(8, cadastro.getHabilidades());
                // Executa a inserção no banco de dados.
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //System.exit();
        }
    }

    /**
     * Método para buscar um perfil no banco de dados com base no CPF.
     *
     * @param cpf CPF do perfil a ser buscado.
     * @return Objeto Perfil contendo as informações do perfil encontrado, ou
     * null se não houver resultado.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public Perfil buscarPerfil(String cpf) throws Exception {
        try {
            String sql = "SELECT nome, sexo,idade, cpf, email, areas_interesse, ft_perfil, habilidades FROM perfil WHERE cpf = ?";
            try (Connection connect = new DbConnection().getConnection(); PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, cpf);
                try (ResultSet resultSet = ps.executeQuery()) {
                    if (resultSet.next()) {
                        // Extraindo os dados do ResultSet
                        String nome = resultSet.getString("nome");
                        String sexo = resultSet.getString("sexo");
                        int idade = resultSet.getInt("idade");
                        String cpfResult = resultSet.getString("cpf");
                        String email = resultSet.getString("email");
                        String areasInteresse = resultSet.getString("areas_interesse");
                        String ftPerfil = resultSet.getString("ft_perfil");
                        String habilidades = resultSet.getString("habilidades");
                        Perfil perfil = new Perfil(nome, sexo, idade, email, cpfResult, areasInteresse, ftPerfil, habilidades);
                        return perfil;
                    } else {
                        throw new Exception("Erro ao buscar perfil: PERFIL NAO LOCALIZADO");
                        //System.out.println("Nenhum resultado encontrado para o CPF informado.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Apenas para debug, considere um tratamento mais apropriado
            throw new Exception("Erro ao buscar perfil: " + e.getMessage());
        }
    }

    /**
     * Método para atualizar informações de um perfil no banco de dados.
     *
     * @param cpf CPF do perfil a ser atualizado.
     * @param campo Campo a ser atualizado (nome, idade, email, etc.).
     * @param atualizacao Novo valor a ser atribuído ao campo.
     * @return Mensagem indicando o resultado da operação.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public String atualizarPerfil(String cpf, String campo, String atualizacao) throws Exception {
        String retorno = ""; // Inicialize a variável retorno fora do try-catch para que possa ser acessada fora do escopo

        try {
            String sql = "UPDATE perfil SET " + campo + " = ? WHERE cpf = ?";
            try (Connection connect = new DbConnection().getConnection(); PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, atualizacao);
                ps.setString(2, cpf);

                // Executar a atualização e verificar o número de linhas afetadas.
                int linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0) {
                    retorno = "Atualização realizada com sucesso!";
                } else {
                    retorno = "Nenhum registro atualizado para o CPF informado.";
                }
            } catch (SQLException ex) {
                retorno = ex.getMessage();
            }
            return retorno; // Mova o retorno para fora do try-catch para que seja acessível em todo o método
        } catch (Exception e) {
            throw new Exception("Erro ao atualizar perfil: " + e.getMessage());
        }
    }

    /**
     * Método para deletar um perfil do banco de dados com base no CPF.
     *
     * @param cpf CPF do perfil a ser deletado.
     * @return Mensagem indicando o resultado da operação.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public String deletarPerfil(String cpf) throws Exception {
        String retorno = "";
        try {
            String sql = "DELETE FROM perfil WHERE cpf = ?";
            try (Connection connect = new DbConnection().getConnection(); PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, cpf);

                // Executar a exclusão e verificar o número de linhas afetadas
                int linhasAfetadas = ps.executeUpdate();
                if (linhasAfetadas > 0) {
                    retorno = "Exclusão realizada com sucesso!";
                } else {
                    retorno = "Nenhum registro excluído para o CPF informado.";
                }
            } catch (SQLException ex) {
                retorno = ex.getMessage();
            }
            return retorno;
        } catch (Exception e) {
            throw new Exception("Erro ao excluir perfil: " + e.getMessage());
        }
    }
}
