/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Classe DbServico é responsável por interagir com o banco de dados para operações relacionadas a serviços.
 */
package com.mycompany.trocadeservicos.db;

import com.mycompany.trocadeservicos.model.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.SQLException;

/**
 *
 * @author Yasmin
 */
public class DbServico {

    /**
     * Método para salvar um novo serviço no banco de dados.
     *
     * @param cadastro Objeto Servico contendo as informações do serviço a ser
     * cadastrado.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public void salvarCadastro(Servico cadastro) throws Exception {
        try {
            String sql = "insert into servicos (area, desc_serv, cidade, bairro, tempo_ex, cpf) values (?, ?, ?, ?,?,?)";
            Connection connect = new DbConnection().getConnection();
            try (PreparedStatement ps = connect.prepareStatement(sql)) {
                // Define os parâmetros na declaração SQL com base nas informações do serviço.
                ps.setString(1, cadastro.getArea());
                ps.setString(2, cadastro.getDescSer());
                ps.setString(3, cadastro.getCidade());
                ps.setString(4, cadastro.getBairro());
                ps.setString(5, cadastro.getTempoEx());
                ps.setString(6, cadastro.getCpf());
                // Executa a inserção no banco de dados.
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //System.exit();
        }
    }

    /**
     * Método para buscar serviços no banco de dados com base na área.
     *
     * @param areasel Área dos serviços a serem buscados.
     * @return Lista de objetos Servico contendo as informações dos serviços
     * encontrados.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public List<Servico> buscarServicos(String areasel) throws Exception {
        List<Servico> servicos = new ArrayList<>();

        try {
            String sql = "SELECT * FROM servicos WHERE area = ?";
            Connection connect = new DbConnection().getConnection();
            try (PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, areasel);
                try (ResultSet resultSet = ps.executeQuery()) {
                    while (resultSet.next()) {
                        // Extraindo os dados do ResultSet e criando um objeto Servico.
                        String area = resultSet.getString("area");
                        String descServ = resultSet.getString("desc_serv");
                        String cidade = resultSet.getString("cidade");
                        String bairro = resultSet.getString("bairro");
                        String tempoEx = resultSet.getString("tempo_ex");
                        String cpf = resultSet.getString("cpf");
                        String id = resultSet.getString("id");
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

    /**
     * Método para atualizar informações de um serviço no banco de dados.
     *
     * @param id Identificador único do serviço a ser atualizado.
     * @param campo Campo a ser atualizado (area, desc_serv, cidade, etc.).
     * @param atualizacao Novo valor a ser atribuído ao campo.
     * @return Mensagem indicando o resultado da operação.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public String atualizarServico(String id, String campo, String atualizacao) throws Exception {
        String retorno = ""; // Inicialize a variável retorno fora do try-catch para que possa ser acessada fora do escopo

        try {
            String sql = "UPDATE servicos SET " + campo + " = ? WHERE id = ?";
            try (Connection connect = new DbConnection().getConnection(); PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, atualizacao);
                ps.setString(2, id);

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
     * Método para listar serviços de um perfil no banco de dados com base no
     * CPF.
     *
     * @param cpfse CPF do perfil associado aos serviços.
     * @return Lista de mapas contendo informações dos serviços.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public List<Map<String, String>> listarServicos(String cpfse) throws Exception {
        List<Map<String, String>> infosList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM servicos WHERE cpf = ?";
            Connection connect = new DbConnection().getConnection();
            try (PreparedStatement ps = connect.prepareStatement(sql)) {
                ps.setString(1, cpfse);
                try (ResultSet resultSet = ps.executeQuery()) {
                    while (resultSet.next()) {
                        // Criando um mapa para armazenar informações do serviço.
                        Map<String, String> infos = new HashMap<>();
                        String area = resultSet.getString("area");
                        String descServ = resultSet.getString("desc_serv");
                        String id = resultSet.getString("id");
                        infos.put("id", id);
                        infos.put("area", area);
                        infos.put("descricao", descServ);
                        infosList.add(infos);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            // Trate a exceção conforme necessário
        }
        return infosList;
    }

    /**
     * Método para excluir um serviço do banco de dados com base no seu
     * identificador.
     *
     * @param id Identificador único do serviço a ser excluído.
     * @return Mensagem indicando o resultado da operação de exclusão.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public String deletarServico(String id) throws Exception {
        String retorno = "";
        try {
            // SQL para excluir um serviço do banco de dados com base no ID.
            String sql = "DELETE FROM servicos WHERE id = ?";
            try (Connection connect = new DbConnection().getConnection(); PreparedStatement ps = connect.prepareStatement(sql)) {
                // Configura o ID a ser excluído.
                ps.setString(1, id);
                // Executa a exclusão e verifica o número de linhas afetadas.
                int linhasAfetadas = ps.executeUpdate();
                if (linhasAfetadas > 0) {
                    retorno = "Exclusão realizada com sucesso!";
                } else {
                    retorno = "ID não identificado ou nenhum registro excluído.";
                }
            } catch (SQLException ex) {
                retorno = ex.getMessage(); // Em caso de erro SQL, captura a mensagem de erro.
            }
            return retorno;
        } catch (Exception e) {
            throw new Exception("Erro ao excluir perfil: " + e.getMessage());
        }
    }

    /**
     * Método para listar os serviços associados a um perfil no banco de dados
     * com base no CPF.
     *
     * @param cpfse CPF do perfil associado aos serviços.
     * @return Lista de mapas contendo informações dos serviços associados ao
     * perfil.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public List<Map<String, String>> listarPerfis(String cpfse) throws Exception {
        List<Map<String, String>> infosList = new ArrayList<>();

        try {
            // SQL para selecionar todos os perfis no banco de dados.
            String sql = "SELECT * FROM perfil";
            Connection connect = new DbConnection().getConnection();
            try (PreparedStatement ps = connect.prepareStatement(sql)) {
                try (ResultSet resultSet = ps.executeQuery()) {
                    // Iterar sobre os resultados do banco de dados.
                    while (resultSet.next()) {
                        // Criando um mapa para armazenar informações do perfil.
                        Map<String, String> infos = new HashMap<>();
                        String nome = resultSet.getString("nome");
                        String cidade = resultSet.getString("cidade");
                        String id = resultSet.getString("id");
                        infos.put("id", id);
                        infos.put("nome", nome);
                        infos.put("cidade", cidade);
                        infosList.add(infos);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            // Trate a exceção conforme necessário
        }
        return infosList;
    }

    /**
     * Método para avaliar um perfil no banco de dados, somando um valor
     * específico à sua avaliação existente.
     *
     * @param id Identificador único do perfil a ser avaliado.
     * @param valorASomar Valor a ser somado à avaliação atual do perfil.
     * @return Mensagem indicando o resultado da operação.
     * @throws Exception Exceção geral que pode ser lançada em caso de falha na
     * operação.
     */
    public String avaliarPerfil(String id, int valorASomar) throws Exception {
        String retorno = "";

        try {
            // Passo 1: Recuperar o valor atual do campo no banco
            String sqlSelect = "SELECT avaliacoes FROM perfil WHERE id = ?";
            try (Connection connect = new DbConnection().getConnection(); PreparedStatement psSelect = connect.prepareStatement(sqlSelect)) {
                psSelect.setString(1, id);

                try (ResultSet resultSet = psSelect.executeQuery()) {
                    if (resultSet.next()) {
                        int valorAtual = resultSet.getInt("avaliacoes");

                        // Passo 2: Somar o valor recebido ao valor atual
                        int novoValor = valorAtual + valorASomar;

                        // Passo 3: Atualizar o banco com o novo valor
                        String sqlUpdate = "UPDATE perfil SET avaliacoes = ? WHERE id = ?";
                        try (PreparedStatement psUpdate = connect.prepareStatement(sqlUpdate)) {
                            psUpdate.setInt(1, novoValor);
                            psUpdate.setString(2, id);

                            // Executar a atualização e verificar o número de linhas afetadas.
                            int linhasAfetadas = psUpdate.executeUpdate();

                            if (linhasAfetadas > 0) {
                                retorno = "Atualização realizada com sucesso!";
                            } else {
                                retorno = "Nenhum registro atualizado para o ID informado.";
                            }
                        }
                    } else {
                        retorno = "Nenhum registro encontrado para o ID informado.";
                    }
                }
            } catch (SQLException ex) {
                retorno = ex.getMessage();
            }

            return retorno;
        } catch (Exception e) {
            throw new Exception("Erro ao atualizar perfil: " + e.getMessage());
        }
    }

}
