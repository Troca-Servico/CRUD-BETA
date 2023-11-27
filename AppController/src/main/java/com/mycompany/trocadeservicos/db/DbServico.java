/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.db;

import com.mycompany.trocadeservicos.model.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
}
