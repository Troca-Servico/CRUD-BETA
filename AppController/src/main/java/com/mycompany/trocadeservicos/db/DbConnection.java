/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trocadeservicos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe DbConnection é responsável por estabelecer uma conexão com o banco de
 * dados.
 */
public class DbConnection {

    /**
     * Método para obter uma conexão com o banco de dados.
     *
     * @return Objeto Connection representando a conexão com o banco de dados.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * conexão.
     */
    public Connection getConnection() throws Exception {
        try {
            // Estabelece uma conexão com o banco de dados MySQL usando JDBC.
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/trocaservice", "root", "root");
        } catch (SQLException ex) {
            // Em caso de falha, imprime o erro no console.
            System.err.println(ex);
        }
        return null;// Retorna null se a conexão não puder ser estabelecida.
    }

    /*
    Foi realizado uma alteração de conecxão do bando de dados dos, de uma forma
    mais simplicicada, mas a forma de conecxão é a mesma coisa.
     */

 /*
    public static String status = "Não conectou...";
   public static Connection connection;// atributo do tipo Connection

    public static java.sql.Connection getConexaoMySQL() {
        try {
            // Carregando o JDBC Driver padrão
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);
            // Configurando a nossa conexão com um banco de dados//
            String serverName = "127.0.0.1"; // caminho do servidor do BD
            String mydatabase = "trocaservice"; // nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root"; // nome de um usuário de seu BD
            String password = ""; // sua senha de acesso
            connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;
        } catch (ClassNotFoundException e) { // Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }
    public static String statusConection() {
        return status;
    }
     */
}
