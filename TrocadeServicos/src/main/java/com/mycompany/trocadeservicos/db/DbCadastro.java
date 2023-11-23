/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbCadastro {
     public void salvarCadastro(String nome, int idade, String email, String cpf) throws Exception {

        try {
            String sql = "insert into users (nome, idade, cpf, email) values (?, ?, ?, ?)";
            Connection connect = new DbConnection().getConnection();
            try (PreparedStatement ps = connect.prepareStatement(sql)){
                ps.setString(1, nome);
                ps.setInt(2, idade);
                ps.setString(3, cpf);
                ps.setString(4, email);
                ps.executeUpdate();
                
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //System.exit();
        }
    }
}
