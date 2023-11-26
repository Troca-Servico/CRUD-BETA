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

public class DbPerfil {

    public void salvarCadastro(Perfil cadastro) throws Exception {

        try {
            String sql = "insert into perfil (nome, idade, cpf, email, desc_ser, cidade, areas_interesse,bairro, tempo_ex, ft_perfil, habilidades) values (?, ?, ?, ?,?,?,?,?,?,?,?)";
            Connection connect = new DbConnection().getConnection();
            try (PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, cadastro.getNome());
                ps.setInt(2, cadastro.getIdade());
                ps.setString(3, cadastro.getCpf());
                ps.setString(4, cadastro.getEmail());
                ps.setString(5, cadastro.getDescSer());
                ps.setString(6, cadastro.getCidade());
                ps.setString(7, cadastro.getAreasInteresse());
                ps.setString(8, cadastro.getBairro());
                ps.setString(9, cadastro.getTempoEx());
                ps.setString(10, cadastro.getFtPerfil());
                ps.setString(11, cadastro.getHabilidades());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //System.exit();
        }
    }

    public Perfil buscarPerfil(String cpf) throws Exception {
        try {
            String sql = "SELECT nome, idade, cpf, email, desc_ser, cidade, areas_interesse, bairro, tempo_ex, ft_perfil, habilidades FROM perfil WHERE cpf = ?";
            try (Connection connect = new DbConnection().getConnection(); PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, cpf);
                try (ResultSet resultSet = ps.executeQuery()) {
                    if (resultSet.next()) {
                        // Extraindo os dados do ResultSet
                        String nome = resultSet.getString("nome");
                        int idade = resultSet.getInt("idade");
                        String cpfResult = resultSet.getString("cpf");
                        String email = resultSet.getString("email");
                        String descSer = resultSet.getString("desc_ser");
                        String cidade = resultSet.getString("cidade");
                        String areasInteresse = resultSet.getString("areas_interesse");
                        String bairro = resultSet.getString("bairro");
                        String tempoEx = resultSet.getString("tempo_ex");
                        String ftPerfil = resultSet.getString("ft_perfil");
                        String habilidades = resultSet.getString("habilidades");
                        Perfil perfil = new Perfil(nome, idade, email, cpfResult, descSer, cidade, bairro, areasInteresse, tempoEx, ftPerfil, habilidades);
                        return perfil;
                    } else {
                        return null;
                        //System.out.println("Nenhum resultado encontrado para o CPF informado.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Apenas para debug, considere um tratamento mais apropriado
            throw new Exception("Erro ao buscar perfil: " + e.getMessage());
        }
    }

}
