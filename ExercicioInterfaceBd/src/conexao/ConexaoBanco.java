/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import exercicio.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Fernanda
 */
public class ConexaoBanco {

    static Connection connection = null;          //atributo do tipo Connection

    public static java.sql.Connection getConexaoMySQL() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String serverName = "127.0.0.1:3306";    //caminho do servidor do BD
            String mydatabase = "aula";        //nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC";
            String username = "root";        //nome de um usuário de seu BD
            String password = "Nanda02";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);

            //Testa sua conexão//
            if (connection != null) {
                System.out.println("STATUS--->Conectado com sucesso!");
            } else {
                System.out.println("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados." + e.getMessage());
            return null;
        }

    }

    //Método que fecha sua conexão//
    public static boolean getFecharConexao() {
        try {
            connection.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean insertBanco(Pessoa pessoa) {
        boolean retorno = false;
        try {
            String sql = "INSERT INTO pessoa ( nome, endereco, cidade, fone ) VALUES (?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getEndereco());
            ps.setString(3, pessoa.getCidade());
            ps.setString(4, pessoa.getFone());
            retorno = ps.execute();
        } catch (SQLException e) {
            System.out.println("Erro insert pessoa: " + e.getMessage());
        }
        return retorno;
    }

}
