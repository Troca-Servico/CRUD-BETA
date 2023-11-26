/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mycompany.trocadeservicos.model.Cadastro;

public class DbCadastro {

    public void salvarCadastro(Cadastro cadastro) throws Exception {

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
}
