/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import cidades.Cidade;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADM
 */
public class ClienteDAO {

    //Metodo Salvar para guardar as informações de nossos clientes
    public static void salvar(int codigo_cliente, String nome_cliente, String login_usuario, String cliente, String email, String telefone, String celular, String senha, String observacao, String nome_cidade, String estado) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");
                       
           PreparedStatement clt = conexao.prepareStatement("insert into clientes (codigo_cliente, nome_cliente, login_usuario, cliente, email, telefone, celular, senha, observacao,  nome_cidade, estado) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

            // clt = cliente  
            clt.setInt(1, codigo_cliente);
            clt.setString(2, nome_cliente);
            clt.setString(3,login_usuario);
            clt.setString(4, cliente);
            clt.setString(5, email);
            clt.setString(6, telefone);
            clt.setString(7, celular);
            clt.setString(8, senha);
            clt.setString(9, observacao);
            clt.setString(10, nome_cidade);
            clt.setString(11, estado);

            clt.executeUpdate();
            clt.close();
            conexao.close();
                       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Lista de Cliente
    public static ArrayList<Cliente> listar_cliente() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");

            PreparedStatement clt = conexao.prepareStatement("select * from clientes");
            //PreparedStatement clt = conexao.prepareStatement("select clientes.*, Cidades.nome_cidade as nomeCidade, cidades.estado as uf from clientes join cidades on clientes.codigo_cidade = cidades.codigo_cidade");
            // clt = cliente
            ResultSet rs = clt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.codigo_cliente = rs.getInt("codigo_cliente");
                cliente.nome_cliente = rs.getString("nome_cliente");
                cliente.login_usuario = rs.getString("login_usuario");
                cliente.cliente = rs.getString("cliente");
                cliente.email = rs.getString("email");
                cliente.telefone = rs.getString("telefone");
                cliente.celular = rs.getString("celular");
                cliente.senha = rs.getString("senha");
                cliente.observacao = rs.getString("observacao");
                cliente.nome_cidade = rs.getString("nome_cidade");
                cliente.estado = rs.getString("estado");

                //Cidade cidade = new Cidade();
               // cidade.nome_cidade = rs.getString("nomeCidade");
               // cidade.estado = rs.getString("uf");

               // cliente.cidade = cidade.nome_cidade;
                //cliente.cidade = cidade;

                clientes.add(cliente);
            }
            rs.close();
            clt.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public static Cliente login(String login_usuario, String senha) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");

            PreparedStatement clt = conexao.prepareStatement("select * from clientes where login_usuario = ? and senha = ?");

            clt.setString(1, login_usuario);
            clt.setString(2, senha);

            ResultSet rs = clt.executeQuery();

            if (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.codigo_cliente = rs.getInt("codigo_cliente");
                cliente.nome_cliente = rs.getString("login_usuario");
                // cliente.email = rs.getString("email");

                rs.close();
                clt.close();
                conexao.close();

                return cliente;

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Cliente buscar(int codigo_cliente) {

        try {

            Class.forName("org.postgresql.Driver");

            try {
                Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");
                PreparedStatement clt = conexao.prepareStatement("select * from clientes where codigo_cliente = ?");

                clt.setInt(1, codigo_cliente);
                ResultSet rs = clt.executeQuery();

                rs.next();

                Cliente cliente = new Cliente();
                cliente.codigo_cliente = rs.getInt("codigo_cliente");
                cliente.nome_cliente = rs.getString("nome_cliente");
                cliente.login_usuario = rs.getString("login_usuario");
                cliente.cliente = rs.getString("cliente");
                cliente.email = rs.getString("email");
                cliente.telefone = rs.getString("telefone");
                cliente.celular = rs.getString("celular");
                cliente.observacao = rs.getString("observacao");
                cliente.nome_cidade = rs.getString("nome_cidade");
                cliente.estado = rs.getString("estado");

                rs.close();
                clt.close();
                conexao.close();

                return cliente;

            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public static void atualizar(int codigo_cliente, String nome_cliente, String login_usuario, String cliente, String email, String telefone, String celular, String observacao, String nome_cidade, String estado){
        try {
            Class.forName("org.postgresql.Driver");
            try {
                Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");
                PreparedStatement clt = conexao.prepareStatement("update clientes set nome_cliente = ?, login_usuario = ?, cliente = ?, email = ?, telefone = ?, celular =?, observacao=?, nome_cidade=?, estado=? where codigo_cliente = ?");

                clt.setString(1, nome_cliente);
                clt.setString(2, login_usuario);
                clt.setString(3, cliente);
                clt.setString(4, email);
                clt.setString(5, telefone);
                clt.setString(6, celular);
                clt.setString(7, observacao);
                clt.setString(8, nome_cidade);
                clt.setString(9, estado);
                clt.setInt(10, codigo_cliente);

                clt.executeUpdate();  // utilizado para execultar  a atualizacao
                clt.close();         // feito para fechar a inclusao da pessoa momentaniamente para que possa ser alterado 
                conexao.close();    // feito para fechar a conexao com o banco para atualizar um novo cliente

            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void excluir(int codigo_cliente) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");
            PreparedStatement clt = conexao.prepareStatement("delete from clientes where codigo_cliente = ?");

            clt.setInt(1, codigo_cliente);
            clt.executeUpdate();

            clt.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
