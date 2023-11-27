/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.db;

import com.mycompany.trocadeservicos.model.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Yasmin
 */
public class DbServico {

    public void salvarCadastro(Servico cadastro) throws Exception {
        try {
            String sql = "insert into servicos (area, desc_serv, cidade, bairro, tempo_ex, cpf) values (?, ?, ?, ?,?,?)";
            Connection connect = new DbConnection().getConnection();
            try (PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, cadastro.getArea());
                ps.setString(2, cadastro.getDescSer());
                ps.setString(3, cadastro.getCidade());
                ps.setString(4, cadastro.getBairro());
                ps.setString(5, cadastro.getTempoEx());
                ps.setString(6, cadastro.getCpf());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //System.exit();
        }
    }

    public List<Servico> buscarServicos(String areasel) throws Exception {
        List<Servico> servicos = new ArrayList<>();

        try {
            String sql = "SELECT * FROM servicos WHERE area = ?";
            Connection connect = new DbConnection().getConnection();
            try (PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, areasel);
                try (ResultSet resultSet = ps.executeQuery()) {
                    while (resultSet.next()) {
                        String area = resultSet.getString("area");
                        String descServ = resultSet.getString("desc_serv");
                        String cidade = resultSet.getString("cidade");
                        String bairro = resultSet.getString("bairro");
                        String tempoEx = resultSet.getString("tempo_ex");
                        String cpf = resultSet.getString("cpf");
                        Servico servico = new Servico(area, descServ, cidade, bairro, tempoEx, cpf);
                        servicos.add(servico);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            // Trate a exceção conforme necessário
        }
        return servicos;
    }

    public String atualizarServico(String cpf, String campo, String atualizacao) throws Exception {
        String retorno = ""; // Inicialize a variável retorno fora do try-catch para que possa ser acessada fora do escopo

        try {
            String sql = "UPDATE servicos SET " + campo + " = ? WHERE cpf = ?";
            try (Connection connect = new DbConnection().getConnection(); PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, atualizacao);
                ps.setString(2, cpf);

                // Executar a atualização
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
}
