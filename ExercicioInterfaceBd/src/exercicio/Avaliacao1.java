/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import interfac.PessoaInterf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Fernanda
 */
public class Avaliacao1 {

    static Connection connection = null;

    public static void main(String[] args) {
        PessoaInterf pessoaInterf = new PessoaInterf();
        pessoaInterf.setVisible(true);
        /*Scanner teclado = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o id:");
        pessoa.setId(teclado.nextInt());
        System.out.println("Digite nome:");
        pessoa.setNome(teclado.next());
        System.out.println("Digite o endereco: ");
        pessoa.setEndereco(teclado.next());
        System.out.println("Digite a cidade:");
        pessoa.setCidade(teclado.next());
        System.out.println("Digite o fone:");
        pessoa.setFone(teclado.next());

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
        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados." + e.getMessage());
        }
        try {
            String sql = "INSERT INTO pessoa ( id, nome, endereco, cidade, fone ) VALUES (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pessoa.getId());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getEndereco());
            ps.setString(4, pessoa.getCidade());
            ps.setString(5, pessoa.getFone());
            ps.execute();
        } catch (SQLException e) {
            System.out.println("Erro insert: " + e.getMessage());
        }

        try {
            //SELECT
            String sqlSelect = "SELECT * FROM pessoa";
            PreparedStatement ps = connection.prepareStatement(sqlSelect);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("id");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                String cidade = rs.getString("cidade");
                String fone = rs.getString("fone");
                System.out.printf("Código - %d - Nome: %s - Endereco: %s - Cidade: %s - Fone: %s\n"
                        , codigo, nome, endereco, cidade, fone);
            }
        } catch (SQLException e) {
            System.out.println("Erro select: " + e.getMessage());
        }
        
        try{
             // UPDATE
            String sqlUpdate = "UPDATE pessoa SET nome=? WHERE id=?";
            PreparedStatement ps = connection.prepareStatement(sqlUpdate);
            ps.setString(1, "TESTE");
            ps.setInt(2, 1);
            //Executa a instrução
            int retorno = ps.executeUpdate();
            if (retorno > 0) {
                System.out.printf("Novo registro alterado");
            } else {
                System.out.println("Não foi possível alterar os registros!");
            }
            
        } catch (SQLException e) {
            System.out.println("Erro update: " + e.getMessage());
        }*/
    }

}
