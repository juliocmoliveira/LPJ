package br.com.projetoMVC.DAO;

import br.com.projetoMVC.model.ConnectionFactory;
import br.com.projetoMVC.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOImpl implements GenericDAO {

    private Connection connection;

    public ProdutoDAOImpl() throws Exception {
        try {
            this.connection = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!");
        } catch (Exception exception) {
            throw new Exception(exception.getMessage());
        }
    }

    @Override
    public List<Object> listarTodos() {
        List<Object> list = new ArrayList<>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM produto ORDER BY descricao";

        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Produto produto = new Produto();
                produto.setId(resultSet.getInt("id"));
                produto.setDescricao(resultSet.getString("descricao"));
                list.add(produto);
            }
        } catch (SQLException sqlException) {
            System.out.println("Problemas no DAO ao listar os produtos! Erro: " + sqlException.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(connection, preparedStatement, resultSet);
            } catch (Exception exception) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + exception.getMessage());
            }
        }
        return list;
    }

    @Override
    public Object listarPorId() {
        return null;
    }

    @Override
    public boolean cadastrar(Object object) {
        return false;
    }

    @Override
    public boolean alterar(Object object) {
        return false;
    }

    @Override
    public void excluir(int id) {

    }
}
